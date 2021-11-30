
public class TestesTributaveis {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(222, 333);
		cc.deposita(100.0);
		SeguroDeVida seguro = new SeguroDeVida();

		CauculadorDeImposto calc = new CauculadorDeImposto();
		calc.registra(cc);
		calc.registra(seguro);

		System.out.println(calc.getTotalImposto());
	}

}
