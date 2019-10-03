public class TestaContaBancaria {
	public static void main(String[] args) {
		ContaBancaria cb1 = new ContaBancaria();
		System.out.println(cb1.getSaldo());
		cb1.depositar(5000);
		System.out.println(cb1.getSaldo());
		cb1.saque(5000);
		System.out.println(cb1.getSaldo());
	}

}
