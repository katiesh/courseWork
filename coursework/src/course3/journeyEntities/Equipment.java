package course3.journeyEntities;

import java.util.Map;

public class Equipment {
    private String typeOfJourney;
    private  String typeOfEquipment;
    private Map<String, Boolean> url;

    public String getTypeOfJourney() {
        return typeOfJourney;
    }

    public void setTypeOfJourney(String typeOfJourney) {
        this.typeOfJourney = typeOfJourney;
    }

    public String getTypeOfEquipment() {
        return typeOfEquipment;
    }

    public void setTypeOfEquipment(String typeOfEquipment) {
        this.typeOfEquipment = typeOfEquipment;
    }

    public Map<String, Boolean> getUrl() {
        return url;
    }

    public void setUrl(Map<String, Boolean> url) {
        this.url = url;
    }
}
