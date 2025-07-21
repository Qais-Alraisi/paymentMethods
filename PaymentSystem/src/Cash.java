public class Cash extends paymentMethod {
    public Cash(String name) {
        super(name);
    }
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Cash: "+get_name());
    }
}
