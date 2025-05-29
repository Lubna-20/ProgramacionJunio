package misClases;

public class ClaseEmpleado {

	private String nombre;
	private String apellido;
	private String cargo;
	private String modalidad;
	private int horas;
	private double pagoHoras;

	public ClaseEmpleado(String nombre, String apellido, String cargo, String modalidad, int horas, double pagoHoras) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.cargo = cargo;
		this.modalidad = modalidad;
		this.horas = horas;
		this.pagoHoras = pagoHoras;
	}

	public double carcularNomina() {
		double sueldoBase = this.horas * this.pagoHoras;
		double bonificacion = sueldoBase * calcularBonificacion();
		double sueldoBruto = sueldoBase + bonificacion;
		return sueldoBruto;

	}

	private double calcularBonificacion() {

		double tipo = 0;
		if (this.modalidad.toLowerCase().equals("medio_tiempo")) {
			tipo = 0.1;
		} else {
			tipo = 0.2;
		}
		return tipo;
	}

	public void mostrarInfo() {
		System.out.printf("Nombre: %s Apellido: %s Cargo: %s Modalidad: %s  " + "Sueldo: %f ", this.nombre,
				this.apellido, this.cargo, this.modalidad, this.carcularNomina(), calcularBonificacion());
		System.out.println(this.nombre + ':' + this.carcularNomina());
	}

	// getter and setter
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getModalidad() {
		return modalidad;
	}

	public void setModalidad(String modalidad) {
		this.modalidad = modalidad;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public double getPagoHoras() {
		return pagoHoras;
	}

	public void setPagoHoras(double pagoHoras) {
		this.pagoHoras = pagoHoras;
	}

	public String toString() {
		return "ClaseEmpleado [nombre=" + nombre + ", apellido=" + apellido + ", cargo=" + cargo + ", modalidad="
				+ modalidad + ", horas=" + horas + ", pagoHoras=" + pagoHoras + "]";
	}

}
