package br.com.bytebank.banco.test;
import br.com.bytebank.banco.modelo.*;


public class TesteConexao {

	public static void main(String[] args) {

		try (Conexao conexao = new Conexao()) {
			conexao.leDados();
		} catch (IllegalStateException ex) {
			System.out.println("Deu erro na conexao ");
		}

		// ------------------------------------

//		Conexao con = null;
//		try {
//			con = new Conexao();
//			con.leDados();
//
//		} catch (IllegalStateException ex) {
//			System.out.println("Deu erro na conexao ");
//		} finally {
//			System.out.println("finaly");
//			if (con != null) {
//				con.close();
//			}
//
//		}
//
//	}
//
	}
}
