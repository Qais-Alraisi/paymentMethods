public class CreditCard extends paymentMethod {
    public CreditCard(String name) {
        super(name);
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card: "+get_name());
    }
}
