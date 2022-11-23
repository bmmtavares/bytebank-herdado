//nao pode instanciar objetos dessa classe, porque e abstrata
public abstract class Funcionario {

	private String nome;
	private String cpf;
	private double salario;

	// metodo sem corpo, nao ha implementacao
	public abstract double getBonificacao();

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public double getSalario() {
		return salario;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}
