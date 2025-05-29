package misEjercicios;

import java.util.Random;
import java.util.Scanner;

public class Ejer7 {

	
	static final int tamanioRandom=100;
	static final int rango = 20;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		/*Escribe un programa que genere 100 números aleatorios del 0 al 20 y que los
		muestre por pantalla separados por espacios. El programa pedirá entonces por
		teclado dos valores y a continuación cambiará todas las ocurrencias del primer
		valor por el segundo en la lista generada anteriormente. Los números que se han
		cambiado deben aparecer entrecomillados.*/
	
		int[] numeros=new int[tamanioRandom];
		Random aleatorio=new Random();
		for(int i=0;i<tamanioRandom;i++) {
			numeros[i]=aleatorio.nextInt(rango);
		}
		
		for(int num : numeros) {
			System.out.println(num);
		}
		
		int vectorOriginal=scan.nextInt();
		System.out.println("Nuevo valos: ");
		int nuevoValor = scan.nextInt();
		//hacer la sustitucion y contar apariciones 
		int apariciones =0;
		for(int i=0;i<tamanioRandom;i++) {
			if(numeros[i]==vectorOriginal) {
				numeros[i]=nuevoValor;
				apariciones++;
			}
		}
		
		//mostrar resultadop  final (marcando los cambios) y total de apariciones
		System.out.println("se han echo " +apariciones + "cambios");
		for(int i=0;i<tamanioRandom;i++) {
			if(numeros[i]==nuevoValor) {
				System.out.println("***" + numeros[i] + "***");
			}
		}
	}
	
	

}
