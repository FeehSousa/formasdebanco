package banco;

import javax.swing.JOptionPane;

public class GeradorExtratos {
	
	public void extratoConta(Conta conta) {
		System.out.println("#### Extrato Bancario ####");
		System.out.println("Seu Nome é:" + conta.getnome());
		System.out.println("Saldo da Conta: " + conta.getSaldo());
		System.out.println("Seu Limite Atual: "+ conta.getLimite());
		JOptionPane.showMessageDialog(null, "Nome: "+ conta.getnome()+
				"\n" + "Saldo da Conta: "+ conta.getSaldo() +
				"\n" +"Limite da Conta: "+ conta.getLimite());
	}

}
