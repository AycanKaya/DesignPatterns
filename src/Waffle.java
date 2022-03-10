public abstract class Waffle {
    String description="";
    public String getDescription(){
        return description;
    }
    public abstract double cost();
}
class ThinWaffle extends Waffle{

    public ThinWaffle() {
        description="Thin Waffle";
    }

    @Override
    public double cost() {
        return 10;
    }
}
class ThickWaffle extends Waffle{

    public ThickWaffle() {
        description="Thick Waffle";
    }

    @Override
    public double cost() {
        return 11.80;
    }
}
class SandwichWaffle extends Waffle{

    public SandwichWaffle() {
        description="Sandwich Waffle";
    }

    @Override
    public double cost() {
        return 14.90;
    }
}