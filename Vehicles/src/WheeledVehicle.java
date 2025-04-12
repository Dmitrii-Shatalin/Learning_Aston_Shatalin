abstract class WheeledVehicle extends Vehicle implements HasWheels {
    @Override
    public void hasWheels() {
        System.out.println(type + " имеет колеса.");
    }
}