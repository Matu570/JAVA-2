package Clases;

public class TestCuenta {
	
	public static void main(String[] args) {
		Cuenta primeraCuenta=new Cuenta(6);
		primeraCuenta.depositar(1000);
		System.out.println(primeraCuenta.getSaldo());
		
		Cuenta segundaCuenta=new Cuenta(8);
		
		System.out.println(new Cuenta(9));
		
		




		
	}
	
}
