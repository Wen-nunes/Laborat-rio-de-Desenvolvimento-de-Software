package abstrata;

import java.util.Random;

public abstract class MetodoPagamento {
	protected String nomeMetodo;
    protected int idPagamento;

    public MetodoPagamento(String nomeMetodo) {
        this.nomeMetodo = nomeMetodo;
        this.idPagamento = gerarIdPagamento();
    }

    private int gerarIdPagamento() {
        Random random = new Random();
        return random.nextInt(10);
    }

    public abstract void processaPagamento(double valor);
    public abstract void mostraDetalhesPagamento();

}
