package gestion;

import java.time.LocalDate;

public class Tarea  extends Entrega{

	private String calificaion;
	private String medio;
	

	public Tarea(Alumno alumno, LocalDate fecha, String tipo, String calificaion, String medio) {
		super(alumno, fecha, tipo);
		this.calificaion = calificaion;
		this.medio = medio;
	}
	public Tarea() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Tarea(Alumno alumno, LocalDate fecha, String tipo) {
		super(alumno, fecha, tipo);
		// TODO Auto-generated constructor stub
	}
	public String getCalificaion() {
		return calificaion;
	}
	public void setCalificaion(String calificaion) {
		this.calificaion = calificaion;
	}
	public String getMedio() {
		return medio;
	}
	public void setMedio(String medio) {
		this.medio = medio;
	}
	@Override
	public String toString() {
		return super.toString()+"Tarea [calificaion=" + calificaion + ", medio=" + medio + "]";
	}
	
	

}
