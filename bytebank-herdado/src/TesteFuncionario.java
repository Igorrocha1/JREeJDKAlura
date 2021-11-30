
public class TesteFuncionario {

	public static void main(String[] args) {

		Cliente cliente = new Cliente();
		
		
		Gerente nico = new Gerente();
		nico.setNome("Nico Steapppet");
		nico.setCpf("5546465454");
		nico.setSalario(5.600);

		System.out.println(nico.getNome());
		System.out.println(nico.getBonificacao());

	}

}
