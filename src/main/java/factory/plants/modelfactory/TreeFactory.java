package factory.plants.modelfactory;

import factory.plants.model.Plant;

public class TreeFactory implements PlantFactory{
    @Override
    public void printPlantDescription(Plant plant) {
        System.out.println(plant.getDescription());
    }
}
