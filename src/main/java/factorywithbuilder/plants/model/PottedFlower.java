package factorywithbuilder.plants.model;

import factory.plants.model.Plant;

public class PottedFlower implements Plant {
    private String soil;
    private String potProducer;

    private PottedFlower(String soil, String potProducer) {
        this.soil = soil;
        this.potProducer = potProducer;
    }

    public String getSoil() {
        return soil;
    }

    public String getPotProducer() {
        return potProducer;
    }

    static PottedFlowerBuilder builder() {
        return new PottedFlowerBuilder();
    }

    static class PottedFlowerBuilder {
        private String soil;
        private String potProducer;

        PottedFlowerBuilder soil(String soil) {
            this.soil = soil;
            return this;
        }

        PottedFlowerBuilder potProducer(String potProducer) {
            this.potProducer = potProducer;
            return this;
        }

        PottedFlower build() {
            return new PottedFlower(soil, potProducer);
        }
    }

    @Override
    public String getDescription() {
        return "Plant name: Potted flower" +
                " Soil: " + getSoil() +
                " Pot producer: " + getPotProducer();
    }
}
