package factory.plants.model;

public class Tree implements Plant{

    public static final String NAME = "Tree";
    private boolean areFruitsEatable;

    public Tree() {
    }

    public Tree(boolean areFruitsEatable) {
        this.areFruitsEatable = areFruitsEatable;
    }

    public boolean areFruitsEatable() {
        return areFruitsEatable;
    }

    @Override
    public String getDescription() {
        return "Plant name: " + NAME +
                "\nAre fruits eatable? " + areFruitsEatable();
    }
}
