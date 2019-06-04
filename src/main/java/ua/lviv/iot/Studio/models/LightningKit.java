package ua.lviv.iot.Studio.models;

public class LightningKit extends Device {
    private double sizeInInches;

    public LightningKit() {

    }

    public LightningKit(double sizeInInches) {
        this.sizeInInches = sizeInInches;
    }

    public LightningKit(boolean power, double sizeInInches) {
        super(power);
        this.sizeInInches = sizeInInches;
    }

    public LightningKit(String nameObj, int idObj, int priceObj,
                        Position positionObj, TypeOfMovie typeOfMovieObj,
                        boolean power, double sizeInInches) {
        super(nameObj, idObj, priceObj, positionObj, typeOfMovieObj, power);
        this.sizeInInches = sizeInInches;
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

    @Override
    public String getHeaders() {
        return super.getHeaders() + ","
                + "sizeInInches";
    }

    @Override
    public String toCSV() {
        return super.toCSV() + ","
                + sizeInInches;
    }
}
