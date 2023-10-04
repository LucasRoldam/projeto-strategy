package br.edu.umfg.estrategia;

public class MeioPagamentoCieloCreditoEstrategia implements MeioPagamentoEstrategia {

    private String numeroCartao;
    private String cpf;
    private String cvv;
    private String dataValidade;

    public MeioPagamentoCieloCreditoEstrategia(String numeroCartao, String cpf, String cvv, String dataValidade) {
        if (!validarNumeroCartao(numeroCartao)) {
            throw new IllegalArgumentException("Número de cartão de crédito inválido");
        }
        if (!validarCPF(cpf)) {
            throw new IllegalArgumentException("CPF inválido");
        }
        if (!validarCVV(cvv)) {
            throw new IllegalArgumentException("CVV inválido");
        }
        if (!validarDataValidade(dataValidade)) {
            throw new IllegalArgumentException("Data de validade inválida");
        }

        this.numeroCartao = numeroCartao;
        this.cpf = cpf;
        this.cvv = cvv;
        this.dataValidade = dataValidade;
    }

    @Override
    public void pagar(Double valor) {
        System.out.printf("Pagamento via Cielo (Cartão de Crédito) no valor %f realizado com sucesso\n", valor);
    }

    private boolean validarNumeroCartao(String numeroCartao) {
        // Implemente a validação do número do cartão de crédito aqui
        // Retorna true se for válido, false caso contrário
        return true; // Exemplo: validação simples, você deve implementar a lógica real
    }

    private boolean validarCPF(String cpf) {
        // Implemente a validação do CPF aqui
        // Retorna true se for válido, false caso contrário
        return true; // Exemplo: validação simples, você deve implementar a lógica real
    }

    private boolean validarCVV(String cvv) {
        // Implemente a validação do CVV aqui
        // Retorna true se for válido, false caso contrário
        return cvv != null && cvv.length() == 3;
    }

    private boolean validarDataValidade(String dataValidade) {
        // Implemente a validação da data de validade aqui
        // Retorna true se for válida, false caso contrário
        // Você pode comparar a data de validade com a data atual para verificar se é válida
        return true; // Exemplo: validação simples, você deve implementar a lógica real
    }
}
