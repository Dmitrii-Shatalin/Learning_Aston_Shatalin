class Helicopter extends ScrewVehicle implements CargoTransportation, HasWheels {
    public Helicopter() {
        type = "Вертолет";
    }

    @Override
    public void hasWheels() {
        System.out.println("Вертолет имеет колеса.");
    }
}