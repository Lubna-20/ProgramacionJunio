package bascicoInterfaceCollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

public class basicoInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		Collection<String> listaFrutos = new ArrayList<String>();
		listaFrutos.add("Manzana");
		for ( int i=0 ; i<3 ; i++) {
			System.out.println("Teclea Nombre de frutas: ");
			String nuevaFruta = scan.nextLine();
			listaFrutos.add(nuevaFruta);
		}
		//mostrar  comntenido de la collecion 
		Iterator<String> it = listaFrutos.iterator();
		while (it.hasNext()) {
			String fruta = it.next();
			System.out.println(fruta);
			
		}
		//comprobar si existe una fruta(contains)
		System.out.println("¿Existe la fruta...?");
		String frutaBuscar = scan.nextLine();
		System.out.println("La fruta " + frutaBuscar + "¿esta? " + listaFrutos.contains(frutaBuscar));
		//eliminar una fruta con remove
		
		System.out.println("¿que fruta quieres eliminar ? ");
		String frutaEliminar = scan.nextLine();
		listaFrutos.remove(frutaEliminar);	
		Iterator<String> listaModificada = listaFrutos.iterator();
		while (listaModificada.hasNext()) {
			String fruta = listaModificada.next();
			System.out.println(fruta);
			
		}
	}

}
