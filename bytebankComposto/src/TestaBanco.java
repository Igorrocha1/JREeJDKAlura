
public class TestaBanco {

	public static void main(String[] args) {
		Cliente paulo = new Cliente();
		paulo.nome = "Paulo Silveira";
		paulo.cpf = "222.222.222.11";
		paulo.profissao = "programador";
		
		Conta contaDopaulo = new Conta();
		contaDopaulo.deposita(100);
		
		// associa o cliente Paulo á contaDoPaulo
		contaDopaulo.titular = paulo;
		System.out.println(contaDopaulo.titular.nome);
		System.out.println(contaDopaulo.titular);
	}
}
