
public class Diretor extends Funcionario {

	public double getBonificacao() {
		System.out.println("Chamando o m�todo de bonifica��o do diretor");
		return super.getBonificacao() + super.getSalario();
	}

}
