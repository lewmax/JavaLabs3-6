package ua.lviv.iot.Studio.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeviceTest {

    @Test
    void isPowerOn() {
        Device device = new Device();
        device.setPower(true);
        assertTrue(device.isPowerOn() == true);
    }

    @Test
    void setPower() {
        Device device = new Device();
        device.setPower(true);
        assertTrue(device.isPowerOn() == true);
    }

    @Test
    void powerOnOff() {
        Device device = new Device();
        device.setPower(false);
        assertTrue(device.isPowerOn() == false);
    }
}