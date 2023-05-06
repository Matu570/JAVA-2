package bytebank_heredado;

public class CuentaCorriente extends Cuenta {
	public CuentaCorriente(int agencia, int numero) {
		//Este super accede a los metodos de la clase padre, en este caso al constructor, 
		//por lo que necesito introducir los mismos parametros que el constructor de la clase padre.
		super(agencia, numero);
		}
	
	@Override
	public void depositar(double valor) {
		this.saldo=this.saldo + valor;
		
	}
	
	@Override
	public void retirar(double valor) {
		// TODO Auto-generated method stub
		double comision=0.2;
		super.retirar(valor + comision);
	}
}
