
public abstract class Conta implements iConta {
	
	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;

	protected int agencia;
	protected int numero;
	protected double saldo;
	private Cliente cliente;
	
	
	
	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}	
	
	@Override
	public void sacar(double valor) {
		saldo -= valor;
		
	}
	@Override
	public void depositar(double valor) {
		saldo += valor;
		
	}
	@Override
	public void tranferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}

	public int getAgencia() {
		return agencia;
	}
	public int getNumero() {
		return numero;
	}
	public double getSaldo() {
		return saldo;
	}
	

	protected void printInfoConta(){
		System.out.println(String.format("Cliente: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo: R$%.2f", this.saldo));
		System.out.println(String.format("Banco: %s", Banco.getNome()));	
		System.out.println(" ---     OBRIGADO      ---- \n");	
	}
	
}
