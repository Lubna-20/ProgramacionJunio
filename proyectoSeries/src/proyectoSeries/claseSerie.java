package proyectoSeries;

public class claseSerie {
    private String nombre;
    private int minutos;
    
	public claseSerie(String nombre, int minutos) {
		super();
		this.nombre = nombre;
		this.minutos = minutos;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getMinutos() {
		return minutos;
	}
	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}
	
	public void sumarMinutos(int min) {
		this.minutos += min;
	}
}
