package factorywithbuilder.model;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Locker extends Furniture{
    private int legs;
    private int shelfs;
    private String lockerMaterial;

    @Override
    public String getDescription() {
        return "Furniture name: Locker " + "," +
                " Amount of legs: " + getLegs() + "," +
                " Amount of shelfs:  " + getShelfs() + "," +
                " Locker material:  " + getLockerMaterial();
    }
}
