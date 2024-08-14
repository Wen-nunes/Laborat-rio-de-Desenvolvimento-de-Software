package abstrata;

public class Pix extends MetodoPagamento{
	public Pix() {
	        super("PIX");
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
