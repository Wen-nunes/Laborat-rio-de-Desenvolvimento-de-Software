package interf;

import java.util.Random;

public class CartaoCredito implements MetodoPagamento {

	private String nomeMetodo;
    private int idPagamento;

    public CartaoCredito() {
        this.nomeMetodo = "Cartão de Crédito";
        this.idPagamento = gerarIdPagamento();
    }

    private int gerarIdPagamento() {
        Random random = new Random();
        return random.nextInt(10); 
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
