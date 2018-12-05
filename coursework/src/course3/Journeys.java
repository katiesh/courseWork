package course3;

import course3.journeyEntities.Journey;

import java.util.ArrayList;
import java.util.List;

public class Journeys {
    private List<Journey> journeys = new ArrayList<>();

    public void addJourney(Journey journey){
        journeys.add(journey);
    }
//передаем в метод sql запрос
    public List filterByParameter(String sql){
        return null;
    }
}
