package misClases;

import java.sql.Date;

public class Tarjeta {
	
	private static String DNI;
	private double saldo;
	private String tipotarjeta;
	private Date fecha;
	
	public Tarjeta(String DNI,double saldo, String tipotarjeta, Date fecha) {
		super();
		this.DNI = DNI;
		this.saldo = saldo;
		this.tipotarjeta = tipotarjeta;
		this.fecha = fecha;
	}

	public String getDNI() {
		return DNI;
	}
	public void setDNI(String dNI) {
		DNI = dNI;
	}
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getTipotarjeta() {
		return tipotarjeta;
	}

	public void setTipotarjeta(String tipotarjeta) {
		this.tipotarjeta = tipotarjeta;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

}
