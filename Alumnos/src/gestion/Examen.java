package gestion;

import java.time.LocalDate;

public class Examen extends Entrega {


	private String asignatura;
	private float calificacion;

	
	public Examen() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Examen(Alumno alumno, LocalDate fecha, String tipo, String asignatura, float calificacion) {
		super(alumno, fecha, tipo);
		this.asignatura = asignatura;
		this.calificacion = calificacion;
	}
	public String getAsignatura() {
		return asignatura;
	}
	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}
	public float getCalificacion() {
		return calificacion;
	}
	public void setCalificacion(float calificacion) {
		this.calificacion = calificacion;
	}
	
	@Override
	public String toString() {
		return super.toString()+"Examen [asignatura=" + asignatura + ", nota=" + calificacion + "]";
	}
	
}
