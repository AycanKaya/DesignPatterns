public abstract class CondimentsDecorator extends Beverage{
    public abstract String getDescription();
}
class Milk extends CondimentsDecorator{
    Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost()+1.9;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+", Milk";
    }
}
class Mocha extends CondimentsDecorator{
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost()+2.5;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+", Mocha";
    }
}
class Chocolate extends CondimentsDecorator{
    Beverage beverage;

    public Chocolate(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost()+2.85;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+", Chocolate";
    }
}
class Soy  extends CondimentsDecorator{
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost()+3.0;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+", Soy";
    }
}
class Vanilla extends CondimentsDecorator{
    Beverage beverage;

    public Vanilla(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost()+0.8;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+", Vanilla";
    }
}