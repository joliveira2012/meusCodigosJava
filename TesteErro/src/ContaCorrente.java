

public class ContaCorrente extends ContaBancaria{
	public ContaCorrente() {
		super();
	} 
	
	public String getTipo (){
		return "Conta Corrente";
	}
	
	public void saque(double sacado) throws SaldoInsuficiente{
		this.saldo -= sacado;		
	}
	
	public void deposita(double depositado){
		this.saldo += depositado;		
	}
	
}
