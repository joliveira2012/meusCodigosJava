
public class Pessoa {
	//Atributos
	private String nome;
	private int idade;
	private double peso;
	//Atributo "static" 
	//Reservado unicamente dentro desta classe em tempo de execução (não é instânciado pelo objeto) 
	//(não é instânciável)
	private static int contador;
	
	//Construtor
	public Pessoa(String nome, int idade) {
		this.nome = nome;	
		this.idade = idade;
		//contador de pessoas
		contador++;
	} 
	
	//Métodos
	public void caminha() {
		System.out.println("Pessoa está caminhando ...");
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
