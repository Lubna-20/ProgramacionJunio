package misEjercicios;

import java.util.Random;

public class Eje10 {

	static final int tamanio=20;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100 y
		que los almacene en un array. El programa debe ser capaz de pasar todos los
		números pares a las primeras posiciones del array (del 0 en adelante) y todos los
		números impares a las celdas restantes. Utiliza arrays auxiliares si es necesario.*/
		
		int[] numeros= new int [tamanio];
		int[] resultado = new int [tamanio];
		Random aleatorio= new Random();
		for(int i=0;i<numeros.length;i++) {
			numeros[i]=aleatorio.nextInt(100);
		}
		int indicePar = 0;
		int indiceImpar = numeros.length-1;
		for(int num: numeros) {
			if( num%2==0) {
				resultado[indiceImpar]=num;
				indice
			}
		}
	}

}
