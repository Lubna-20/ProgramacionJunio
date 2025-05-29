package misClases;

import java.util.HashMap;
import java.util.Map;

public class Ropa {

	private int id;
	private String nombre;
	private Map<String,Integer> mapaDeTallas;
	private String tallas[]= {"xs","s","m","l","xl"};
	
	
	public Ropa(int id,String nombre,int xs,int s,int m,int l,int xl){
		
		this.id=id;
		this.nombre = nombre;
		
		mapaDeTallas = new HashMap<>();
		mapaDeTallas.put("xs",xs);
		mapaDeTallas.put("s",s);
		mapaDeTallas.put("m",m);
		mapaDeTallas.put("l",l);
		mapaDeTallas.put("xl",xl);
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Map<String, Integer> getMapaDeTallas() {
		return mapaDeTallas;
	}


	public void setMapaDeTallas(Map<String, Integer> mapaDeTallas) {
		this.mapaDeTallas = mapaDeTallas;
	}
	
	public boolean realizarPedido(String talla,int cantidad) {
		
		int stok = mapaDeTallas.get(talla);
		
		if(stok<cantidad) {
			System.out.println("No hay suficientes camisetas");
			return false;
		}else {
			this.mapaDeTallas.put(talla, stok-cantidad);
			return true;
		}
		
	}
	
	public void devolucion(String talla,int cantidad) {
		
		int stok = this.mapaDeTallas.get(talla);
		
		this.mapaDeTallas.put(talla, stok+cantidad);
		
	}
	
	public void mostrarStok() {
		
		
		System.out.println("Nombre: "+this.nombre);
		System.out.println("Id: "+this.id);
		for(String x:tallas) {
			System.out.println(x+":"+mapaDeTallas.get(x)); 
		}
		
	}
	
	
}