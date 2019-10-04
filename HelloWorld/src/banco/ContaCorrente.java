package banco;

public class ContaCorrente extends ContaBancaria{
	public ContaCorrente() {
		super();
	} 
	
	public String getTipo (){
		return "Conta Corrente";
	}
	
	public double saque(double sacado){
		return this.saldo -= sacado - 0.10;		
	}
	
}
