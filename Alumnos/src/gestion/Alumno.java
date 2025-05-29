package gestion;

import java.util.ArrayList;

public class Alumno {

	private int expediente;
	private String nombre;
	private ArrayList<Entrega> entregas = new ArrayList<Entrega>();
	private boolean baja;

	public Alumno(int expediente, String nombre) {
		super();
		this.expediente = expediente;
		this.nombre = nombre;
	}

	public Alumno() {
		super();
	}

	public int getExpediente() {
		return expediente;
	}

	public void setExpediente(int expediente) {
		this.expediente = expediente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Entrega> getEntregas() {
		return entregas;
	}

	public void setEntregas(ArrayList<Entrega> entregas) {
		this.entregas = entregas;
	}

	public boolean isBaja() {
		return baja;
	}

	public void setBaja(boolean baja) {
		this.baja = baja;
	}

	@Override
	public String toString() {
		String resultado=  "Alumno [expediente=" + expediente + ", nombre=" + nombre + ", entregas=" + entregas + ", baja=" + baja
				+ "]";

		for(Entrega e:entregas) {
			resultado+="\nEntrega"+e;
		}
		return resultado;
		
	}
	
	public int notaFinal() {
		//Media de los examenes y se suma 1 punto si todas las 
		//tareas son aptas
		//Si una tarea no es apta o hay algun examen suspenso
		//habra que restar 5 a la nota final 
		return 0;
		
	}

}
