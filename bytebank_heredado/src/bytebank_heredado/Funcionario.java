package bytebank_heredado;

public abstract class Funcionario {
	private String nombre;
	private String documento;
	private double salario;
	
	public Funcionario() {
	};
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	//Metodo abstracto. Obliga a todas las clases hijas a Sobre escribir e implementar este método.
	//Si en una clase hija no deseo implementarlo, debo volver esa clase abstracta.
	public abstract double getBonificacion();
}
