package misClases;

import java.util.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class main {

	public static Scanner sc = new Scanner(System.in);
	public static Map<Integer,Ropa> mapa = new HashMap<>();
	public static String tallas[]= {"xs","s","m","l","xl"};
	
	public static void main(String[] args) {
		
		cargarInventario();
		
		//MENU
		
		
		int opcion;
		
		
		
		do {
			System.out.println();
			System.out.println("1.Realizar Pedido");
			System.out.println("2.Devolución de pedido");
			System.out.println("3.Consultar Stok");
			System.out.println("4.Guardar Inventario");
			System.out.println("5.Salir \n");
			
			System.out.println("Elige opción: ");
			 opcion= sc.nextInt();
			sc.nextLine();
			
			switch(opcion) {
			
			case 1: 
				realizarPedido();
				break;
			case 2: 
				devolverPedido();
				break;
			case 3: 
				consultarStok();
				break;
			case 4: 
				guardarInventario();
				break;
			case 5: 
				System.out.println("Saliendo...");
				break;
			default:
				System.out.println("Esa opcion no vale");
				break;
			
			}
			
		}while(opcion!=5);
		
		

	}
	
	private static void guardarInventario() {
		
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("inventario.txt"));
			for(Ropa x:mapa.values()) {
				bw.write(x.getId()+";"+x.getNombre());
				for(String t:tallas) {
					bw.write(";"+x.getMapaDeTallas().get(t));
					
				}
				bw.write("\n");
			}
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private static void consultarStok() {
		
		for(Ropa x: mapa.values()) {
			x.mostrarStok();
		}
		
		
	}

	private static void devolverPedido() {
		
		System.out.println("Que talla quieres devolver");
		String talla = sc.next();
		System.out.println("Que cantidad quieres devolver");
		int cantidad = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Dime el identificador de la prenda que quieres devolver: ");
		int id = sc.nextInt();
		sc.nextLine();
		
		
		if(!mapa.containsKey(id)) {
			System.out.println("Ese identificador no existe");
			return; 
		}
		
		mapa.get(id).devolucion(talla, cantidad);
		
		
	}

	private static void realizarPedido() {
		
		System.out.println("Que talla quieres pedir");
		String talla = sc.next();
		
		System.out.println("Cuantas prendas vas a querer: ");
		int cantidad = sc.nextInt();
		sc.nextLine();
		System.out.println("Dime el identificador de la prenda: ");
		int idRopa = sc.nextInt();
		sc.nextLine();
		
		if(!mapa.containsKey(idRopa)) {
			System.out.println("Ese identificador no existe");
			return;
		}
		
		mapa.get(idRopa).realizarPedido(talla, cantidad);
		
		
		
	}

	public static void cargarInventario() {
		
		try {
			BufferedReader br = new BufferedReader(new FileReader("inventario.txt"));
			String linea;
			
			while((linea=br.readLine())!=null) {
				String array[] = linea.split(";");
				
				int id = Integer.parseInt(array[0]);
				String nombre = array[1];
				int xs = Integer.parseInt(array[2]);
				int s = Integer.parseInt(array[3]);
				int m = Integer.parseInt(array[4]);
				int l = Integer.parseInt(array[5]);
				int xl = Integer.parseInt(array[6]);
				
				Ropa r = new Ropa(id,nombre,xs,s,m,l,xl);
				mapa.put(id,r);
			}
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	
}

