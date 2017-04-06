package mvc;
import java.util.Scanner;

/**
* Vista es la clase de manejo de mensajes en la consola.
*/
public class Vista{

	/**
	* imprimir mensaje imprime en la consola el parametro que le pasan en la funcion.
	* @param msj es el parametro que va a imprimir.
	*/
	public void imprimirMensaje(String msj){
		System.out.println(msj);
		}

	/**
	* cargar menu imprime en la consola un menucito.
	*/
	public void cargarMenu(){
		System.out.println("\n--- MENU ---\n");
		System.out.println("Presione 1 para Espanol");
		System.out.println("Press 2 for English");
		System.out.println("Appuyez 3 pour le Francais\n");
	}

	/**
	* validarMenu se encarga de revisar que el dato suministrado por el ususaio en la ejecucion del menu sea una opcion valida, y en caso tal retornar un numero.
	*/
	public int validarMenu(){
		int opcion = 0;
		int numero = 0;
		boolean repetir = true;
		Scanner sc = new Scanner(System.in);
		opcion = sc.nextInt();
		do {
			switch (opcion){
				case 1:
					numero = 1;
					repetir = false;
					break;
				case 2:
					numero = 2;
					repetir = false;
					break;
				case 3:
					numero = 3;
					repetir = false;
					break;
				default:
					System.out.println("Opcion invalida");
					opcion = sc.nextInt();
					break;
			}

		} while (repetir == true);

		return numero;
	}
}
