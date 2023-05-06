package Clases;

public class PruebaEncapsulamiento {
	public static void main(String[] args) {
		Cuenta cuenta=new Cuenta(2);
		cuenta.getTitular().setNombre("Diego");
		cuenta.getTitular().setDocumento("123123123");
		
		System.out.println(cuenta.getTitular().getNombre());
	}
}
