package furniturefactorytest;

import factory.furniture.model.Locker;
import factory.furniture.model.Table;
import factory.furniture.modelfactory.FurnitureProducer;
import factory.furniture.modelfactory.LockerProducer;
import factory.furniture.modelfactory.TableProducer;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class FurnitureFactoryTest {
    @Test
    public void shouldCheckLockerDescription() {
        Locker locker = new Locker(4, 2, "wood");

        LockerProducer lockerProducer = new LockerProducer();
        lockerProducer.printFurnitureDescription(locker);

        String expectedLockerDescription = "Furniture name: Locker\n" +
                "Amount of legs: 4\n" +
                "Amount of shelfs: 2\n" +
                "Locker material: wood";

        String actualLockerDescription = locker.getDescription();

        assertThat(expectedLockerDescription, equalTo(actualLockerDescription));
    }

    @Test
    public void shouldCheckTableDescription() {
        Table table = new Table(2, "wood", "steal");

        TableProducer tableProducer = new TableProducer();
        tableProducer.printFurnitureDescription(table);

        String expectedTableDescription = "Furniture name: Table\n" +
                "Amount of legs: 2\n" +
                "Countertop material: wood\n" +
                "Legs material: steal";

        String actualTableDescription = table.getDescription();

        assertThat(expectedTableDescription, equalTo(actualTableDescription));
    }

    @Test
    @DisplayName("Furniture Factory should produce Locker and check it's description")
    public void shouldCheckLockerDescriptionFurnitureFactory() {
        Locker locker = new Locker(5, 3, "mdf");

        FurnitureProducer furnitureProducer = new FurnitureProducer();
        furnitureProducer.printFurnitureDescription(locker);

        String expectedLockerDescription = "Furniture name: Locker\n" +
                "Amount of legs: 5\n" +
                "Amount of shelfs: 3\n" +
                "Locker material: mdf";

        String actualLockerDescription = locker.getDescription();

        assertThat(expectedLockerDescription, equalTo(actualLockerDescription));
    }

    @Test
    @DisplayName("Furniture Factory should produce Table and check it's description")
    public void shouldCheckTableDescriptionFurnitureFactory() {
        Table table = new Table(4, "glass", "wood");

        FurnitureProducer furnitureProducer = new FurnitureProducer();
        furnitureProducer.printFurnitureDescription(table);

        String expectedTableDescription = "Furniture name: Table\n" +
                "Amount of legs: 4\n" +
                "Countertop material: glass\n" +
                "Legs material: wood";

        String actualTableDescription = table.getDescription();

        assertThat(expectedTableDescription, equalTo(actualTableDescription));
    }

}
