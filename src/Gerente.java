//Gerente é um Funcionário, gerente herda de class Funcionario
public class Gerente extends Funcionario {

	private int senha;

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}

	public double getBonificacao() {
		System.out.println("Chamando o método de bonificação do gerente");
		return super.getBonificacao() + super.getSalario(); // o gerente tem além da bonificação que todos os
															// funcionários recebem, um salario a mais. super indica que
															// herda da classe acima
	}

}
