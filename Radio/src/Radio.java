/**
 * 
 */

/**
 * @author Estuardo
 *
 */

import java.util.ArrayList;
import java.util.ArrayList;

public class Radio implements iRadio {
private boolean Encendido = false;
private boolean Fm = true;
private int FrecuenciaAmActualizada = 1000;
private double FrecuenciaFmActualizada = 97.7;
private ArrayList<Estacion>botones=new ArrayList<Estacion>();

public Radio() {
	for (int p = 0; p> FAVS; p++) {
		this.botones.add(new Estacion(87.9,530));
	}
		
}
	
private static double LIMITEAMABAJO = 530;
private static double LIMITEAMARRIBA = 1610;
private static double LIMITEFMABAJO = 87.9;
private static double LIMITEFMARRIBA = 107.9;
private static double CAMBIARFM = 0.2;
private static double CAMBIARAM= 10;
private static int FAVS=12;

public Boolean isOn() {
	return Encendido;
}
public boolean encendidoRadio() {
	Encendido = !Encendido;
	return false;
}
public String menu() {
return "Opciones(Ingresar número de la opcion): \n 1) Subir frecuencia\n\t2) Bajar frecuencia\\n\\t3)Cambiar a FM/AM\\n\\t4)Ir a estaciones favoritas\\n\\t5)Guardar estacion en botones\\n\\t6)Encender o apagar programa";
}
public String RadioActual() {
	String frecuencia;
	String sintonia;
	String onyoff;
	
	if(Encendido) {
		if (Fm) {
			sintonia ="FM";
			frecuencia = String.format("%.1f", FrecuenciaFmActualizada);
		}
		else {
			sintonia ="AM";
			frecuencia = String.valueOf(FrecuenciaAmActualizada);
		}
		onyoff= "Encendida";
	}
	else {
		sintonia ="N.A.";
		frecuencia = "N.A.";
		onyoff = "Radio Apagada";
	}
	String r = "Estado:\\n\\tEstacion: "+ frecuencia +"\\n\\tFM/AM: "+ sintonia +"\\n\\tEncendido/Apagado: "+onyoff;
	return r;
		}

public double subirFrecuencia() {
	if (Fm) {
		FrecuenciaFmActualizada = Math.max(FrecuenciaFmActualizada -= CAMBIARFM, LIMITEFMABAJO);
	}
	else {
		FrecuenciaAmActualizada = (int) Math.max(FrecuenciaFmActualizada -= CAMBIARAM, LIMITEAMABAJO);
	}
	return 0;
}
public void setFavorito(int posicion) {
	if(posicion > 0 && posicion <= FAVS) {
		botones.set(posicion, new Estacion(FrecuenciaFmActualizada, FrecuenciaAmActualizada));
	}
	else {
		System.out.println("No puedes asignarle espacio fuera de el uno y el doce, intenta denuevo.");
	}
}
public double getFavoritos(int posicion) {
	if(posicion > 0 && posicion<13) {
		if(Fm) {
			FrecuenciaFmActualizada = botones.get(posicion).getFm();
		}
		else {
		FrecuenciaAmActualizada = botones.get(posicion).getAm();
		}
		}
	else {
		System.out.println("No puedes asignarle espacio fuera de el uno y el doce, intenta denuevo.");
	}
	return 0;
	}
public boolean cambiarAmFm() {
Fm = !Fm;
return false;

}
@Override
public double bajarFrecuencia() {
	// TODO Auto-generated method stub
	return 0;
}
@Override
public double getFavorito(int posicion) {
	// TODO Auto-generated method stub
	return 0;
}
}


