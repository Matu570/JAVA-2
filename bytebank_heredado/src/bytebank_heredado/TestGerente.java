package bytebank_heredado;

public class TestGerente {
	public static void main(String[] args) {
		//Gerente gerente= new Gerente();
		//gerente.setSalario(5000);
		Gerente gerente=new Gerente();
		gerente.setSalario(6000);
		gerente.setClave("AluraCursosOnLine");
		
		System.out.println(gerente.getBonificacion());
		System.out.println(gerente.iniciarSesion("AluraCursosOnLine"));
		
	}
}	
