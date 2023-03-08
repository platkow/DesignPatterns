package factory.furniture.model;

public class Locker extends Furniture {
    private int legs;
    private int shelfs;
    private String lockerMaterial;

    public Locker() {
    }

    public Locker(int legs, int shelfs, String lockerMaterial) {
        this.legs = legs;
        this.shelfs = shelfs;
        this.lockerMaterial = lockerMaterial;
    }

    public int getLegs() {
        return legs;
    }

    public int getShelfs() {
        return shelfs;
    }

    public String getLockerMaterial() {
        return lockerMaterial;
    }

    @Override
    public String getDescription() {
        return "Furniture name: Locker" +
                "\nAmount of legs: " + getLegs() +
                "\nAmount of shelfs: " + getShelfs() +
                "\nLocker material: " + getLockerMaterial();
    }
}
