
public class Funcionario {
	private String nome;
	private String cpf;
	private double salario; //aqui poderia usar o protected para o atributo ficar acessível nas classes filhas, mas é indicado usar sempre private
		
	public double getBonificacao() {
		return this.salario * 0.1;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
}


