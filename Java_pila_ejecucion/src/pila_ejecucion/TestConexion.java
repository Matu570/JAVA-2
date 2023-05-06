package pila_ejecucion;

public class TestConexion {
	public static void main(String[] args) throws Exception {
		
		//Estructura try with resources
		try(Conexion con = new Conexion()){
			con.leerDatos();
		}catch(IllegalStateException ex) {
			System.out.println("Ejecutando Catch");
			ex.printStackTrace();
		}
				
		//En caso de que no utilice Autocloseable
		//Conexion conexion = null;
		//try {
		//	conexion=new Conexion();
		//	conexion.leerDatos();	
		//} catch /*Si hay Finally, puedo omitir el catch si lo deseo*/(IllegalStateException e) {
		//	e.printStackTrace();	
		//} finally/*Finally me permite ejecutar obligadamente un bloque de codigo, haya error o no*/ {
		//	conexion.cerrar();
		//}
	}
}
