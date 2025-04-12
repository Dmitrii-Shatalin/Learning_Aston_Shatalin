public class Main {
    public static void main(String[] args) {
        Vehicle airplane = new Airplane();
        airplane.cargoTransportation();
        ((Airplane) airplane).hasWings();
        ((Airplane) airplane).hasScrew();

        System.out.println();

        Vehicle helicopter = new Helicopter();
        helicopter.cargoTransportation();
        ((Helicopter) helicopter).hasWheels();
        ((Helicopter) helicopter).hasScrew();

        System.out.println();

        Vehicle boat = new Boat();
        boat.cargoTransportation();
        ((Boat) boat).hasScrew();

        System.out.println();

        Vehicle tanker = new Tanker();
        tanker.cargoTransportation();
        ((Tanker) tanker).hasScrew();

        System.out.println();

        Vehicle truck = new Truck();
        truck.cargoTransportation();
        ((Truck) truck).hasWheels();

        System.out.println();

        Vehicle taxi = new Taxi();
        ((Taxi) taxi).hasWheels();
    }
}