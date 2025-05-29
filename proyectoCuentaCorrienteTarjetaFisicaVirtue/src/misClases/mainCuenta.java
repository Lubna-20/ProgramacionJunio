package misClases;

import java.util.ArrayList;
import java.util.Scanner;

public class mainCuenta {
	

	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static void menu() {
		do {
		 	System.out.println("1. Crear Cuenta Corriente");
			System.out.println("2. Crear Tarjeta");
			System.out.println("3. Salir");
			System.out.print("Seleccione una opción: ");
			
			int opcion = sc.nextInt();
			sc.nextLine(); // Limpiar el buffer
			
			switch (opcion) {
				case 1:
					crearCuentaCorriente();
					break;
				case 2:
					crearTarjeta();
					break;
				case 3:
					System.out.println("Saliendo...");
					return;
				default:
					System.out.println("Opción no válida, intente de nuevo.");
			}
		} while (true);
		
		
		
	}

}
