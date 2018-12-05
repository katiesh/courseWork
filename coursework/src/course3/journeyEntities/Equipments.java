package course3.journeyEntities;

import java.util.List;

public class Equipments {
    private List<Equipment> equipments;

    //с помощью бд
    public List<Equipment> filterByTypeOfJourney(String typeOfJourney){
        return null;
    }

    public void addEquipment(Equipment equipment){
        equipments.add(equipment);
    }
}
