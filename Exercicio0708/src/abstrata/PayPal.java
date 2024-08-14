package abstrata;

public class PayPal extends MetodoPagamento {
	public PayPal() {
	        super("PayPal");
	    }

	    @Override
	    public void processaPagamento(double valor) {
	        System.out.println("Processando pagamento de R$ " + valor + " via " + nomeMetodo);
	    }

	    @Override
	    public void mostraDetalhesPagamento() {
	        System.out.println("Detalhes do pagamento:");
	        System.out.println("Método: " + nomeMetodo);
	        System.out.println("ID do Pagamento: " + idPagamento);
	    }

}
