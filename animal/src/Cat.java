class Cat extends Mammals implements ItHasWool {
    @Override
    public boolean itHasWool() {
        System.out.println("Кошка имеет шерсть.");
        return true; // Возвращаем true
    }
}
