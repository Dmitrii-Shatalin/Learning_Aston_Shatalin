class Bear extends Mammals implements ItHasWool {
    @Override
    public boolean itHasWool() {
        System.out.println("Медведь имеет шерсть.");
        return true; // Возвращаем true, так как медведь имеет шерсть
    }
}
