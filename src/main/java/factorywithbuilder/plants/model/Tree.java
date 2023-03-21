package factorywithbuilder.plants.model;

import factory.plants.model.Plant;

public class Tree implements Plant {
    private boolean areFruitsEatable;


    private Tree(boolean areFruitsEatable) {
        this.areFruitsEatable = areFruitsEatable;
    }

    public boolean areFruitsEatable() {
        return areFruitsEatable;
    }

    static TreeBuilder builder(){
        return new TreeBuilder();
    }

    public static class TreeBuilder{
        private boolean areFruitsEatable;

        TreeBuilder areFruitsEatable(boolean areFruitsEatable){
            this.areFruitsEatable = areFruitsEatable;
            return this;
        }

        Tree build(){
            return new Tree(areFruitsEatable);
        }
    }

    @Override
    public String getDescription() {
        return "Plant name: Tree" +
                " Are fruits eatable? " + areFruitsEatable();
    }
}
