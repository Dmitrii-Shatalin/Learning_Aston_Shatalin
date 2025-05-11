interface FillStrategy {
    void fill();
}

class HybridFillStrategy implements FillStrategy {
    public void fill() {
        System.out.println("Заправка: бензин + электричество");
    }
}

class Auto {
    private FillStrategy strategy;

    public Auto(FillStrategy strategy) {
        this.strategy = strategy;
    }

    void fill() {
        strategy.fill();
    }
}
