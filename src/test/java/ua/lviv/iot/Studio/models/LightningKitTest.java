package ua.lviv.iot.Studio.models;

import org.junit.jupiter.api.Test;
import ua.lviv.iot.Studio.manager.StudioManager;
import ua.lviv.iot.Studio.manager.StudioManagerImpl;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LightningKitTest {

    @Test
    void makeLight() {
        LightningKit lightningKit = new LightningKit();
        lightningKit.setPower(true);
        assertTrue(lightningKit.isPowerOn() == true);
    }

    @Test
    void getSizeInInches() {
        LightningKit lightningKit = new LightningKit();
        lightningKit.setSizeInInches(160);
        assertTrue(lightningKit.getSizeInInches() == 160);
    }

    @Test
    void setSizeInInches() {
        LightningKit lightningKit = new LightningKit();
        lightningKit.setSizeInInches(160);
        assertTrue(lightningKit.getSizeInInches() == 160);
    }
}
