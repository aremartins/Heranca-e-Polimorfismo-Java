
public class Atendente extends Funcionario{
	
	public double getBonificacao() {
		System.out.println("Chamando o método de bonificação do atendente");
		return super.getBonificacao() + 100;
	}

}
