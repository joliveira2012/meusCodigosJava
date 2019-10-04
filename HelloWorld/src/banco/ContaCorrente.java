package banco;

public class ContaCorrente extends ContaBancaria{
	public ContaCorrente() {
		super();
	} 
	
	void getTipo (){
		System.out.println("Conta Corrente");
	}
	
	public double saque(double sacado){
		return this.saldo -= sacado - 0.10;		
	}
	
}
