package factorywithbuilder.model;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;

@Builder
@Getter
public class Table extends Furniture {
    private int legs;
    private String countertopMaterial;
    private String legsMaterial;

    @Override
    public String getDescription() {
        return "Furniture name: Table" + "," +
                " Amount of legs: " + getLegs() + "," +
                " Countertop material: " + getCountertopMaterial() + "," +
                " Legs material: " + getLegsMaterial();
    }
}
