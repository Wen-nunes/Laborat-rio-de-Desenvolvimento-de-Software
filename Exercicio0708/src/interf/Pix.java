package interf;

import java.util.Random;

public class Pix implements MetodoPagamento {

	private String nomeMetodo;
    private int idPagamento;

    public Pix() {
        this.nomeMetodo = "PIX";
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
