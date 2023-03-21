package furniturefactorywithbuilder;

import factorywithbuilder.furniture.model.Locker;
import factorywithbuilder.furniture.model.Table;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class FurnitureFactoryWithBuilderTest {
    @Test
    public void shouldCheckTableDescription() {
        Table table = Table.builder()
                .legs(6)
                .countertopMaterial("glass")
                .legsMaterial("steal")
                .build();

        System.out.println(table.getDescription());

        String expectedTableDescription = "Furniture name: Table, Amount of legs: 6, Countertop material: glass, Legs material: steal";

        assertThat(expectedTableDescription, equalTo(table.getDescription()));
    }

    @Test
    public void shouldCheckLockerDescription() {
        Locker locker = Locker.builder()
                .legs(4)
                .shelfs(4)
                .lockerMaterial("steal and glass")
                .build();

        System.out.println(locker.getDescription());

        String expectedLockerDescription = "Furniture name: Locker , Amount of legs: 4, Amount of shelfs:  4, Locker material:  steal and glass";

        assertThat(expectedLockerDescription, equalTo(locker.getDescription()));
    }
}
