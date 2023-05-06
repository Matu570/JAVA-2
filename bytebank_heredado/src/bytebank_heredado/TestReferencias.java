package bytebank_heredado;

public class TestReferencias {
	public static void main(String[] args) {
		//Gerente puede adaptarse a funcionario, pero funcionario no 
		//puede adaptarse a Gerente. No todo funcionario es un Gerente.
		Funcionario funcionario= new Gerente();
		funcionario.setNombre("Diego");
		
		Gerente gerente=new Gerente();
		gerente.setNombre("Jimena");
		
		funcionario.setSalario(2000);
		gerente.setSalario(2000);
		
	}
}
