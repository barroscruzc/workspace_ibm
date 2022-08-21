
public class Time {

	private int hora;
	private int minuto;
	private int segundo;
	
	public Time(int hora, int minuto, int segundo) {
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;
	}
	
	public Time(int hora, int minuto) {
		this.hora = hora;
		this.minuto = minuto; 
		this.segundo = 0;
		}
	
	public Time(int hora) {
		this.hora = hora;
		this.minuto = 0;
		this.segundo = 0;
	}
	
	public void setTime(int hora, int minuto, int segundo) {
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;
	}
	
	public void setTime(int hora, int minuto) {
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = 0;
	}
	
	public void setTime(int hora) {
		this.hora = hora;
		this.minuto = 0;
		this.segundo = 0;
	}
	
	public String exibirHoraUniversal() {
		return this.hora + ":" + this.minuto + ":" + this.segundo;
	}
	
	public String exibirHoraPadrao() {
		/* 4 casos:
		 * 0h - 12AM
		 * 12h - 12PM
		 * 01-11 - hora AM
		 * 13-23 - (hora - 12) PM
		 */
		String sufixo;
		String horaPadrao;
		if (hora == 0) {
			horaPadrao = String.valueOf(12);
			sufixo = "AM";
		} 
		else if (hora == 12) {
			horaPadrao = String.valueOf(12);
			sufixo = "PM";
		}
		else if (hora > 0 && hora < 12) {
			horaPadrao = String.valueOf(hora);
			sufixo = "AM";
		}
		else {
			horaPadrao = String.valueOf(hora - 12);
			sufixo = "PM";
		}
		return horaPadrao + ":" + this.minuto + ":" + this.segundo + sufixo;
	}
}
