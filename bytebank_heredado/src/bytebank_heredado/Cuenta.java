package bytebank_heredado;

public abstract class Cuenta {
	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular=new Cliente();
	private static int total=0;
	
	public Cuenta(int agencia, int numero) {
		this.agencia=agencia;
		this.numero=numero;
		System.out.println("Se van creando " + total + " cuentas.");
		total++;	
	};
	
	public abstract void depositar(double valor);
	
	public void retirar(double valor) {
		if(this.saldo<valor) {
			//Todo o que sea control de errores y validaciones va al inicio del método, antes de realizar cualquier accion
			try {
				throw new SaldoInsuficienteException("Saldo insuficiente");
			} catch (Exception e) {
				System.out.println(e.getMessage()); 
			}
			
		}
		this.saldo-=valor;				
	}
	
	public boolean transferir(double valor, Cuenta cuentaDestino) {
		if(this.saldo>=valor) {
			this.retirar(valor);
			cuentaDestino.depositar(valor);
			return true;
		}
		return false;	
	}
	
	public double getSaldo(){
		return this.saldo;
	};
	
	public int getAgencia() {
		return agencia;
	}
	
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	public Cliente getTitular() {
		return titular;
	}
	
	public static int getTotal() {
		return Cuenta.total;
	}
}

