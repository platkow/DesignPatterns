package factory.furniture.model;

public class Table extends Furniture {
    private int legs;
    private String countertopMaterial;
    private String legsMaterial;

    public Table() {
    }

    public Table(int legs, String countertopMaterial, String legsMaterial) {
        this.legs = legs;
        this.countertopMaterial = countertopMaterial;
        this.legsMaterial = legsMaterial;
    }

    public int getLegs() {
        return legs;
    }

    public String getCountertopMaterial() {
        return countertopMaterial;
    }

    public String getLegsMaterial() {
        return legsMaterial;
    }

    @Override
    public String getDescription() {
        return "Furniture name: Table" +
                "\nAmount of legs: " + getLegs() +
                "\nCountertop material " + getCountertopMaterial() +
                "\nLegs material: " + getLegsMaterial();
    }

}
