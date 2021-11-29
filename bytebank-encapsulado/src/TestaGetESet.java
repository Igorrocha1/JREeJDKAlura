import javax.swing.plaf.synth.SynthOptionPaneUI;

public class TestaGetESet {

	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24226);
		// conta.numero = 1337
		conta.setNumero(1337);
		System.out.println(conta.getNumero());

		Cliente paulo = new Cliente();
		//		conta.titular = pailo
		paulo.setNome("Paulo Silveira");
		conta.setTitular(paulo);
		
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("programador");
		//em duas linhas
		Cliente titularDaConta = conta.getTitular();
		titularDaConta.setProfissao("programador");
		
		System.out.println(titularDaConta);
		System.out.println(paulo);
		System.out.println(conta.getTitular());

	}
}
