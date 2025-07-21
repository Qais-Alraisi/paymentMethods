public class Main {
    public static void main(String[] args) {
        paymentMethod cardPayment = new CreditCard("Visa");
        paymentMethod cashPayment = new Cash("Wallet");

        cardPayment.pay(50);
        cashPayment.pay(20);
    }
}