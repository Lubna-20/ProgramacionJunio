package misClases;

public class claseCuenta {
	private String titular; 
	private int saldo;
	private double interes;
	private double cantidad_interes;
	
	
	public claseCuenta(String titular, int saldo, double interes, double cantidad_interes) {
		super();
		this.titular = titular;
		this.saldo = saldo;
		this.interes = interes;
		this.cantidad_interes = cantidad_interes;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public int getSaldo() {
		return saldo;
	}
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	public double getInteres() {
		return interes;
	}
	public void setInteres(double interes) {
		this.interes = interes;
	}
	public double getCantidad_interes() {
		return cantidad_interes;
	}
	public void setCantidad_interes(double cantidad_interes) {
		this.cantidad_interes = cantidad_interes;
	}

	public void sacarDinero(double dinero) {
		if(saldo >= dinero) {
			this.saldo = dinero;
		}
	}
	public void depositarDinero(double dinero) {
		this.saldo += dinero;
	}
	public vois calcularInteresMensual() {
		this.cantidad_interes =((this.interes/100)/12)*this.saldo;
		this.saldo += this.cantidad_interes;
	}

}
