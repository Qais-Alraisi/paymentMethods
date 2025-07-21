public abstract class paymentMethod {
    private String _name;

    public paymentMethod(String name) {
        _name = name;
    }

    String get_name() {
        return _name;
    }

    public abstract void pay(double amount);
}
