package banco;


public class Banco {

	public static void main(String[] args) {
		ContaCorrente contaCorrente = new ContaCorrente();
		contaCorrente.nome(null);
		contaCorrente.sobrenome(null);
		contaCorrente.depositar(0);
		contaCorrente.sacar(0);
		contaCorrente.credito(250.0);
		
		GeradorExtratos geradorExtratos = new GeradorExtratos();
		geradorExtratos.extratoConta(contaCorrente);
	}

}

