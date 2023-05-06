package Clases;

public class TestReferencia2 {
	public static void main(String[] args) {
		Cliente diego = new Cliente();
		diego.setNombre("Diego");
		diego.setDocumento("123123");
		diego.setTelefono("9999999234");
		
		Cuenta cuentaDeDiego= new Cuenta(555);
		
		//Vinculemos la Cuenta de Diego con su titular:
		cuentaDeDiego.setTitular(diego);
		
		System.out.println(cuentaDeDiego.getAgencia());
		System.out.println(cuentaDeDiego);

	}		
}
