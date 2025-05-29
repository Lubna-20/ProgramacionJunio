package misEjercicios;

import java.util.Iterator;
import java.util.Scanner;

public class Eje5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Escribe un programa que pida 10 números por teclado y que luego muestre los
		números introducidos junto con las palabras “máximo” y “mínimo” al lado del
		máximo y del mínimo respectivamente.*/
		
		Scanner scan = new Scanner(System.in);
		int[] numeros = new int[10];
		for(int i=0 ; i<numeros.length;i++) {
			System.out.println("Teclea numero, posicion " + (i +1));
			try {
				numeros[i]=scan.nextInt();	
			}catch(Exception e){
				System.out.println("No ha stecleado ningun numero: " +e.getMessage());
				scan.nextLine();
				i--;
				
			}
			
			
		}
		//Buscar el max y el min 
		int max=numeros[0];
		int min=numeros[0];
		int posicionMax=0;
		int posicionMin=0;
		int indice=0;
		for(int num : numeros) {
			if(num>max) {
				max=num;
				posicionMax=indice;
			}
			if(num<min) {
				min=num;
				posicionMin=indice;
			}
			indice++;
			
			}
	
		System.out.println("Numero Maximo: " + max + "posicion valor max :" + posicionMax);
		System.out.println("Numero Minimo: " + min + "posicion valor min :" + posicionMin);
	}

}
