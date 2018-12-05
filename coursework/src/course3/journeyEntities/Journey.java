package course3.journeyEntities;

import course3.Comment;
import course3.Photo;
import course3.payment.Payment;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Journey {
    private String placeFrom;
    private String placeTo;
    private Date dateFrom;
    private Date dateTo;
    private String transportFrom;
    private String transportTo;
    private int popularity;
    private int moneyOfAvailability;
    private int complicity;
    private List<Comment> reviews = new ArrayList<>();
    private int numOfDays;
    private List<Photo> gallary = new ArrayList<>();
    private List<Equipment> equipments = new ArrayList<>();
    private String typeOfService;
    private String getPlaceToStay;
    private float rate;
    private String location;
    private float price;

    public void addComment(Comment comment){
        reviews.add(comment);
    }

    public void addPhoto(Photo photo){
        gallary.add(photo);
    }

    public void modifyJourney(){
        //???
    }

    public void payment (Payment payment){
        //???
    }

    public String getPlaceFrom() {
        return placeFrom;
    }

    public String getPlaceTo() {
        return placeTo;
    }

    public Date getDateFrom() {
        return dateFrom;
    }

    public Date getDateTo() {
        return dateTo;
    }

    public String getTransportFrom() {
        return transportFrom;
    }

    public String getTransportTo() {
        return transportTo;
    }

    public int getPopularity() {
        return popularity;
    }

    public int getMoneyOfAvailability() {
        return moneyOfAvailability;
    }

    public int getComplicity() {
        return complicity;
    }

    public List<Comment> getReviews() {
        return reviews;
    }

    public int getNumOfDays() {
        return numOfDays;
    }

    public List<Photo> getGallary() {
        return gallary;
    }

    public List<Equipment> getEquipments() {
        return equipments;
    }

    public String getTypeOfService() {
        return typeOfService;
    }

    public String getGetPlaceToStay() {
        return getPlaceToStay;
    }

    public float getRate() {
        return rate;
    }

    public String getLocation() {
        return location;
    }

    public float getPrice() {
        return price;
    }
}
