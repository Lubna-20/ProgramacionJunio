package misClases;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class CalcularNominas {

	public static void main(String[] args) {

		ArrayList<ClaseEmpleado> listaEmpleados = new ArrayList<>();
		try {
			FileReader fr = new FileReader("empleados.csv");
			BufferedReader br = new BufferedReader(fr);
			String lineas;
			br.readLine();
			while ((lineas = br.readLine()) != null) {
				System.out.println(lineas);
				String[] datosempleado = lineas.split(",");
				String nombre = datosempleado[0];
				String apellido = datosempleado[1];
				String cargo = datosempleado[2];
				String modalidad = datosempleado[3];
				int hora = Integer.parseInt(datosempleado[4]);
				double pagoHoras = Double.parseDouble(datosempleado[5]);

				ClaseEmpleado objEmpleado = new ClaseEmpleado(nombre, apellido, cargo, modalidad, hora, pagoHoras);
				listaEmpleados.add(objEmpleado);

			}
		} catch (FileNotFoundException e) {
			System.out.println("error en la apertura del fichero");
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("error en el formato del fichero");
		}
		int contadorOperarios = 0;
		int contadorJefes = 0;
		int contadorSueldos = 0;

		for (ClaseEmpleado empleado : listaEmpleados) {
			// Calcular nomina y mostrar en pantalla
			empleado.mostrarInfo();
			// Contar operarios
			if (empleado.getCargo().toLowerCase().equals("operario")) {
				contadorOperarios++;
			}
			if (empleado.getCargo().toLowerCase().equals("jefe")) {
				contadorJefes++;
			}
			// CONTAR SUELDOS MENOS DE 1200 EUROS
			double sueldo = empleado.carcularNomina();
			if (sueldo < 1200) {
				System.out.println("El sueldo de " + empleado.getNombre() + " es menor a 1200 euros");
			}
			// Cantidad de empleados que ganan entre 1200.00 € y 2500.00 €
			if (sueldo >= 1200 && sueldo <= 2500) {
				contadorSueldos++;
			}
			// Cantidad de empleados que ganas más de 2500.00 €
			if (sueldo > 2500) {
				System.out.println("El sueldo de " + empleado.getNombre() + " es mayor a 2500 euros");
			}
		}
		System.out.println("ESTADISTICA DE EMPLEADOS");
		System.out.println("El numero de operarios es: " + contadorOperarios);
		System.out.println("Total Jefes: " + (listaEmpleados.size() - contadorOperarios));
		System.out.println("El numero de empleados con sueldo menor a 1200 euros es: " + contadorSueldos);
		System.out.println("El numero de empleados con sueldo mayor a 2500 euros es: "
				+ (listaEmpleados.size() - contadorSueldos));
		System.out.println("El numero de empleados con sueldo entre 1200 y 2500 euros es: " + contadorSueldos);
		System.out.println("El numero de empleados con sueldo menor a 1200 euros es: " + contadorSueldos);

		cargarFichero_CSV_estadisticas(listaEmpleados, "estadistica.csv");
		cargarFichero_CSV_Nominas(listaEmpleados, "nominas.csv");

	}

	private static void cargarFichero_CSV_Nominas(ArrayList<ClaseEmpleado> listaEmpleados, String string) {
		String fNomina;
				FileWriter fw = new FileWriter(fNomina);
	}

	private static void cargarFichero_CSV_estadisticas(ArrayList<ClaseEmpleado> listaEmpleados, String string) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'cargarFichero_CSV_estadisticas'");
	}

}
