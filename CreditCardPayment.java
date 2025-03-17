import java.util.Scanner;

public class CreditCardPayment implements PaymentStrategy {
    @Override
    public void processPayment(double amount) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número do cartão de crédito (fictício): ");
        String cardNumber = scanner.nextLine();
        System.out.println("Pagamento via Cartão de Crédito: Número do cartão " + cardNumber);
        System.out.println("Pagamento de R$" + amount + " confirmado com sucesso!");
    }
}
