package heranca;

public class Motorista extends Funcionario {
	Motorista(){
		/*Quando uso o m�todo super() dentro de um construtor de uma classe herdada, 
		  ele usa o construtor da inst�ncia que est� referenciando*/
		super();
		System.out.println("construtor motorista");
	}
	
	Motorista(int xnumero, String xnome){
		super(xnumero, xnome);
	}
	
	void dirige() {
		System.out.println("dirige");
	}
	
	void trabalha() {
		System.out.println("Motorista que trabalha...");
	}
	
	public int getBonificacao() {		
		return 60;
	}

}
