package ua.lviv.iot.Studio.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MicrophoneTest {

    @Test
    void recordVoice() {
        Microphone microphone = new Microphone();
        microphone.setPower(true);
        assertTrue(microphone.isPowerOn() == true);
    }

    @Test
    void isAbleToRecordStereo() {
        Microphone microphone = new Microphone();
        microphone.setAbleToRecordStereo(false);
        assertTrue(microphone.isAbleToRecordStereo() == false);
    }

    @Test
    void setAbleToRecordStereo() {
        Microphone microphone = new Microphone();
        microphone.setAbleToRecordStereo(false);
        assertTrue(microphone.isAbleToRecordStereo() == false);
    }
}