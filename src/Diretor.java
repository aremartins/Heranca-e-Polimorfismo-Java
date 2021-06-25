
public class Diretor extends Funcionario {

	public double getBonificacao() {
		System.out.println("Chamando o método de bonificação do diretor");
		return super.getBonificacao() + super.getSalario();
	}

}
