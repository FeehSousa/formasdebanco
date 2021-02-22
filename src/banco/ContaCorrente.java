package banco;

import javax.swing.JOptionPane;

public class ContaCorrente implements Conta{

	private double saldo = 0; 
	private String nome ;
	private String sn;
	private double limite = 2000.0;
	
	@Override
	public void nome(String nomePessoa) {
		
		nomePessoa = JOptionPane.showInputDialog("Digite Seu Nome");
		if(nomePessoa != null) {
		nome = nomePessoa;	
		}else {
			System.out.println("Você não digitou o nome");
		}
	}
	@Override
	public void sobrenome(String sobrenome) {
		sobrenome =  JOptionPane.showInputDialog("Digite seu Sobrenome");
		if (sobrenome != null) {
		sn = sobrenome;
		}else 
			System.out.println("Você não digitou o Sobrenome");
	}

	@Override
	public void sacar(double saque) {
		saque = Double.parseDouble(JOptionPane.showInputDialog("Informe o Valor do Saque?"));
		if (saldo >= saque) {
			saldo = saldo - saque;
			System.out.println("Valor Depositado: " + saque);
		}else {
			
		}
	}

	@Override
	public void depositar(double valor) {
		
		valor = Double.parseDouble(JOptionPane.showInputDialog("Informe o Valor do Deposito?"));
		if(valor > 0) {
			saldo = saldo + valor;
		 System.out.println("Valor Depositado: " + valor);
		}else {
			System.out.println("Erro ao Depositar Valor");
		}
		
	}

	@Override
	public double getSaldo() {
		
		return this.saldo;
		
	}
	
	@Override
	public String getnome() {
		  
		return nome = nome.substring(0,1).toUpperCase().concat(nome.substring(1))
				+ " "+ sn.substring(0,1).toUpperCase().concat(sn.substring(1));
	}
	@Override
	public void credito(double valor) {
		if (limite >= valor) {
		limite = limite - valor;
		System.out.println("Seu limite está em: " + limite);
		}else {
			System.out.println("Você está sem limite.");
		}
		
		
	}
	@Override
	public double getLimite() {
	
		return limite;
	}
	
}
