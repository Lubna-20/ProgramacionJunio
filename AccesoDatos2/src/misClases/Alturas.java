package misClases;

public class Alturas {

	private String Provincia;
	private int AlturaMaxima;
	private String SituacionAltMin;
	private String SituacionAltMax;
	private int AlturaMinima;
	
	public Alturas(String provincia, int alturaMaxima, String situacionAltMin, String situacionAltMax,
			int alturaMinima) {
		super();
		Provincia = provincia;
		AlturaMaxima = alturaMaxima;
		SituacionAltMin = situacionAltMin;
		SituacionAltMax = situacionAltMax;
		AlturaMinima = alturaMinima;
	}
	
	public String getProvincia() {
		return Provincia;
	}
	public void setProvincia(String provincia) {
		Provincia = provincia;
	}
	public int getAlturaMaxima() {
		return AlturaMaxima;
	}
	public void setAlturaMaxima(int alturaMaxima) {
		AlturaMaxima = alturaMaxima;
	}
	public String getSituacionAltMin() {
		return SituacionAltMin;
	}
	public void setSituacionAltMin(String situacionAltMin) {
		SituacionAltMin = situacionAltMin;
	}
	public String getSituacionAltMax() {
		return SituacionAltMax;
	}
	public void setSituacionAltMax(String situacionAltMax) {
		SituacionAltMax = situacionAltMax;
	}
	public int getAlturaMinima() {
		return AlturaMinima;
	}
	public void setAlturaMinima(int alturaMinima) {
		AlturaMinima = alturaMinima;
	}

}
