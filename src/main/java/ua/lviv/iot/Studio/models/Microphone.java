package ua.lviv.iot.Studio.models;

public class Microphone extends Device {
    private boolean ableToRecordStereo;

    public Microphone() {

    }

    public Microphone(boolean ableToRecordStereo) {
        this.ableToRecordStereo = ableToRecordStereo;
    }

    public Microphone(boolean power, boolean ableToRecordStereo) {
        super(power);
        this.ableToRecordStereo = ableToRecordStereo;
    }

    public Microphone(String nameObj, int idObj, int priceObj,
                      Position positionObj, TypeOfMovie typeOfMovieObj,
                      boolean power, boolean ableToRecordStereo) {
        super(nameObj, idObj, priceObj, positionObj, typeOfMovieObj, power);
        this.ableToRecordStereo = ableToRecordStereo;
    }

    public final void recordVoice() {
        if (this.isPowerOn()) {
            System.out.println("Recording voice...");
        } else {
            System.out.println("Please turn on the device!");
        }
    }

    public final boolean isAbleToRecordStereo() {
        return ableToRecordStereo;
    }

    public final void setAbleToRecordStereo(
            final boolean ableToRecordStereoObj) {
        this.ableToRecordStereo = ableToRecordStereoObj;
    }

    @Override
    public final String toString() {
        return "Microphone{"
                + "ableToRecordStereo="
                + ableToRecordStereo
                + '}';
    }

    public String getHeaders() {
        return super.getHeaders() + ","
                + "ableToRecordStereo";
    }

    public String toCSV() {
        return super.toCSV() + "," + ableToRecordStereo;
    }
}
