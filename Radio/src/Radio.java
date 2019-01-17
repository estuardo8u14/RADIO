/**
 * 
 */

/**
 * @author Estuardo
 *
 */

import java.util.ArrayList;

public class Radio implements iRadio {
private boolean Encendido = false;
private boolean Sintonia = true;
private double FrecuenciaAM;
private double FrecuenciaFM;
private ArrayList<Estacion> Botones = new ArrayList<Estacion>();;

public Radio() {
//metodo para guardar 12 estaciones
	this.Botones.add(new Estacion(97.5,1000));
	this.Botones.add(new Estacion(96.6,1000));
	this.Botones.add(new Estacion(94.9,1000));
	this.Botones.add(new Estacion(97,1000));
	this.Botones.add(new Estacion(99.8,1000));
	this.Botones.add(new Estacion(97.5,1000));
	this.Botones.add(new Estacion(97.6,1000));
	this.Botones.add(new Estacion(97.6,1000));
	this.Botones.add(new Estacion(95.8,1000));
	this.Botones.add(new Estacion(97.5,1000));
	this.Botones.add(new Estacion(97.5,1000));
	this.Botones.add(new Estacion(98.6,1000));
		
}
	
private static double LIMITEAMABAJO = 530;
private static double LIMITEAMARRIBA = 1610;
private static double LIMITEFMABAJO = 87.9;
private static double LIMITEFMARRIBA = 107.9;
private static double CAMBIARFM = 0.2;
private static double CAMBIARAM= 10;

public Boolean isOn() {
	return encendido;
}
public boolean encendidoRadio() {
	encendido = !encendido;
	return false;
}
public String menu() {
return "Opciones(Ingresar número de la opcion): \n 1) Subir frecuencia\n\t2) Bajar frecuencia\\n\\t3)Cambiar a FM/AM\\n\\t4)Ir a estaciones favoritas\\n\\t5)Guardar estacion en favoritos\\n\\t6)Encender o apagar programa";
}
public String RadioActual() {
	String frecuencia;
	String sintonia;
	String onyoff;
	if(encendido) {
		if (FM) {
			sintonia="FM";
			
		}
	}
}
}
