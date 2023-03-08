package factory.plants.modelfactory;

import factory.plants.model.Plant;

public class PottedFlowersFactory implements PlantFactory{
    @Override
    public void printPlantDescription(Plant plant) {
        System.out.println(plant.getDescription());
    }
}
