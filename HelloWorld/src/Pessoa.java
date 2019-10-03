
public class Pessoa {
	//Atributos
	private String nome;
	private int idade;
	private double peso;
	//Atributo "static" 
	//Reservado unicamente dentro desta classe em tempo de execu��o (n�o � inst�nciado pelo objeto) 
	//(n�o � inst�nci�vel)
	private static int contador;
	
	//Construtor
	public Pessoa(String nome, int idade) {
		this.nome = nome;	
		this.idade = idade;
		//contador de pessoas
		contador++;
	} 
	
	//M�todos
	public void caminha() {
		System.out.println("Pessoa est� caminhando ...");
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;		
	} 
	
	//forma de devolver uma var "static"
	public int getContador () {
		return this.contador;
	}
}
