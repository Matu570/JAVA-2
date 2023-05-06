package bytebank_heredado;

public class TestCuenta {
	public static void main(String[] args) {
		//CuentaCorriente cc=new CuentaCorriente(1, 1);
		//errores
		CuentaCorriente cc=null;//null pointer exception
		int num=0;
		int resultado=30/num;
		System.out.println(resultado);//ArithmeticException

		CuentaAhorros ca=new CuentaAhorros(2, 3);
		
		cc.depositar(2000);
		cc.transferir(1000, ca);
		
		System.out.println(cc.getSaldo());
		
	}
}
