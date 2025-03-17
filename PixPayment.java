public class PixPayment implements PaymentStrategy {
    @Override
    public void processPayment(double amount) {
        String pixCode = "PIX-55555555";
        System.out.println("Pagamento via Pix: Código gerado: " + pixCode);
        System.out.println("Pagamento de R$" + amount);
    }
}
