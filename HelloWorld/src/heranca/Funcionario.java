package heranca;

public class Funcionario {
	int numero;
	String nome;
	
	Funcionario(){
		System.out.println("construtor funcionário");
	}
	
	Funcionario(int xnumero, String xnome){
		nome = xnome;
		numero = xnumero;
	}
	
	void trabalha() {
		System.out.println("Funcionario que trabalha ...");
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getBonificacao() {		
		return 10;
	}

	
}
