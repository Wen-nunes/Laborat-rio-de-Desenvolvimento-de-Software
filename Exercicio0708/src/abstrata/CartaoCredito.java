package abstrata;

public class CartaoCredito extends MetodoPagamento {
	public CartaoCredito() {
        super("Cartão de Crédito");
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
