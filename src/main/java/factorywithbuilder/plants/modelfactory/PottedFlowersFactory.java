package factorywithbuilder.plants.modelfactory;

import factorywithbuilder.plants.model.Plant;

public class PottedFlowersFactory implements PlantFactory {
    @Override
    public void printPlantDescription(Plant plant) {
        System.out.println(plant.getDescription());
    }
}
