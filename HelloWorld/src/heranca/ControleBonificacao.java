package heranca;

public class ControleBonificacao {
	int totalBonificação = 0;
	
	void registra(Funcionario f) {
		totalBonificação += f.getBonificacao();
	}

	int getTotalBonificacao() {
		return totalBonificação;
	}
}
