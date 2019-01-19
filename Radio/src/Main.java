import java.util.Scanner;

/**
 * 
 */

/**
 * @author Estuardo
 *
 */
//porfavor tener micericordia mi compañero no contribuyo y no soy bueno programando 
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Radio laradio = new Radio();
Scanner input = new Scanner(System.in);
String opciones;
boolean in = true;
boolean encendido = false;
String FM =  "FM";

do {
	System.out.println("Opciones(Ingresar número de la opcion): \n 1) Subir frecuencia\n\t2) Bajar frecuencia\n\t3)Cambiar a FM/AM\n\t4)Ir a estaciones favoritas\n\t5)Guardar estacion en botones\n\t6)Encender o apagar programa");
	opciones = input.nextLine();
//menu y su funciones para el usuario
switch (opciones) {
case "1":
	if(!encendido) {
		System.out.println("Radio apagada, porfavor encenderla");
	}
	else {
		
		System.out.println("Frecuencia:"+ String.format("%.1f", laradio.subirFrecuencia())+FM);
	}
	break;
case "2":
	if(!encendido) {
		System.out.println("Radio apagada, porfavor encenderla");
	}
	else {
		System.out.println("Frecuencia: "+String.format("%.1f", laradio.bajarFrecuencia())+FM);
	}
	break;
case "4":
	if(!encendido) {
		System.out.println("Radio apagada, porfavor encenderla");
	}
	else {
		System.out.println("Frecuencia:"+String.format("%.1f", laradio.getFavoritos(0))+FM);
	}
	break;
case "3":
	if(!encendido) {
		System.out.println("Radio apagada, porfavor encenderla");
	}
	else {
		System.out.println("Frecuencia:"+String.format("%.1f", laradio.cambiarAmFm())+FM);
	}
	break;
case "5":
	if(!encendido) {
		System.out.println("Radio apagada, porfavor encenderla");
	}
	else {
		System.out.println();
	}
	break;
case"6":
	laradio.encendidoRadio();
	encendido=true;
	System.out.println("La Radio esta encendida");
	break;
	
		
	}
} while (in);
input.close();
	}
}
	

	




