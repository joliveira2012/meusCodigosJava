package heranca;

public class ControleBonificacao {
	int totalBonifica��o = 0;
	
	void registra(Funcionario f) {
		totalBonifica��o += f.getBonificacao();
	}

	int getTotalBonificacao() {
		return totalBonifica��o;
	}
}
