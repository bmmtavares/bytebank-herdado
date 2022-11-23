//Gerente eh um Funcionario, Gerente herda da classe Funcionario
public class EditorVideo extends Funcionario {
	
	public double getBonificacao() {
		System.out.println("Chamando metodo de bonificacao do editor de video");
		//return super.getBonificacao() + 100;
		return 150;
	}
}
