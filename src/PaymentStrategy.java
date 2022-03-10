public interface PaymentStrategy {
    void pay(double money,double cost);
}
class CreditCart implements   PaymentStrategy{
    String cartNumber;
    String password;
    String name;

    public CreditCart(String cartNumber, String password,String name) {
        this.cartNumber = cartNumber;
        this.password = password;
        this.name=name;
    }

    @Override
    public void pay(double money,double cost) {
        System.out.println("Your receipt : "+cost+"\n"+ "Your payment : "+money+"\n"+"Remainder of Money : "+(money-cost));
    }
}
class MobilePayment implements PaymentStrategy{
    String password;
    String email;

    public MobilePayment(String password, String email) {
        this.password = password;
        this.email = email;
    }

    @Override
    public void pay(double money,double cost) {
        System.out.println("Your receipt : "+cost+"\n"+ "Your payment : "+money+"\n"+"Remainder of Money : "+(money-cost));

    }
}
class CashPayment implements PaymentStrategy{
    Double money;

    public CashPayment(Double money) {
        this.money = money;
    }

    @Override
    public void pay(double money,double cost) {
        System.out.println("Your receipt : "+cost+"\n"+ "Your payment : "+money+"\n"+"Remainder of Money : "+(money-cost));

    }
}