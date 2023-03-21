package factorywithbuilder.furniture.modelfactory;

import factory.furniture.model.Furniture;
import factory.furniture.modelfactory.FurnitureFactory;

public class FurnitureProducer implements FurnitureFactory {
    @Override
    public void printFurnitureDescription(Furniture furniture) {
        System.out.println(furniture.getDescription());
    }
}
