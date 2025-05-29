package gestion;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.ArrayList;

public class AccesoFicheros {

	private String fAlumno  = "alumnos.txt";
	private String fEntrega  = "entregas.txt";

	public AccesoFicheros() {
		super();
	}
	
	public ArrayList<Alumno> cargarAlumnos() {
		 ArrayList<Alumno> resultado = new ArrayList<Alumno>();
		 
		 try(BufferedReader f = new BufferedReader(new FileReader(fAlumno))) {
			 String linea;
			 while((linea = f .readLine())!=null) {
				 String[] datosAl = linea.split(";");
 				 //CREAR UN ALUMNO A PARTIR DE LOS DATOS DE LINEA
				 int nE = Integer.parseInt(datosAl[0]);
				 String nombre = datosAl[1];
				 boolean baja = Boolean.parseBoolean(datosAl[2]);
				  Alumno a = new Alumno(nE, nombre);
				  resultado.add(a);
				  a.setBaja(false);
				 
			 }
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		 return resultado;
	}
	public ArrayList<Entrega> cargarEntregas() {
		 ArrayList<Entrega> resultado = new ArrayList<Entrega>();
		 
		 try(BufferedReader f = new BufferedReader(new FileReader(fEntrega))) {
			 String linea;
			 while((linea = f .readLine())!=null) {
				 String[] datosE = linea.split(";");
				 int alumno = Integer.parseInt(datosE[0]);
				 Alumno al = new Alumno(alumno,null);
				 String tipo = datosE[2];
				 DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
				 LocalDate fecha = LocalDate.parse(datosE[1]);
				 if(tipo.equalsIgnoreCase("T")) {
					String calif = datosE[3];
					String asig = datosE[4];	
					Tarea t = new Tarea(al,fecha,tipo,asig,calif);
					resultado.add(t);
				 }
				 else {
					 if(tipo.equalsIgnoreCase("E")) {
						 float calif = Float.parseFloat(datosE[4]);
						 String asig = datosE[3];
						 Examen e = new Examen(al,fecha,tipo,asig,calif);
						 resultado.add(e);

					 }
				 }
				 
			 }
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		 return resultado;
	}
	
	
}
