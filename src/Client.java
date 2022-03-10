import javax.sound.midi.Soundbank;
import java.util.ArrayList;

public class Client {
    public static void main(String[] args) {


        ArrayList<Command> cm = new ArrayList<>();

        Command waffle = new ThinWaffleOrder();
        Waitress w = new Waitress();
        w.takeOrder(waffle, "Bitter");
        w.takeOrder(waffle, "ChocolateStones");
        w.takeOrder(waffle, "WhiteChocolate");
        w.takeOrder(waffle,"Banana");
        w.takeOrder(waffle,"Banana");
        w.takeOrder(waffle,"ChocolateMilk");
        waffle.execute();
        cm.add(waffle);

        Command beverage = new SmallCappuccinoOrder();
        w.takeOrder(beverage, "Vanilla");
        w.takeOrder(beverage, "Chocolate");
        beverage.execute();
        cm.add(beverage);
        System.out.println("***************************");


        PaymentStrategy paymentStrategy = new MobilePayment("1881", "aa");
        paymentStrategy.pay(100, w.takeReceipt(cm));


    }


}

