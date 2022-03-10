public abstract class Beverage {
    String description = "";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}

class SmallAmericano extends Beverage {
    public SmallAmericano() {
        description = "Small Americano";
    }

    @Override
    public double cost() {
        return 15.5;
    }
}

class MediumAmericano extends Beverage {
    public MediumAmericano() {
        description = "Medium Americano";
    }

    @Override
    public double cost() {
        return 18.9;
    }
}

class SmallCappuccino extends Beverage {
    public SmallCappuccino() {
        description = "Small Cappuccino";
    }

    @Override
    public double cost() {
        return 13.5;
    }
}

class MediumCappuccino extends Beverage {
    public MediumCappuccino() {
        description = "Medium Cappuccino";
    }

    @Override
    public double cost() {
        return 16.75;
    }
}


class SmallEspresso extends Beverage {
    public SmallEspresso() {
        description = "Small Espresso";
    }

    @Override
    public double cost() {
        return 16.8;
    }
}

class MediumEspresso extends Beverage {
    public MediumEspresso() {
        description = "Medium Espresso";
    }

    @Override
    public double cost() {
        return 19.95;
    }
}

class SmallDecaf extends Beverage {
    public SmallDecaf() {
        description = "Small Decaf";
    }

    @Override
    public double cost() {
        return 0;
    }
}

class MediumDecaf extends Beverage {
    @Override
    public double cost() {
        return 15.0;
    }

    public MediumDecaf() {
        description = "Medium Decaf";
    }
}

class SmallTea extends Beverage {
    public SmallTea() {
        description = "Small Tea";
    }

    @Override
    public double cost() {
        return 2.5;
    }
}

class MediumTea extends Beverage {
    public MediumTea() {
        description = "Medium Tea";
    }

    @Override
    public double cost() {
        return 5;
    }
}

class TurkishCoffee extends Beverage {
    public TurkishCoffee() {
        description = "Turkish Coffee";
    }

    @Override
    public double cost() {
        return 12.0;
    }
}













