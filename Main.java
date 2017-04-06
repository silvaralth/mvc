package mvc;

/**
* El Main se encarga de inicializar el controlador del programa.
*/
public class Main{

	private static Controlador objControl;

	/**
	* El Main se encarga de inicializar el controlador del programa.
	* @param args[] Es un arreglo de cadenas que pueden o no inicializarse en la ejecución por consola del programa.
  *
	* Ejemplos:
	* arg[] inicializado : java mvc/Main EStoY Inicializando args Con Datos F1ct1s
	* arg[] vacio				 : java mvc/Main
	*/
	public static void main(String args[]){

		objControl = new Controlador();
		objControl.flujocontrol(args);

		}
	}
