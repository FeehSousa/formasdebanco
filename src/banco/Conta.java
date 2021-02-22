package banco;

public interface Conta {
	
	void sacar(double valor);
	void depositar(double valor);
	double getSaldo();
	void nome(String nomePessoa);
	void sobrenome(String sobrenome);
	String getnome();
	void credito(double valor);
	double getLimite();

	

}
