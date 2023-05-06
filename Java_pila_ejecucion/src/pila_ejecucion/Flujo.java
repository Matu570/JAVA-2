package pila_ejecucion;

public class Flujo {
	public static void main(String[] args) {
		System.out.println("Inicio Main");
		metodo1();
		System.out.println("Fin Main");
	}
	
	public static void metodo1() {
		System.out.println("Inicio Metodo1");
		try {
			metodo2();
		}//Podemos hacer MultiCatch, o directamente catch(Exception exception) 
		catch(MiException | ArithmeticException | NullPointerException exception) {
			System.out.println(exception.getMessage());
		}
		
		System.out.println("Fin Metodo1");
	}
	
	public static void metodo2() throws MiException {
		System.out.println("Inicio Metodo2");
		for(int i=1; i<=5;i++) {
			System.out.println(i);
			
			//Try es como decir "intenta esto"
			try {
				String test=null;
				System.out.println(test.toString());
				int num=0;
				int resultado=30/num;
				System.out.println(resultado);//ArithmeticException
				//Cuando lanzo este error me mostrará la exception, mensaje, 
				//y los procesos que estaban en la pila y no lograron completarse.
			} catch(ArithmeticException exception) {//catch atrapa la exception que le indiquemos y le dará el tratamiento q asignemos
				//Como la excepcion es un objeto, imprimiremos un metodo de ella.
				System.out.println(exception.getMessage());
				//Otra forma de imprimir la excepcion
				//exception.printStackTrace();
			} catch(NullPointerException exception) {
				System.out.println(exception);
			}
			
			//Otra forma de atrapar varios errores:
			//catch(ArithmeticException | NullPointerException exception){System.out.println(exception);}
		}
		//NullPointer
		Cuenta c=null;
		c.deposita();
		
		//Arithmetic
		int a=50/0;
		//Aqui lanzo la exception que creamos:
		throw new MiException("Mi excepcion fue lanzada");		
		//Comento el siguiente código porque el throw previo le va a generar error
		//System.out.println("Fin Metodo2");
	}
}
