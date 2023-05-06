package bytebank_heredado;

public abstract interface Autenticable{
	
	public void setClave(String clave);
	
	public boolean iniciarSesion(String clave);

}
