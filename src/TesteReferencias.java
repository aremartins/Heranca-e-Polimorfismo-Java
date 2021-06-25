
public class TesteReferencias {
	public static void main(String[] args) {
		Funcionario g1 = new Gerente();
		g1.setNome("Marcos");
		g1.setSalario(5000.0);
		//g1.setSenha(2222);
		
		Gerente g = new Gerente();
		g.setSalario(5000.0);
		
		Funcionario f = new Funcionario();
		f.setSalario(2500.0);
		
		Atendente a = new Atendente();
		f.setSalario(3000.0);
		
		Diretor d = new Diretor();
		d.setSalario(8000.0);
		
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		controle.registra(f);
		controle.registra(a);
		controle.registra(d);
		
		System.out.println(controle.getSoma());
	}

}

//conceito de polimorfismo. Um objeto gerente pode ser uma referência 
//do tipo Funcionario ou Gerente, mas so herda os atributos e métodos 
//do tipo ao qual ele esta sendo referenciado. Nesse caso a senha 
//esta implementada na classe Gerente, por isso nao funcionaria.