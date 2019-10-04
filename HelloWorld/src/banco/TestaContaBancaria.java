package banco;
public class TestaContaBancaria {
	public static void main(String[] args) {
		/*ContaBancaria cb1 = new ContaBancaria();
		System.out.println(cb1.getSaldo());
		cb1.depositar(5000);
		System.out.println(cb1.getSaldo());
		cb1.saque(5000);
		System.out.println(cb1.getSaldo());*/
		
		ContaCorrente cc = new ContaCorrente();
		ContaPoupanca cp = new ContaPoupanca();
		
		cc.getTipo();
		System.out.println("saldo atual");
		System.out.println(cc.getSaldo());
		System.out.println("deposito 100");
		cc.depositar(100);
		System.out.println(cc.getSaldo());
		System.out.println("sacar 50");
		cc.saque(50);
		System.out.println(cc.getSaldo());
		
		System.out.println("------------------");
		cp.getTipo();
		System.out.println("saldo atual");
		System.out.println(cp.getSaldo());
		System.out.println("deposito 100");
		cp.depositar(100);
		System.out.println(cp.getSaldo());
		System.out.println("sacar 50");
		cp.saque(50);
		System.out.println(cp.getSaldo());		
	}

}
