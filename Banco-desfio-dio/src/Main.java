
public class Main {

	public static void main(String[] args) {
		Cliente juh = new Cliente();
		juh.setNome("Juh");
		Cliente lous = new Cliente();
		lous.setNome("Lous");
		
		Conta CC = new ContaCorrente(juh);
		Conta CP = new ContaPoupanca(lous);
		
		CC.depositar(150);
		CC.tranferir(75, CP);
		CP.sacar(25);
		
		CC.extratoConta();
		CP.extratoConta();

	}

}
