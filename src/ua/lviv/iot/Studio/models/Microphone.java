package ua.lviv.iot.Studio.models;

public class Microphone extends Device {
    private boolean ableToRecordStereo;

    public Microphone() {

    }

    public Microphone(final boolean ableToRecordStereoObj) {
        this.ableToRecordStereo = ableToRecordStereoObj;
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
}
