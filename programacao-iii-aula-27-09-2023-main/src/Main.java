import br.edu.umfg.estrategia.*;

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto("0001", "Cola cola 350ml", 3.59);
        Produto produto2 = new Produto("0002", "X-salada", 15.99);
        Carrinho carrinho = new Carrinho();

        carrinho.adicionarProduto(produto1);
        carrinho.adicionarProduto(produto2);


        try {
            carrinho.pagar(new MeioPagamentoCieloCreditoEstrategia("0202", "785247893", "699", "10/2032"));
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao efetuar o pagamento: " + e.getMessage());
        }


        try {
            carrinho.pagar(new MeioPagamentoCieloDebitoEstrategia("0202", "785247893"));
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao efetuar o pagamento: " + e.getMessage());
        }


        carrinho.pagar(new MeioPagamentoDinheiroEstrategia());
    }
}
