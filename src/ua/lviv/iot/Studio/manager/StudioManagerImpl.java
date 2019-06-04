package ua.lviv.iot.Studio.manager;

import ua.lviv.iot.Studio.models.StudioEquipment;
import ua.lviv.iot.Studio.models.TypeOfMovie;

import java.util.List;
import java.util.stream.Collectors;

public class StudioManagerImpl implements StudioManager {

    private List<StudioEquipment> studioEquipments;

    public StudioManagerImpl(final List<StudioEquipment> studioEquipmentsObj) {
        this.studioEquipments = studioEquipmentsObj;
    }

    @Override
    public final List<StudioEquipment> findEquipmentForHistoricalMovie(
            final TypeOfMovie typeOfMovie) {

        List<StudioEquipment> foundList;
        foundList = this.studioEquipments.stream()
                .filter(se -> typeOfMovie.equals(se.getTypeOfMovie()))
                .collect(Collectors.toList());
        return foundList;
    }

    @Override
    public final List<StudioEquipment> sortEquipmentById(
            final boolean reverse) {
        int reverser;
        if (reverse) {
            reverser = -1;
        } else {
            reverser = 1;
        }

        studioEquipments.sort((StudioEquipment se1, StudioEquipment se2) ->
                reverser * Double.compare(se1.getId(), se2.getId()));
        return studioEquipments;
    }

    @Override
    public final List<StudioEquipment> sortEquipmentByPrice(
            final boolean reverse) {
        int reverser;
        if (reverse) {
            reverser = -1;
        } else {
            reverser = 1;
        }

        studioEquipments.sort((StudioEquipment se1, StudioEquipment se2) ->
                reverser * Double.compare(se1.getPrice(), se2.getPrice()));
        return studioEquipments;
    }
}
