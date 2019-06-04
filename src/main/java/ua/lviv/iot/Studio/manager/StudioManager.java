package ua.lviv.iot.Studio.manager;

import ua.lviv.iot.Studio.models.StudioEquipment;
import ua.lviv.iot.Studio.models.TypeOfMovie;

import java.util.List;

public interface StudioManager {

    List<StudioEquipment> findEquipmentForHistoricalMovie(
            TypeOfMovie typeOfMovie);

    List<StudioEquipment> sortEquipmentByPrice(boolean reverse);

    List<StudioEquipment> sortEquipmentById(boolean reverse);

}
