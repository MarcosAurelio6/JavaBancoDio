
public class CartaoDigital extends Conta {
	String nomeCliente;
	int numeroCartão;
	private static int SEQUENCIAL = 0001;
	
	public CartaoDigital(Cliente cliente) {
		super(cliente);
		this.nomeCliente = cliente.getNome();
		this.numeroCartão = SEQUENCIAL++;
		
	}

	@Override
	public void imprimirExtrato() {
		
		System.out.println("=== Extrato Conta Corrente ===");
		super.imprimirInfosComuns();
				
		
	}
}
