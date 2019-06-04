package ua.lviv.iot.Studio.models;

public class Device extends StudioEquipment {
    private boolean power;

    public Device() {

    }

    public Device(final String nameObj, final int idObj, final int priceObj,
                  final Position positionObj,
                  final TypeOfMovie typeOfMovieObj, final boolean powerObj) {
        super(nameObj, idObj, priceObj, positionObj, typeOfMovieObj);
        this.power = powerObj;
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
}
