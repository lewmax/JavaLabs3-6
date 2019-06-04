package ua.lviv.iot.Studio.models;

public class Device extends StudioEquipment {
    private boolean power;

    public Device() {

    }

    public Device(boolean power) {
        this.power = power;
    }

    public Device(String nameObj, int idObj, int priceObj, Position positionObj,
                  TypeOfMovie typeOfMovieObj, boolean power) {
        super(nameObj, idObj, priceObj, positionObj, typeOfMovieObj);
        this.power = power;
    }

    public final boolean isPowerOn() {
        return power;
    }

    public final void setPower(final boolean powerObj) {
        this.power = powerObj;
    }

    public final void powerOnOff() {
        if (this.isPowerOn()) {
            this.power = false;
        } else {
            this.power = true;
        }
    }

    @Override
    public String toString() {
        return "Device{"
                + "power="
                + power
                + '}';
    }

    public String getHeaders() {
        return super.getHeaders() + ","
                    + "power";
    }

    public String toCSV() {
        return super.toCSV() + ","
                + power;
    }

}
