
public abstract class ContaBancaria {
	String Titular;
	double saldo;
	int numero;
	
	private String titular;				
	
	public ContaBancaria() {
		this.titular = "Teste";		
	} 
	
	public double getSaldo(){
		return this.saldo;
	}
	
	/*public double depositar(double deposito){
		return this.saldo += deposito;		
	}
	
	public double saque(double sacado){
		return this.saldo -= sacado;		
	}*/
	
	public abstract String getTipo();

}
