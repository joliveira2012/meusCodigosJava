import java.time.LocalDate;

public class ContaCorrente extends ContaBancaria{
	private String nome;
	private String endereco;
	private String cpf;
	
	public ContaCorrente() {
		super();
	} 
	
	public ContaCorrente(String nome, String endereco, String cpf, LocalDate dtNasc) {
		this.nome = nome;
		this.endereco = endereco;
		this.cpf =cpf;
	} 
	
	public boolean equals (Object obj) {
		ContaCorrente conta = (ContaCorrente) obj;
		return (conta.cpf.equals(this.cpf));
	}
	
	public String getTipo (){
		return "Conta Corrente";
	}
	
	public void saca(double sacado) throws SaldoInsuficiente{
		if (this.saldo < sacado) {
			throw new SaldoInsuficiente("SALDO INSUFICIENTE PARA SAQUE");
		}
		
		this.saldo -= sacado;		
	}
	
	public void deposita(double depositado){		
		this.saldo += depositado;		
	}
	
}
