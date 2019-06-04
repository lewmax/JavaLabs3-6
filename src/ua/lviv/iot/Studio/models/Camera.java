package ua.lviv.iot.Studio.models;

public class Camera extends Device {
    private ModelOfCamera model;
    private int numberOfMegapixels;
    private int maxFPS;
    private double amperture;
    private int batteryEndurance;

    public Camera() {

    }

    public Camera(final ModelOfCamera modelObj, final int numberOfMegapixelsObj,
                  final int maxFPSObj, final double ampertureObj,
                  final int batteryEnduranceObj) {
        this.model = modelObj;
        this.numberOfMegapixels = numberOfMegapixelsObj;
        this.maxFPS = maxFPSObj;
        this.amperture = ampertureObj;
        this.batteryEndurance = batteryEnduranceObj;
    }

    public final void recordVideo() {
        if (this.isPowerOn()) {
            System.out.println("Recording a video...");
        } else {
            System.out.println("Please turn on the device!");
        }
    }

    public final void takePhoto() {
        if (this.isPowerOn()) {
            System.out.println("Taking a photo...");
        } else {
            System.out.println("Please turn on the device!");
        }
    }

    public final ModelOfCamera getModel() {
        return model;
    }

    public final void setModel(final ModelOfCamera modelObj) {
        this.model = modelObj;
    }

    public final int getNumberOfMegapixels() {
        return numberOfMegapixels;
    }

    public final void setNumberOfMegapixels(final int numberOfMegapixelsObj) {
        this.numberOfMegapixels = numberOfMegapixelsObj;
    }

    public final int getMaxFPS() {
        return maxFPS;
    }

    public final void setMaxFPS(final int maxFPSObj) {
        this.maxFPS = maxFPSObj;
    }

    public final double getAmperture() {
        return amperture;
    }

    public final void setAmperture(final double ampertureObj) {
        this.amperture = ampertureObj;
    }

    public final int getBatteryEndurance() {
        return batteryEndurance;
    }

    public final void setBatteryEndurance(final int batteryEnduranceObj) {
        this.batteryEndurance = batteryEnduranceObj;
    }

    @Override
    public final String toString() {
        return "Camera{"
                + "model="
                + model
                + ", numberOfMegapixels="
                + numberOfMegapixels
                + ", maxFPS="
                + maxFPS
                + ", amperture="
                + amperture
                + ", batteryEndurance="
                + batteryEndurance
                + '}';
    }
}
