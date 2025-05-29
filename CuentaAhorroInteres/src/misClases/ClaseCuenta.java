package misClases;

public class ClaseCuenta {

    private double saldo;
    private double tasaInteresAnual;

    public ClaseCuenta(double saldo, double tasaInteresAnual) {
        super();
        this.saldo = saldo;
        this.tasaInteresAnual = tasaInteresAnual;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getTasaInteresAnual() {
        return tasaInteresAnual;
    }

    public void setTasaInteresAnual(double tasaInteresAnual) {
        this.tasaInteresAnual = tasaInteresAnual;
    }

}
