package ua.lviv.iot.Studio.models;

public class LightningKit extends Device {
    private double sizeInInches;

    public LightningKit() {

    }

    public LightningKit(final double sizeInInchesObj) {
        this.sizeInInches = sizeInInchesObj;
    }

    public final void makeLight() {
        if (this.isPowerOn()) {
            System.out.println("Making light...");
        } else {
            System.out.println("Please turn on the device!");
        }
    }

    public final double getSizeInInches() {
        return sizeInInches;
    }

    public final void setSizeInInches(final double sizeInInchesObj) {
        this.sizeInInches = sizeInInchesObj;
    }

    @Override
    public final String toString() {
        return "LightningKit{"
                + "sizeInInches="
                + sizeInInches
                + '}';
    }
}
