package proyectoSolar;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

//ES ABSTRACTA PORQUE NO SE INSTANCIA DIRECTAMENTE
//Y LOS METODOS NO VAN A TENER CONTENIDO Y SE IMPLEMENTAN 
//EN LA SUBCLASE
public abstract class Energia {
	protected String tipo;
    protected int id;
    protected String planta;
    protected double capacidad;
    protected LocalDate fecha;
	public Energia(int id, String planta, double capacidad, LocalDate fecha) {
		super();
		this.id = id;
		this.planta = planta;
		this.capacidad = capacidad;
		this.fecha = fecha;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPlanta() {
		return planta;
	}
	public void setPlanta(String planta) {
		this.planta = planta;
	}
	public double getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(double capacidad) {
		this.capacidad = capacidad;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	
	public long diasTranscurridos() {
		return  ChronoUnit.DAYS.between(fecha, fecha.now()); 	
	}
	

}
