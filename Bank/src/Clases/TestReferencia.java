package Clases;

public class TestReferencia {
	public static void main(String[] args) {
		Cuenta primeraCuenta=new Cuenta(10);
		primeraCuenta.depositar(200);
		
		Cuenta segundaCuenta=primeraCuenta;
		segundaCuenta.depositar(100);
		
		System.out.println(primeraCuenta.getSaldo());
		
		System.out.println(primeraCuenta);
		System.out.println(segundaCuenta);
		
		
	}
}
