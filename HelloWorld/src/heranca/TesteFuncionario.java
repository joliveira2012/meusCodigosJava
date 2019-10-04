package heranca;

public class TesteFuncionario {
	public static void main(String[] args) {
		/*
		//PARTE 1
		Funcionario f = new Funcionario();
		f.setNome("João");
		f.setNumero(123);
		System.out.println(f.getNome());
		System.out.println(f.getNumero());
		f.trabalha();
		
		
		Motorista m1 = new Motorista();
		m1.setNome("João2");
		m1.setNumero(54123);
		System.out.println(m1.getNome());
		System.out.println(m1.getNumero());
		m1.trabalha();
		m1.dirige();
		
		Funcionario f2 = new Funcionario(789, "Maria");
		System.out.println(f2.getNome());*/
		
		//PARTE 2
		Funcionario f = new Funcionario();
		f.setNome("Aline");
		f.setNumero(789);
		
		//Criando array de funcionario (ver funcionamento de polimorfimo com vetor)
		Funcionario[] arrayfunc = new Funcionario[3];
		arrayfunc[0] = f;
		arrayfunc[1] = new Funcionario(555, "Teste");
		arrayfunc[2] = new Motorista(666, "Teste 3");
		
		arrayfunc[1].trabalha();
		arrayfunc[2].trabalha();
		
		ControleBonificacao cb = new ControleBonificacao();
		cb.registra(f);
		cb.registra(arrayfunc[2]);
		
		/*
		//Exemplo interface
		Diretor d = new Diretor();
		Autenticavel a  = d;*/

		System.out.println(cb.getTotalBonificacao());
		
		
		
	}		
}
