package ua.lviv.iot.Studio.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecorationTest {

    @Test
    void getHeight() {
        Decoration decoration = new Decoration();
        decoration.setHeight(110);
        assertTrue(decoration.getHeight() == 110);
    }

    @Test
    void setHeight() {
        Decoration decoration = new Decoration();
        decoration.setHeight(110);
        assertTrue(decoration.getHeight() == 110);
    }

    @Test
    void getWidth() {
        Decoration decoration = new Decoration();
        decoration.setWidth(40);
        assertTrue(decoration.getWidth() == 40);
    }

    @Test
    void setWidth() {
        Decoration decoration = new Decoration();
        decoration.setWidth(40);
        assertTrue(decoration.getWidth() == 40);
    }

    @Test
    void getWeight() {
        Decoration decoration = new Decoration();
        decoration.setWeight(10);
        assertTrue(decoration.getWeight() == 10);
    }

    @Test
    void setWeight() {
        Decoration decoration = new Decoration();
        decoration.setWeight(10);
        assertTrue(decoration.getWeight() == 10);
    }

}