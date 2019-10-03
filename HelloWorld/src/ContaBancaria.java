public class ContaBancaria {
	private String titular;		
	private double saldo;
	private int numero;	
	
	public ContaBancaria() {
		this.titular = "Teste";	
		this.saldo = 5000;		
		this.numero = 1234;
	} 
	
	public double getSaldo(){
		return this.saldo;
	}
	
	public double depositar(double deposito){
		return this.saldo += deposito;		
	}
	
	public double saque(double sacado){
		return this.saldo -= sacado;		
	}

}
