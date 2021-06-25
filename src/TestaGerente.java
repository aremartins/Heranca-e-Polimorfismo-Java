
public class TestaGerente {

	public static void main(String[] args) {
		Gerente aretha = new Gerente();
		aretha.setNome("Aretha Martins");
		aretha.setCpf("258.245.154.12");
		aretha.setSalario(5000.0);

		aretha.setSenha(22222);

		System.out.println(aretha.getNome());
		System.out.println(aretha.getCpf());
		System.out.println(aretha.getBonificacao());

		boolean autenticou = aretha.autentica(22222);
		System.out.println(autenticou);
	}

}
