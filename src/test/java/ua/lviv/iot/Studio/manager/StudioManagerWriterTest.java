package ua.lviv.iot.Studio.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.Studio.models.*;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StudioManagerWriterTest {

    private List<StudioEquipment> listOfStudioEquipment = new LinkedList<>();
    StudioManagerWriter writer = new StudioManagerWriter();
    private String filePath = "myFile";

    private Camera camera = new Camera("camera", 1008, 5000,
            Position.BACK_MIDDLE, TypeOfMovie.HISTORICAL,
            true,  ModelOfCamera.CANON, 25, 900, 1.5, 120);

    private Microphone microphone = new Microphone("microphone", 3001, 200,
            Position.BACK_RIGHT, TypeOfMovie.DRAMA, false, true);

    private LightningKit lightningKit = new LightningKit("lightning kit", 4159,
            80, Position.FRONT_LEFT, TypeOfMovie.FANTASY, true, 50);

    @BeforeEach
    void setUp() {
        listOfStudioEquipment.add(camera);
        listOfStudioEquipment.add(microphone);
        listOfStudioEquipment.add(lightningKit);

        writer = new StudioManagerWriter(filePath);
    }

    @Test
    void writeToFile() {
        File myFile = new File(filePath + ".csv");
        writer.writeToFile(listOfStudioEquipment);

        try(FileInputStream fis = new FileInputStream(myFile);
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader reader = new BufferedReader(isr)) {

            for (StudioEquipment studioEquipment : listOfStudioEquipment) {
                assertEquals(studioEquipment.getHeaders(), reader.readLine());
                assertEquals(studioEquipment.toCSV(), reader.readLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    void testGettersAndSettersFilePath() {
        writer.setFilePath(filePath);
        assertEquals(filePath, writer.getFilePath(),
                "Getter or Setter method failed");
    }
}