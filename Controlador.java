package mvc;

/**
* El Controlador se encarga de gestionar los procesos entre clases.
*/
public class Controlador{
	private Modelo objModelo;
	private Vista objVista;
	private String dato;
	private int switchMenu;

	/**
	* Se inicializan en el constructor los atributos de la clase para que puedan operarse.
	*/
	Controlador(){
		objModelo = new Modelo();
		objVista = new Vista();
		dato = "";
		switchMenu = 0;
		}

	/**
	* flujocontrol es el metodo principal del programa, es en este que se hacen las relaciones y usos de las demás clases del paquete.
	* @param arg[] Recibe una posible cadena de cadenas suministrada en la ejecucion del metodo Main por consola. Si existe una cadena, el metodo entrara a hacer operaciones con ella, de lo contrario el metodo invocara otro metodo que creará un menu para guiar al usuario.
	*/
	public void flujocontrol(String arg[]){

			if (arg.length >= 1) {
				String parametro = arg[0];
				int caseNumber = objModelo.verificar(parametro);
				if (objModelo.verificar(parametro) <= 3) {
					dato = objModelo.sayHello(caseNumber);
				}else{
					objVista.cargarMenu();
					switchMenu = objVista.validarMenu();
					dato = objModelo.sayHello(switchMenu);
				}
			} else {
					objVista.cargarMenu();
					switchMenu = objVista.validarMenu();
					dato = objModelo.sayHello(switchMenu);
			}
			objVista.imprimirMensaje(dato);
		}
}
