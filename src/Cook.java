import java.util.ArrayList;

class Cook {


    ArrayList<String> drinkToppings = new ArrayList<>();
    ArrayList<String> toppings = new ArrayList();
    Waffle waffle;
    Beverage beverage;

    public void cook(String waffleName) {
        if(waffleName.equals("ThinWaffle")){
            waffle=new ThinWaffle();
        }else if(waffleName.equals("ThickWaffle")){
            waffle=new ThickWaffle();
        }else if(waffleName.equals("SandwichWaffle")){
            waffle=new SandwichWaffle();
        }

        System.out.println("Your waffle is preparing...");
    }

    public void makeBeverage(String name) {
        if (name.equals("SmallAmericano")) {
            beverage = new SmallAmericano();
        }
        if (name.equals("MediumAmericano")) {
            beverage = new MediumAmericano();
        }
        if (name.equals("SmallEspresso")) {
            beverage = new SmallEspresso();
        }
        if (name.equals("SmallCappuccino")) {
            beverage = new SmallCappuccino();
        }
        if (name.equals("MediumCappuccino")) {
            beverage = new MediumCappuccino();
        }
        if (name.equals("MediumEspresso")) {
            beverage = new MediumEspresso();
        }
        if (name.equals("SmallDecaf")) {
            beverage = new SmallDecaf();
        }
        if (name.equals("MediumDecaf")) {
            beverage = new MediumDecaf();
        }
        if (name.equals("SmallTea")) {
            beverage = new SmallTea();
        }
        if (name.equals("MediumTea")) {
            beverage = new MediumTea();
        }
        if (name.equals("TurkishCoffee")) {
            beverage = new TurkishCoffee();

        }
        System.out.println("Your" + beverage.getDescription() + " is preparing...");


    }

    public void decorateWaffle() {
        for (int i = 1; i < toppings.size(); i++) {
            switch (toppings.get(i)) {
                case "Bitter":
                    waffle = new Bitter(waffle);
                    break;
                case "ChocolateMilk":
                    waffle = new ChocolateMilk(waffle);
                    break;
                case "WhiteChocolate":
                    waffle = new WhiteChocolate(waffle);
                    break;
                case "Banana":
                    waffle = new Banana(waffle);
                    break;
                case "Strawberry":
                    waffle = new Strawberry(waffle);
                    break;
                case "Pineapple":
                    waffle = new Pineapple(waffle);
                    break;

                case "ChocolateStones":
                    waffle = new ChocolateStones(waffle);
                    break;

            }
        }
        System.out.println("Your order is ready");
        System.out.println("Total for Waffle:  " + waffle.cost());

    }

    public void decorateBeverage() {
        for (int i = 1; i < drinkToppings.size(); i++) {

            switch (drinkToppings.get(i)) {
                case "Milk":
                    beverage = new Milk(beverage);
                    break;
                case "Mocha":
                    beverage = new Mocha(beverage);
                    break;
                case "Chocolate":
                    beverage = new Chocolate(beverage);
                    break;
                case "Soy":
                    beverage = new Soy(beverage);
                    break;
                case "Vanilla":
                    beverage = new Vanilla(beverage);
                    break;


            }
        }
        System.out.println("Your order is ready");
        System.out.println("Total for beverage:  " + beverage.cost());


    }

}

