package factory.furniture.modelfactory;

import factory.furniture.model.Furniture;

public class TableProducer implements FurnitureFactory{
    @Override
    public void printFurnitureDescription(Furniture furniture) {
        System.out.println(furniture.getDescription());
    }
}
