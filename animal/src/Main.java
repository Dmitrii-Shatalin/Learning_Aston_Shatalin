public class Main {
    public static void main(String[] args) {
        Mammals bear = new Bear();
        bear.itHasWool();
        System.out.println("Медведь имеет: " + bear.getSpine());

        Mammals cat = new Cat();
        cat.itHasWool();
        System.out.println("Кошка имеет: " + cat.getSpine());

        Whale whale = new Whale();
        whale.lifeInTheWater();
        System.out.println("Кит имеет: " + whale.getSpine());

        Fish fish = new Fish() {
            @Override
            public void lifeInTheWater() {
                super.lifeInTheWater();
            }
        };
        fish.lifeInTheWater();
    }
}
