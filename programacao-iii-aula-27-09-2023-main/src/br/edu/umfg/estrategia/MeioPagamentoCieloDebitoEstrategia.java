package br.edu.umfg.estrategia;

public class MeioPagamentoCieloDebitoEstrategia implements MeioPagamentoEstrategia {

    private String numeroCartao;
    private String cpf;

    public MeioPagamentoCieloDebitoEstrategia(String numeroCartao, String cpf) {
        if (!validarNumeroCartao(numeroCartao)) {
            throw new IllegalArgumentException("Número de cartão de débito inválido");
        }
        if (!validarCPF(cpf)) {
            throw new IllegalArgumentException("CPF inválido");
        }

        this.numeroCartao = numeroCartao;
        this.cpf = cpf;
    }

    @Override
    public void pagar(Double valor) {
        System.out.printf("Pagamento via Cielo (Cartão de Débito) no valor %f realizado com sucesso\n", valor);
    }

    private boolean validarNumeroCartao(String numeroCartao) {
        // Implemente a validação do número do cartão de débito aqui
        // Retorna true se for válido, false caso contrário
        return true; // Exemplo: validação simples, você deve implementar a lógica real
    }

    private boolean validarCPF(String cpf) {
        // Implemente a validação do CPF aqui
        // Retorna true se for válido, false caso contrário
        return true; // Exemplo: validação simples, você deve implementar a lógica real
    }
}
