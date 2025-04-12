abstract class Vehicle {
    protected String type;

    public String getType() {
        return type;
    }

    public void cargoTransportation() {
        System.out.println(type + " может перевозить грузы.");
    }
}