import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Produto produto = new Produto("Camisa", 50.0, 10);

        Venda venda = new Venda();

        System.out.println("Bem-vindo ao sistema de vendas!");

        System.out.print("Informe a quantidade de produtos a ser comprada: ");
        int quantidade = sc.nextInt();

        System.out.print("Informe a forma de pagamento (Pix, Espécie, Transferência, Débito ou Crédito): ");
        sc.nextLine();
        String formaPagamento = sc.nextLine();

        double valorPago = 0;
        if (formaPagamento.equals("Espécie")) {
            System.out.print("Informe o valor pago: R$ ");
            valorPago = sc.nextDouble();
        }


        venda.realizarVenda(produto, quantidade, formaPagamento, valorPago);

        sc.close();
    }
}