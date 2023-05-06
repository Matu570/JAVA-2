package Clases;

public class PruebaAcceso {
	public static void main(String[] args) {
		Cuenta cuenta = new Cuenta(5);
		cuenta.depositar(400);
		cuenta.retirar(300);
		System.out.println(cuenta.getSaldo());
	}
}
