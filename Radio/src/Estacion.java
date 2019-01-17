
public class Estacion {
private double frecuenciaFm;
private int frecuenciaAm;

public Estacion(double i, int a) {
	this.frecuenciaFm = i;
	this.frecuenciaAm = a;
}
public double getFm() {
	return frecuenciaFm;
}
public int getAm() {
	return frecuenciaAm;
}
}
