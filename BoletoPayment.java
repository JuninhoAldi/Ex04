public class BoletoPayment implements PaymentStrategy {
    @Override
    public void processPayment(double amount) {
        String boletoCode = "BOLETO-55555555";
        System.out.println("Código de boleto gerado: " + boletoCode);
        System.out.println("Pagamento de R$" + amount);
    }
}
