package bytebank_heredado;

public class TestFuncionario {
	public static void main(String[] args) {
		Funcionario diego=new Gerente();
		diego.setNombre("Diego");
		diego.setDocumento("2134234");
		diego.setSalario(2000);
		
		System.out.println(diego.getSalario());
		System.out.println(diego.getBonificacion());
	}
}
