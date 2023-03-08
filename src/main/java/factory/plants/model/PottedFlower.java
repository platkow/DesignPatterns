package factory.plants.model;

public class PottedFlower implements Plant{

    public static final String NAME = "Potted flower";
    private String soil;
    private String potProducer;

    public PottedFlower() {
    }

    public PottedFlower(String soil, String potProducer) {
        this.soil = soil;
        this.potProducer = potProducer;
    }

    public String getSoil() {
        return soil;
    }

    public String getPotProducer() {
        return potProducer;
    }

    @Override
    public String getDescription() {
        return "Plant name: " + NAME +
                "\nSoil: " + getSoil() +
                "\nPot producer: " + getPotProducer();
    }
}
