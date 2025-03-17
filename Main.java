import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha o método de pagamento:");
        System.out.println("1: Pix");
        System.out.println("2: Cartão de Crédito");
        System.out.println("3: Boleto");
        System.out.print("Digite a opção desejada: ");
        int choice = scanner.nextInt();

        System.out.print("Digite o valor da transação: ");
        double amount = scanner.nextDouble();

        PaymentStrategy paymentStrategy = null;

        switch (choice) {
            case 1:
                paymentStrategy = new PixPayment();
                break;
            case 2:
                paymentStrategy = new CreditCardPayment();
                break;
            case 3:
                paymentStrategy = new BoletoPayment();
                break;
            default:
                System.out.println("Opção inválida!");
                return;
        }

        PaymentProcessor processor = new PaymentProcessor(paymentStrategy);
        processor.executePayment(amount);  
    }
}
