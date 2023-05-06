package Clases;

public class PruebaDeMetodos {
	
	public static void main(String[] args) {		
		Cuenta cuentaDeDiego=new Cuenta(2);
		cuentaDeDiego.depositar(500);
		System.out.println(cuentaDeDiego.getSaldo());
		
		cuentaDeDiego.retirar(100);
		System.out.println(cuentaDeDiego.getSaldo());
		
		Cuenta cuentaDeMatias=new Cuenta(3);
		
		cuentaDeDiego.transferir(150, cuentaDeMatias);
		System.out.println(cuentaDeDiego.getSaldo());
		System.out.println(cuentaDeMatias.getSaldo());

		

	}	
}
