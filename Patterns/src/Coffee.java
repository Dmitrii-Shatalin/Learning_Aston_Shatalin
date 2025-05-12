interface Coffee {
    double getCost();
    String getDescription();
}

class BasicCoffee implements Coffee {
    public double getCost() { return 1.0; }
    public String getDescription() { return "Кофе"; }
}

abstract class CoffeeDecorator implements Coffee {
    protected Coffee decoratedCoffee;

    CoffeeDecorator(Coffee coffee) {
        this.decoratedCoffee = coffee;
    }
}

class MilkDecorator extends CoffeeDecorator {
    MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    public double getCost() {
        return decoratedCoffee.getCost() + 0.5;
    }

    public String getDescription() {
        return decoratedCoffee.getDescription() + ", Молоко";
    }
}

class SugarDecorator extends CoffeeDecorator {
    SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    public double getCost() {
        return decoratedCoffee.getCost() + 0.2;
    }

    public String getDescription() {
        return decoratedCoffee.getDescription() + ", Сахар";
    }
}