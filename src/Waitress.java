import java.util.ArrayList;

class Waitress {

    public void takeOrder(Command command, String command2) {
        System.out.println(command2 + " added to your order.");
        command.orderUp(command2);
    }
    public double takeReceipt(ArrayList<Command> cm){
        double totalCost=0;
        for (int i = 0; i < cm.size(); i++) {
            totalCost+=cm.get(i).cost();
        }
        System.out.println("TOTAL COST : "+totalCost);
        return totalCost;
    }

}