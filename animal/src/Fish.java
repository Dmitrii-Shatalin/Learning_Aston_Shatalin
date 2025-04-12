abstract class Fish extends Animal implements LifeInTheWater {
    @Override
    public void lifeInTheWater() {
        System.out.println("Рыба живет в воде.");
    }
}
