
public class TestaPessoa {
	public static void main (String[] args) {		
		
		/*//Pessoa 1
		Pessoa p1 = new Pessoa();
		
		p1.nome = "Teste";
		p1.idade = 1;
		p1.peso = 63.500;
		
		p1.caminha();
		System.out.println(p1.getNome());
		
		//Pessoa 2
		Pessoa p2 = new Pessoa();
		
		p2.nome = "Teste2";
		p2.idade = 1;
		p2.peso = 63.500;
		
		System.out.println(p2.nome);*/
		
		Pessoa ps1 = new Pessoa("inicia1", 1);
		ps1.setNome("teste3");
		Pessoa ps2 = new Pessoa("inicia2", 2);
		Pessoa ps3 = new Pessoa("inicia3", 3);
		
		System.out.println(ps1.getContador());
		System.out.println(ps1.getNome());
		System.out.println(ps1.contador);
		
	}
}
