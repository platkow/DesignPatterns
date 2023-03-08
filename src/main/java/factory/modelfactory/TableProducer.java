package factory.modelfactory;

import factory.model.Furniture;

public class TableProducer implements FurnitureFactory{
    @Override
    public void printFurnitureDescription(Furniture furniture) {
        System.out.println(furniture.getDescription());
    }
}
