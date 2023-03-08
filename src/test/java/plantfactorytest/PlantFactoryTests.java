package plantfactorytest;

import factory.plants.model.PottedFlower;
import factory.plants.model.Tree;
import factory.plants.modelfactory.PottedFlowersFactory;
import factory.plants.modelfactory.TreeFactory;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class PlantFactoryTests {
    @Test
    public void shouldCheckPottedFlowerDescription() {
        PottedFlower pottedFlower = new PottedFlower("torg", "DWP");

        PottedFlowersFactory pottedFlowersFactory = new PottedFlowersFactory();
        pottedFlowersFactory.printPlantDescription(pottedFlower);

        String expectedPottedFlowerDescription = "Plant name: Potted flower\n" +
                "Soil: torg\n" +
                "Pot producer: DWP";

        String actualPottedFlowerDescription = pottedFlower.getDescription();

        assertThat(expectedPottedFlowerDescription, equalTo(actualPottedFlowerDescription));
    }

    @Test
    public void shouldCheckTreeDescription() {
        Tree tree = new Tree(false);

        TreeFactory treeFactory = new TreeFactory();
        treeFactory.printPlantDescription(tree);

        String expectedTreeDescription = "Plant name: Tree\n" +
                "Are fruits eatable? false";

        String actualTreeDescription = tree.getDescription();

        assertThat(expectedTreeDescription, equalTo(actualTreeDescription));
    }
}
