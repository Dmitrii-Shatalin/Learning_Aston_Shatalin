abstract class ScrewVehicle extends Vehicle implements HasScrew {
    @Override
    public void hasScrew() {
        System.out.println(type + " имеет винт.");
    }
}