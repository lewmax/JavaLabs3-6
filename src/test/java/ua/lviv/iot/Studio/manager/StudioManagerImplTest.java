package ua.lviv.iot.Studio.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.Studio.models.*;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StudioManagerImplTest {

    private List<StudioEquipment> listOfStudioEquipments;
    private List<StudioEquipment> expectedList;

    private StudioManager studioManager;

    private StudioEquipment microphone;
    private StudioEquipment lightningKit;
    private StudioEquipment camera;

    @BeforeEach
    public void setUp() {
        listOfStudioEquipments = new LinkedList<>();

        microphone = new Microphone();
        microphone.setTypeOfMovie(TypeOfMovie.COMEDY);
        microphone.setId(18235);
        microphone.setPrice(150);

        lightningKit = new LightningKit();
        lightningKit.setTypeOfMovie(TypeOfMovie.DRAMA);
        lightningKit.setId(13460);
        lightningKit.setPrice(45);

        camera = new Camera();
        camera.setTypeOfMovie(TypeOfMovie.HISTORICAL);
        camera.setId(24678);
        camera.setPrice(2500);

        expectedList = new LinkedList<>();

        listOfStudioEquipments.add(microphone);
        listOfStudioEquipments.add(lightningKit);
        listOfStudioEquipments.add(camera);

        studioManager = new StudioManagerImpl(listOfStudioEquipments);
    }

    @Test
    void findEquipmentForHistoricalMovie() {

        expectedList.add(microphone);
        expectedList.add(lightningKit);
        expectedList.add(camera);

        assertEquals(1,
                studioManager.findEquipmentForHistoricalMovie(
                        TypeOfMovie.COMEDY).size());
        assertEquals(1,
                studioManager.findEquipmentForHistoricalMovie(
                        TypeOfMovie.HISTORICAL).size());
        assertEquals(0,
                studioManager.findEquipmentForHistoricalMovie(
                        TypeOfMovie.FANTASY).size());
        assertEquals(1,
                studioManager.findEquipmentForHistoricalMovie(
                        TypeOfMovie.DRAMA).size());
    }

    @Test
    void sortEquipmentById() {

        expectedList.add(lightningKit);
        expectedList.add(microphone);
        expectedList.add(camera);

        studioManager.sortEquipmentById(false);
        assertEquals(expectedList, listOfStudioEquipments);

        expectedList.clear();

        expectedList.add(camera);
        expectedList.add(microphone);
        expectedList.add(lightningKit);

        studioManager.sortEquipmentById(true);
        assertEquals(expectedList, listOfStudioEquipments);
    }

    @Test
    void sortEquipmentByPrice() {

        expectedList.add(lightningKit);
        expectedList.add(microphone);
        expectedList.add(camera);

        studioManager.sortEquipmentByPrice(false);
        assertEquals(expectedList, listOfStudioEquipments);

        expectedList.clear();

        expectedList.add(camera);
        expectedList.add(microphone);
        expectedList.add(lightningKit);

        studioManager.sortEquipmentByPrice(true);
        assertEquals(expectedList, listOfStudioEquipments);
    }
}