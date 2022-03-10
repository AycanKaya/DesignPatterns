public abstract class ToppingDecorator extends Waffle{
    public abstract String getDescription();
}
class Bitter extends ToppingDecorator{
    Waffle waffle;

    public Bitter(Waffle waffle) {
        this.waffle = waffle;
    }

    @Override
    public String getDescription() {
        return waffle.getDescription()+" , bitter";
    }

    @Override
    public double cost() {
        return waffle.cost()+1.5;
    }
}
class ChocolateMilk extends ToppingDecorator{
    Waffle  waffle;

    public ChocolateMilk(Waffle waffle) {
        this.waffle = waffle;
    }

    @Override
    public String getDescription() {
        return waffle.getDescription()+" , chocolate milk";
    }

    @Override
    public double cost() {
        return waffle.cost()+1;
    }
}
class WhiteChocolate extends ToppingDecorator{
    Waffle waffle;

    public WhiteChocolate(Waffle waffle) {
        this.waffle = waffle;
    }

    @Override
    public String getDescription() {
        return waffle.getDescription()+ ", white chocolate";
    }

    @Override
    public double cost() {
        return waffle.cost()+1.75;
    }
}
class Banana extends ToppingDecorator{
Waffle waffle;

    public Banana(Waffle waffle) {
        this.waffle = waffle;
    }

    @Override
    public String getDescription() {
        return waffle.getDescription()+" , banana";
    }

    @Override
    public double cost() {
        return waffle.cost()+2.65;
    }
}
class Strawberry extends ToppingDecorator{
    Waffle waffle;

    public Strawberry(Waffle waffle) {
        this.waffle = waffle;
    }

    @Override
    public String getDescription() {
        return waffle.getDescription()+", strawberry";
    }

    @Override
    public double cost() {
        return waffle.cost()+3.50;
    }
}
class Pineapple extends ToppingDecorator{
    Waffle waffle;

    public Pineapple(Waffle waffle) {
        this.waffle = waffle;
    }

    @Override
    public String getDescription() {
        return waffle.getDescription()+", pineapple";
    }

    @Override
    public double cost() {
        return waffle.cost()+2.80;
    }
}
class ChocolateStones extends ToppingDecorator{
    Waffle waffle;

    public ChocolateStones(Waffle waffle) {
        this.waffle = waffle;
    }

    @Override
    public String getDescription() {
        return waffle.getDescription()+", chocolate stones";
    }

    @Override
    public double cost() {
        return waffle.cost()+0.90;
    }
}