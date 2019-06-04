package ua.lviv.iot.Studio.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudioEquipmentTest {

    @Test
    void changePosition() {
        StudioEquipment studioEquipment = new StudioEquipment();
        studioEquipment.setCurrentPosition(Position.BACK_MIDDLE);
        assertTrue(studioEquipment.getCurrentPosition() == Position.BACK_MIDDLE);
    }

    @Test
    void getName() {
        StudioEquipment studioEquipment = new StudioEquipment();
        studioEquipment.setName("test");
        assertTrue(studioEquipment.getName() == "test");
    }

    @Test
    void setName() {
        StudioEquipment studioEquipment = new StudioEquipment();
        studioEquipment.setName("test");
        assertTrue(studioEquipment.getName() == "test");
    }

    @Test
    void getId() {
        StudioEquipment studioEquipment = new StudioEquipment();
        studioEquipment.setId(1001);
        assertTrue(studioEquipment.getId() == 1001);
    }

    @Test
    void setId() {
        StudioEquipment studioEquipment = new StudioEquipment();
        studioEquipment.setId(1001);
        assertTrue(studioEquipment.getId() == 1001);
    }

    @Test
    void getPrice() {
        StudioEquipment studioEquipment = new StudioEquipment();
        studioEquipment.setPrice(150);
        assertTrue(studioEquipment.getPrice() == 150);
    }

    @Test
    void setPrice() {
        StudioEquipment studioEquipment = new StudioEquipment();
        studioEquipment.setPrice(150);
        assertTrue(studioEquipment.getPrice() == 150);
    }

    @Test
    void getTypeOfMovie() {
        StudioEquipment studioEquipment = new StudioEquipment();
        studioEquipment.setTypeOfMovie(TypeOfMovie.COMEDY);
        assertTrue(studioEquipment.getTypeOfMovie() == TypeOfMovie.COMEDY);
    }

    @Test
    void setTypeOfMovie() {
        StudioEquipment studioEquipment = new StudioEquipment();
        studioEquipment.setTypeOfMovie(TypeOfMovie.COMEDY);
        assertTrue(studioEquipment.getTypeOfMovie() == TypeOfMovie.COMEDY);
    }

    @Test
    void getCurrentPosition() {
        StudioEquipment studioEquipment = new StudioEquipment();
        studioEquipment.setCurrentPosition(Position.FRONT_MIDDLE);
        assertTrue(studioEquipment.getCurrentPosition() == Position.FRONT_MIDDLE);
    }

    @Test
    void setCurrentPosition() {
        StudioEquipment studioEquipment = new StudioEquipment();
        studioEquipment.setCurrentPosition(Position.FRONT_MIDDLE);
        assertTrue(studioEquipment.getCurrentPosition() == Position.FRONT_MIDDLE);
    }
}