package gestion;

import java.util.ArrayList;
import java.util.Scanner;

public class mainPrincipal {

	static Scanner t = new Scanner(System.in);
	static ArrayList<Alumno> alumnos;
	static AccesoFicheros datos = new AccesoFicheros();
	
	public static void main(String[] args) {
	
		
	int opcion;
	
	do {
		System.out.println("0-Salir");
		System.out.println("1-Cargar alumnos");
		System.out.println("2-Introduce opcion");
		System.out.println("3-Cargar entregas");
		opcion = t.nextInt();
		t.nextLine();

		switch (opcion) {
		case 1:
			cargarAlumnos();
			break;
		case 2:
			mostrarAlumnos();
			break;
		case 3:
			cargarEntregas();
			break;
		}
	} while (opcion!=0);
	
	}
	private static void cargarEntregas() {
		if(alumnos!=0) {
			ArrayList<Entrega> e = datos.cargarEntregas();
			System.out.println("Entregas cargadas: ");
			for(Entrega e:entregas) {
				System.out.println(e);
			}
			for(Alumno a:alumnos) {
				for(Entrega e:entregas) {
					if(a.getExpediente()==e.getAlumno().getExpediente()) {
						a.getEntregas().add(e);
					}
				}
			}
		}
	}
	private static void mostrarAlumnos() {
		if(alumnos!=0) {
			for(Alumno a:alumnos) {
				System.out.println(a);
			}
		}
	}
	private static void cargarAlumnos() {
		//Cargar alumnos de fichero
		alumnos = datos.cargarAlumnos();		
		datos.cargarAlumnos();
		
	}
}
