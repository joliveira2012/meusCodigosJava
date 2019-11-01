package banco;

public enum ClassificacaoClientes {
	POTENCIAL(400000,500000), 
	MEDIO(200000,400000), 
	BAIXO(0,200000);
	
	private double saldo;
	
	ClassificacaoClientes(double saldo){
		this.saldo = saldo;
	}
	
	

}
