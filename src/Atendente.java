
public class Atendente extends Funcionario{
	
	public double getBonificacao() {
		System.out.println("Chamando o m�todo de bonifica��o do atendente");
		return super.getBonificacao() + 100;
	}

}
