-- Criando o database
create database ibm;

-- Pondo em uso o database
use ibm;

-- criando a tabela dentro do database
create table clientes (
id_cliente int not null auto_increment primary key,
nome_cliente varchar(50) not null,
email_cliente varchar(80) not null,
whats_cliente char(11) not null);

-- vendo a estrutura da tabela cliente
describe clientes;

-- inserindo registro na nossa tabela
insert into clientes 
(nome_cliente, email_cliente, whats_cliente)
values
("Cristhiane Barros", "cris@ibm.com.br", "21999999999");

-- outra forma para inserir registros em uma tabela (obrigatoriamente os campos devem estar na ordem correta)
insert into clientes
values
(null, "Eduardo Vianan", "eduardo@tormene.com.br", "21999999999");

-- visualizando as informações do nosso campo de dados
select * from clientes;
select nome_cliente, whats_cliente from clientes;

-- visualizando as informações da nossa tabela com condições
select * from clientes where id_cliente=2;

-- visualizando registros com like % para campos do tipo texto
select * from clientes where nome_cliente like "cris%";
select * from clientes where nome_cliente like "%barros%";

-- visualizando os registros por uma ordem específica
select * from clientes order by nome_cliente; -- asc para ascendente(A-Z) e desc para descendente(Z-A)
select * from clientes order by whats_cliente;

-- inserindo um novo campo na nossa tabela do banco de dados
alter table clientes add idade_cliente int not null;
-- removendo um campo da estrutura da nossa tabela
alter table clientes drop idade_cliente;
-- renomear o nome de uma coluna da tabela
alter table clientes rename column idade_cliente to idade;  

-- atualizando o conteúdo de um ou mais campos na tabela
update clientes set idade=27 where id_cliente=1;
update clientes set idade=28, email_cliente="vianna@tormene.com.br" where id_cliente=2;

-- criando um backup da nossa base de dados
create table clientes_bck select * from clientes;
select * from clientes_bck;
select * from clientes;
-- excluindo um registro da nossa base de dados
delete from clientes;
use ibm; 
-- restaurando um backup
insert into clientes (id_cliente, nome_cliente, email_cliente, whats_cliente, idade) -- seleciona todos os registros do backup
select id_cliente, nome_cliente, email_cliente, whats_cliente, idade from clientes_bck; -- para cada registro encontrado, insere na tabela clientes

-- retornando a quantidade de registros na estrutura de uma tabela
select count(*) as total_registro from clientes;

-- Chaves primárias (primary key - pk) e secundárias (foreign key - fk)

create table produtos (
id_produto int not null auto_increment,
nome_produto varchar(50)  not null,
qtd_produto int not null,
cod_marca int not null,
primary key(id_produto));

describe produtos;

create table marcas (
id_marca int not null auto_increment primary key,
nome_marca varchar(50));

insert into marcas value (null, "Brastemp"), (null, "Wallita"), (null, "Samsung");
-- apagando registro com where e a clausula in para determinar uma faixa
delete from marcas where id_marca in (4, 5, 6);
select * from marcas;

insert into produtos 
values 
(null, "Geladeira", 10, 1), 
(null, "Fogão", 15, 1),
(null, "Batedeira", 100, 3);
select * from produtos;

-- inner join: pesquisar vinculando os campos da nossa tabela
select p.nome_produto, p.qtd_produto, p.cod_marca, m.id_marca, m.nome_marca
from produtos as p
inner join marcas as m on(p.cod_marca=m.id_marca);

-- outra possibilidade, mas mais lenta
select p.nome_produto, p.qtd_produto, p.cod_marca, m.id_marca, m.nome_marca
from produtos as p, marcas as m where (p.cod_marca=m.id_marca);

-- somando todos os valores encontrados em um campo da tabela
select sum(qtd_produto) as total from produtos;

-- calculando valores da nossa tabela
-- gera uma coluna com o dado real e uma coluna com dado alterado(imaginário)
select nome_produto, qtd_produto, (qtd_produto+10) as novo_estoque from produtos;

