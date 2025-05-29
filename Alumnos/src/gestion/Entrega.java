package gestion;

import java.time.LocalDate;

public class Entrega {
	private Alumno alumno;
	private LocalDate fecha;
	private String tipo;
	public Entrega() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Entrega(Alumno alumno, LocalDate fecha, String tipo) {
		super();
		this.alumno = alumno;
		this.fecha = fecha;
		this.tipo = tipo;
	}
	public Alumno getAlumno() {
		return alumno;
	}
	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	@Override
	public String toString() {
		return "Entrega [alumno=" + alumno + ", fecha=" + fecha + ", tipo=" + tipo + "]";
	}
	
	
}
