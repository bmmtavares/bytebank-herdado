//Gerente eh um Funcionario, Gerente herda da classe Funcionario
public class Designer extends Funcionario {
	
	public double getBonificacao() {
		System.out.println("Chamando metodo de bonificacao do editor do designer");
		return 200;
	}
}
