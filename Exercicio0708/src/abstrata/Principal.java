package abstrata;

public class Principal {
	
	public static void main(String[] args) {
        
        CartaoCredito pagamento1 = new CartaoCredito();
        PayPal pagamento2 = new PayPal();
        Pix pagamento3 = new Pix();

        
        pagamento1.processaPagamento(150.00);
         pagamento1.mostraDetalhesPagamento();
         
        pagamento2.processaPagamento(200.00);
        pagamento2.mostraDetalhesPagamento();

        pagamento3.processaPagamento(300.00);
        pagamento3.mostraDetalhesPagamento();
    }
}
