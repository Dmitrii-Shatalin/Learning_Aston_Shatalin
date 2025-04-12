class Airplane extends ScrewVehicle implements CargoTransportation {
    public Airplane() {
        type = "Самолет";
    }

    public void hasWings() {
        System.out.println("Самолет имеет крылья.");
    }
}
