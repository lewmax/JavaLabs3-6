package ua.lviv.iot.Studio.Main;

import ua.lviv.iot.Studio.models.Camera;
import ua.lviv.iot.Studio.models.Decoration;
import ua.lviv.iot.Studio.models.LightningKit;
import ua.lviv.iot.Studio.models.Microphone;
import ua.lviv.iot.Studio.models.Position;
import ua.lviv.iot.Studio.models.StudioEquipment;
import ua.lviv.iot.Studio.models.TypeOfMovie;
import ua.lviv.iot.Studio.manager.StudioManager;
import ua.lviv.iot.Studio.manager.StudioManagerImpl;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(final String[] args) {
        StudioEquipment microphone = new Microphone();
        StudioEquipment lightningKit = new LightningKit();
        StudioEquipment camera = new Camera();
        StudioEquipment decoration = new Decoration();

        microphone.setName("Xiaomi");
        lightningKit.setName("Kit");
        camera.setName("Canon");
        decoration.setName("Tree");

        microphone.setId(1001);
        lightningKit.setId(7602);
        camera.setId(2455);
        decoration.setId(9677);

        microphone.setPrice(100);
        lightningKit.setPrice(25);
        camera.setPrice(2000);
        decoration.setPrice(5);

        microphone.setCurrentPosition(Position.BACK_LEFT);
        lightningKit.setCurrentPosition(Position.BACK_MIDDLE);
        camera.setCurrentPosition(Position.FRONT_LEFT);
        decoration.setCurrentPosition(Position.BACK_RIGHT);

        microphone.setTypeOfMovie(TypeOfMovie.COMEDY);
        lightningKit.setTypeOfMovie(TypeOfMovie.HISTORICAL);
        camera.setTypeOfMovie(TypeOfMovie.FANTASY);
        decoration.setTypeOfMovie(TypeOfMovie.DRAMA);

        List<StudioEquipment> studioEquipments = new ArrayList<>();
        studioEquipments.add(microphone);
        studioEquipments.add(lightningKit);
        studioEquipments.add(camera);
        studioEquipments.add(decoration);

        StudioManager manager = (StudioManager) new StudioManagerImpl(
                studioEquipments);
        List<StudioEquipment> forHistory =
                manager.findEquipmentForHistoricalMovie(TypeOfMovie.HISTORICAL);
        forHistory.forEach((StudioEquipment equipment) -> {
            System.out.println(equipment.getName().toString());
        });
        System.out.println("-----------------------");

        List<StudioEquipment> sortedPyPrice = manager.sortEquipmentByPrice(
                false);
        sortedPyPrice.forEach((StudioEquipment equipment) -> {
            System.out.println(equipment.getPrice());
        });
        System.out.println("-----------------------");

        List<StudioEquipment> sortedById = manager.sortEquipmentById(false);
        sortedById.forEach((StudioEquipment tool) -> {
            System.out.println(tool.getId());
        });

    }
}
