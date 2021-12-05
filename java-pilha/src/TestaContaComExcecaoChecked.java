
public class TestaContaComExcecaoChecked {
	public static void main(String[] args) {

		Conta c = new Conta();
		try {
			c.depoisita();
		} catch (MinhaExcecao ex) {
			System.out.println("Tratamento ...");
		}
	}
}
