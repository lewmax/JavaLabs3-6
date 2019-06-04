package ua.lviv.iot.Studio.manager;

import ua.lviv.iot.Studio.models.StudioEquipment;

import java.io.IOException;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.List;

public class StudioManagerWriter {

    private String filePath;

    StudioManagerWriter() {

    }

    StudioManagerWriter(final String filePathObj) {
        this.filePath = filePathObj;
    }

    public final void writeToFile(
            final List<StudioEquipment> listOfStudioEquipment) {
        File myFile = new File(filePath + ".csv");

        try (FileOutputStream fos = new FileOutputStream(myFile);
             OutputStreamWriter osw = new OutputStreamWriter(fos);
             BufferedWriter bufWriter = new BufferedWriter(osw)) {

            for (StudioEquipment studioEquipment : listOfStudioEquipment) {
                bufWriter.write(studioEquipment.getHeaders());
                bufWriter.newLine();
                bufWriter.write(studioEquipment.toCSV());
                bufWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
        }
    }

    public final String getFilePath() {
        return filePath;
    }

    public final void setFilePath(final String filePathObj) {
        this.filePath = filePathObj;
    }
}
