package ua.lviv.iot.Studio.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CameraTest {

    @Test
    void recordVideo() {
        Camera camera = new Camera();
        camera.setPower(true);
        assertTrue(camera.isPowerOn() == true);
    }

    @Test
    void takePhoto() {
        Camera camera = new Camera();
        camera.setPower(true);
        assertTrue(camera.isPowerOn() == true);
    }

    @Test
    void getModel() {
        Camera camera = new Camera();
        camera.setModel(ModelOfCamera.CANON);
        assertTrue(camera.getModel() == ModelOfCamera.CANON);
    }

    @Test
    void setModel() {
        Camera camera = new Camera();
        camera.setModel(ModelOfCamera.CANON);
        assertTrue(camera.getModel() == ModelOfCamera.CANON);
    }

    @Test
    void getNumberOfMegapixels() {
        Camera camera = new Camera();
        camera.setNumberOfMegapixels(16);
        assertTrue(camera.getNumberOfMegapixels() == 16);
    }

    @Test
    void setNumberOfMegapixels() {
        Camera camera = new Camera();
        camera.setNumberOfMegapixels(16);
        assertTrue(camera.getNumberOfMegapixels() == 16);
    }

    @Test
    void getMaxFPS() {
        Camera camera = new Camera();
        camera.setMaxFPS(120);
        assertTrue(camera.getMaxFPS() == 120);
    }

    @Test
    void setMaxFPS() {
        Camera camera = new Camera();
        camera.setMaxFPS(120);
        assertTrue(camera.getMaxFPS() == 120);
    }

    @Test
    void getAmperture() {
        Camera camera = new Camera();
        camera.setAmperture(1.8);
        assertTrue(camera.getAmperture() == 1.8);
    }

    @Test
    void setAmperture() {
        Camera camera = new Camera();
        camera.setAmperture(1.8);
        assertTrue(camera.getAmperture() == 1.8);
    }

    @Test
    void getBatteryEndurance() {
        Camera camera = new Camera();
        camera.setBatteryEndurance(2);
        assertTrue(camera.getBatteryEndurance() == 2);
    }

    @Test
    void setBatteryEndurance() {
        Camera camera = new Camera();
        camera.setBatteryEndurance(2);
        assertTrue(camera.getBatteryEndurance() == 2);
    }

}