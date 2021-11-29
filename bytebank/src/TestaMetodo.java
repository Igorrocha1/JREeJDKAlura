
public class TestaMetodo {

	public static void main(String[] args) {
		Conta contaDoPaulo = new Conta();
		contaDoPaulo.saldo = 100;
		contaDoPaulo.deposita(50);
		System.out.println(contaDoPaulo.saldo);
		boolean conseguiuRetirar =  contaDoPaulo.saca(20);
		System.out.println(contaDoPaulo.saldo);
		System.out.println(conseguiuRetirar);
		
		Conta ContaDaMarcela = new Conta();
		ContaDaMarcela.deposita(1000);
		
		if(ContaDaMarcela.tranfere(3000, contaDoPaulo)) {
			System.out.println("Tranferencia realizada com sucesso");
		}else {
			System.out.println("Dinheiro insuficiente");
		}
		System.out.println(ContaDaMarcela.saldo);
		System.out.println(contaDoPaulo.saldo);
		
		
		contaDoPaulo.titular = "paulo silveira";
		System.out.println(contaDoPaulo.titular);
	}
}
