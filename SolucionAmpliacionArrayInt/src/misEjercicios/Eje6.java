package misEjercicios;

import java.util.Scanner;

public class Eje6 {

	static final int tamanio =15;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Escribe un programa que lea 15 números por teclado y que los almacene en un
		array. Rota los elementos de ese array, es decir, el elemento de la posición 0 debe
		pasar a la posición 1, el de la 1 a la 2, etc. El número que se encuentra en la última
		posición debe pasar a la posición 0. Finalmente, muestra el contenido del array.*/
		
		Scanner scan = new Scanner(System.in);
			int[] numeros = new int[tamanio];
		for(int i=0 ; i<tamanio;i++) {
			System.out.println("Teclea numero, posicion " + (i +1));
			try {
				numeros[i]=scan.nextInt();	
			}catch(Exception e){
				System.out.println("No ha stecleado ningun numero: " +e.getMessage());
				scan.nextLine();
				i--;
				
			}
		}
		
		for(int num : numeros) {
			System.out.println(num);
		}
		int ultimoElemento=numeros[numeros.length-1];
		for(int i=numeros.length-1; i>0;i++) {
			numeros[i]=numeros[i-1];
		}
		numeros[0]=ultimoElemento;
		System.out.println("Congtenido del array desplazado una posicion derecha");
		for(int num:numeros) {
			System.out.println(num);
		}
	}

}
