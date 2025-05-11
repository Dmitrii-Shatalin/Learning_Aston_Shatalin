public class Main {
    public static void main(String[] args) {

        System.out.println("\n1. Стратегия:");
        Auto hybridCar = new Auto(new HybridFillStrategy());
        hybridCar.fill();

        System.out.println("\n2. Цепочка обязанностей:");
        Handler authHandler = new AuthHandler();
        Handler logHandler = new LogHandler();
        authHandler.setNext(logHandler);
        authHandler.handle("Данные запроса");

        System.out.println("\n3. Строитель:");
        Computer gamingPC = new Computer.Builder()
                .setCPU("Intel Core i7")
                .setRAM("32GB")
                .setSSD("1TB")
                .build();
        gamingPC.showSpecs();

        System.out.println("\n4. Прокси:");
        SecretDocument doc1 = new DocumentProxy("Очень секретно: Собаки умеют говорить", "user");
        SecretDocument doc2 = new DocumentProxy("Секретно: Собаки самые верные животные", "admin");

        doc1.displayContent();
        doc2.displayContent();

        System.out.println("\n5. Декоратор:");
        Coffee coffee = new SugarDecorator(new MilkDecorator(new BasicCoffee()));
        System.out.println("Состав: " + coffee.getDescription());
        System.out.println("Цена: $" + coffee.getCost());

        System.out.println("\n6. Адаптер:");
        ModernPrinter printer = new PrinterAdapter(new LegacyPrinter());
        printer.print();
    }
}