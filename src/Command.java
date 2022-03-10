import java.util.ArrayList;

public interface Command {
    void orderUp(String command);
    void execute();
    double cost();

}
class ThinWaffleOrder implements Command{

    public ArrayList<String> orders = new ArrayList<>();
    Cook cook;

    @Override
    public void orderUp(String command) {
        orders.add(command);
    }

    @Override
    public void execute() {
        cook = new Cook();
        cook.toppings = orders;
        cook.cook("ThinWaffle");
        cook.decorateWaffle();

    }

    @Override
    public double cost() {
        return cook.waffle.cost();
    }
}
class ThickWaffleOrder implements Command{
    public ArrayList<String> orders = new ArrayList<>();
    Cook cook;

    @Override
    public void orderUp(String command) {
        orders.add(command);
    }

    @Override
    public void execute() {
        cook = new Cook();
        cook.toppings = orders;
        cook.cook("ThickWaffle");
        cook.decorateWaffle();

    }

    @Override
    public double cost() {
        return cook.waffle.cost();
    }
}
class SandwichWaffleOrder implements Command{
    public ArrayList<String> orders = new ArrayList<>();
    Cook cook;

    @Override
    public void orderUp(String command) {
        orders.add(command);
    }

    @Override
    public void execute() {
        cook = new Cook();
        cook.toppings = orders;
        cook.cook("SandwichWaffle");
        cook.decorateWaffle();

    }

    @Override
    public double cost() {
        return cook.waffle.cost();
    }
}
class SmallAmericanoOrder implements Command{
    public ArrayList<String> orders = new ArrayList<>();
    Cook cook;
    @Override
    public void orderUp(String command) {
        orders.add(command);
    }

    @Override
    public void execute() {
        cook = new Cook();
        cook.drinkToppings = orders;
        cook.makeBeverage("SmallAmericano");
        cook.decorateBeverage();


    }

    @Override
    public double cost() {
        return cook.beverage.cost();
    }
}
class MediumAmericanoOrder implements Command{
    public ArrayList<String> orders = new ArrayList<>();
    Cook cook;
    @Override
    public void orderUp(String command) {
        orders.add(command);
    }

    @Override
    public void execute() {
        cook = new Cook();
        cook.drinkToppings = orders;
        cook.makeBeverage("MediumAmericano");
        cook.decorateBeverage();


    }

    @Override
    public double cost() {
        return cook.beverage.cost();
    }
}
class SmallCappuccinoOrder implements Command{
    public ArrayList<String> orders = new ArrayList<>();
    Cook cook;
    @Override
    public void orderUp(String command) {
        orders.add(command);
    }

    @Override
    public void execute() {
        cook = new Cook();
        cook.drinkToppings = orders;
        cook.makeBeverage("SmallCappuccino");
        cook.decorateBeverage();


    }

    @Override
    public double cost() {
        return cook.beverage.cost();
    }
}
class MediumCappuccinoOrder implements Command{
    public ArrayList<String> orders = new ArrayList<>();
    Cook cook;
    @Override
    public void orderUp(String command) {
        orders.add(command);
    }

    @Override
    public void execute() {
        cook = new Cook();
        cook.drinkToppings = orders;
        cook.makeBeverage("MediumCappuccino");
        cook.decorateBeverage();


    }

    @Override
    public double cost() {
        return cook.beverage.cost();
    }
}
class SmallEspressoOrder implements Command{
    public ArrayList<String> orders = new ArrayList<>();
    Cook cook;
    @Override
    public void orderUp(String command) {
        orders.add(command);
    }

    @Override
    public void execute() {
        cook = new Cook();
        cook.drinkToppings = orders;
        cook.makeBeverage("SmallEspresso");
        cook.decorateBeverage();


    }

    @Override
    public double cost() {
        return cook.beverage.cost();
    }
}
class MediumEspressoOrder implements Command{
    public ArrayList<String> orders = new ArrayList<>();
    Cook cook;
    @Override
    public void orderUp(String command) {
        orders.add(command);
    }

    @Override
    public void execute() {
        cook = new Cook();
        cook.drinkToppings = orders;
        cook.makeBeverage("MediumEspresso");
        cook.decorateBeverage();


    }

    @Override
    public double cost() {
        return cook.beverage.cost();
    }
}
class SmallDecafOrder implements Command{
    public ArrayList<String> orders = new ArrayList<>();
    Cook cook;
    @Override
    public void orderUp(String command) {
        orders.add(command);
    }

    @Override
    public void execute() {
        cook = new Cook();
        cook.drinkToppings = orders;
        cook.makeBeverage("SmallDecaf");
        cook.decorateBeverage();


    }

    @Override
    public double cost() {
        return cook.beverage.cost();
    }
}
class MediumDecafOrder implements Command{
    public ArrayList<String> orders = new ArrayList<>();
    Cook cook;
    @Override
    public void orderUp(String command) {
        orders.add(command);
    }

    @Override
    public void execute() {
        cook = new Cook();
        cook.drinkToppings = orders;
        cook.makeBeverage("MediumDecaf");
        cook.decorateBeverage();


    }

    @Override
    public double cost() {
        return cook.beverage.cost();
    }
}
class SmallTeaOrder implements Command{
    public ArrayList<String> orders = new ArrayList<>();
    Cook cook;
    @Override
    public void orderUp(String command) {
        orders.add(command);
    }

    @Override
    public void execute() {
        cook = new Cook();
        cook.drinkToppings = orders;
        cook.makeBeverage("SmallTea");
        cook.decorateBeverage();


    }

    @Override
    public double cost() {
        return cook.beverage.cost();
    }
}
class MediumTeaOrder implements Command{
    public ArrayList<String> orders = new ArrayList<>();
    Cook cook;
    @Override
    public void orderUp(String command) {
        orders.add(command);
    }

    @Override
    public void execute() {
        cook = new Cook();
        cook.drinkToppings = orders;
        cook.makeBeverage("MediumTea");
        cook.decorateBeverage();


    }

    @Override
    public double cost() {
        return cook.beverage.cost();
    }
}
class TurkishCoffeeOrder implements Command {
    public ArrayList<String> orders = new ArrayList<>();
    Cook cook;

    @Override
    public void orderUp(String command) {
        orders.add(command);
    }

    @Override
    public void execute() {
        cook = new Cook();
        cook.drinkToppings = orders;
        cook.makeBeverage("TurkishCoffee");
        cook.decorateBeverage();


    }

    @Override
    public double cost() {
        return cook.beverage.cost();
    }
}


