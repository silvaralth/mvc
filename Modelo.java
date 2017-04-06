package mvc;

/**
* El Modelo es la estructura de datos del programa mvc
*/

public class Modelo{

	private String mensaje;

	private final String mensajeES ="\nHola Mundo MVC\n";
	private final String mensajeEN ="\nHello World MVC\n";
	private final String mensajeFR ="\nSalut Monde MVC\n";
	private final String error = "Programa no entender...";

	Modelo(){}

	/**
	* verificar recibe una cadena y la compara con una serie de cadenas preestablecidas, retornando un valor numérico.
	* @param cadena proviene de operaciones del Controlador, siendo la primera posicion del arreglo que se pasó en el Main
	*/
	public int verificar(String cadena){
		int number;
		cadena = cadena.toUpperCase();
    if (cadena.equals("ES") || cadena.equals("ESPANOL")) {
			number = 1;
    } else if (cadena.equals("EN") || cadena.equals("ENGLISH")) {
      number = 2;
    } else if (cadena.equals("FR") || cadena.equals("FRANCOIS")) {
      number = 3;
    } else {
      number = 1000;
    }
    return number;
  }

	/**
	* sayHello recibe un valor numerico que entra a compararse para retornar un atributo privado de la clase.
	* @param number proviene de verificar, y es con él que el programa consulta en que idioma responder.
	*/
	public String sayHello(int number){
		switch (number) {
			case 1 : mensaje = mensajeES;
							 break;
			case 2 : mensaje = mensajeEN;
							 break;
			case 3 : mensaje = mensajeFR;
							 break;
			default: mensaje = error;
			}
		return mensaje;
		}
	}
