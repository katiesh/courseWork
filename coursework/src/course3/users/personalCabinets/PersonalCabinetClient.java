package course3.users.personalCabinets;

import course3.exceptions.NonValidHealthStatusException;
import course3.journeyEntities.Journey;

import java.util.*;

public class PersonalCabinetClient extends PersonalCabinet{
    public static int lastId = 0;
    private Map<Journey, Boolean> journeys;
    private int healthStatus;
    List<Journey> placeToVisit;
    List<Journey> wishlist;

    {
        this.userId = ++lastId;
    }
    public PersonalCabinetClient(String email, String password, String name, String surname, String phoneNumber) {
        super(email, password, name, surname, phoneNumber);
        journeys = new HashMap<>();
        placeToVisit = new ArrayList<>();
        wishlist = new ArrayList<>();
    }

    public void setHealthStatus(int healthStatus) throws NonValidHealthStatusException {
        if(healthStatus<0 || healthStatus>10){
            throw new NonValidHealthStatusException();
        }
        this.healthStatus = healthStatus;
    }

    public Map<Journey, Boolean> getJourneys() {
        return journeys;
    }

    public int getHealthStatus() {
        return healthStatus;
    }

    public List<Journey> getPlaceToVisit() {
        return placeToVisit;
    }

    public List<Journey> getWishlist() {
        return wishlist;
    }

    public void addJourney(Journey journey){
        journeys.put(journey, false);
    }

    public void changeJourneyStatus(Journey journey){
       // if(new Date().after(jourey.getDate()))
        journeys.put(journey, true);
    }

    public void addToWishlist(Journey journey){
        wishlist.add(journey);
    }

    public void addToPlaceToVisit(Journey journey){
        placeToVisit.add(journey);
    }
}
