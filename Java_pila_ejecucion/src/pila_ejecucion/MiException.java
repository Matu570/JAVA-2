package pila_ejecucion;

//Si extiendo de RuntimeException siginfica que posiblemente se lance una exception o no, 
//Por lo que, como no se sabe si ocurrirá, el compilador no nos advertirá. 
//Si extiendo de Exception siginifica que la exception será lanzada si o si.
//En este caso debo especificar en la firma del método
//que cierta exception será lanzada, con las palabras throws NombreDeException.
//Seguido de esto el problema pasará al siguiente proceso, excepto que tambien le 
//indiquemos que puede lanzar la exception... hasta que finalmente en algun punto 
//adicionemos el try catch correspondiente
public class MiException extends Exception {
	public MiException () {
		super();
	}
	public MiException(String message) {
		super(message);
	}
}
