import java.time.LocalDate;

public class TesteErro {
	public static void main(String[] args) {
		System.out.println("inicio do main");
		try {
			metodo1();
		} catch (NullPointerException e) {
			System.out.println("Teve um erro");
		}
		System.out.println("fim do main");
	}

	static void metodo1() {
		System.out.println("inicio do metodo");
		metodo2();
		System.out.println("fim do metodo");
	}
	
	static void metodo2() {
		//Para testar comenta um e descomenta o outro
		
		/*System.out.println("inicio do metodo2");
		ContaCorrente cc = new ContaCorrente();
			for (int i = 0; i <= 15; i++) {
				cc.deposita(i + 1000);
				System.out.println(cc.getSaldo());
				if(i == 5) {
					cc = null;
				}
			}
	
		System.out.println("fim do metodo2");*/
		
		System.out.println("inicio do metodo2.1");
		ContaCorrente cc = new ContaCorrente();
				
		cc.deposita(100);
		System.out.println(cc.getSaldo());
		Double value = Double.valueOf(200);
		cc.saca(value);
		
		ContaCorrente cc2 = new ContaCorrente("nome", "endereco", "cpf", LocalDate.of(1996, 02, 23));
	
		System.out.println("fim do metodo2.1");
	}
	
}

