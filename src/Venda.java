public class Venda {
    public void realizarVenda(Produto produto, int quantidade, String formaPagamento, double valorPago) {
        if (quantidade > produto.getEstoque()) {
            System.out.println("Ops! Não tem estoque suficiente.");
            return;
        }

        double total = produto.getValor() * quantidade;
        double desconto = 0;


        if (formaPagamento.equals("Pix") || formaPagamento.equals("Espécie") || formaPagamento.equals("Transferência") || formaPagamento.equals("Débito")) {
            desconto = total * 0.05;
            total -= desconto;
        }


        if (formaPagamento.equals("Crédito")) {
            System.out.println("Pagamento em Crédito: Parcelado em 3x sem juros!");
            System.out.println("Valor de cada parcela: " + total / 3);
        }


        System.out.println("Total a pagar: R$ " + total);


        if (formaPagamento.equals("Espécie") && valorPago > total) {
            double troco = valorPago - total;
            System.out.println("Troco: R$ " + troco);
        } else if (valorPago < total) {
            System.out.println("O valor pago é insuficiente.");
            return;
        }

        produto.vender(quantidade);
        System.out.println("Venda realizada com sucesso!>_<");
    }
}

