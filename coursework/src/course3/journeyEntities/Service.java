package course3.journeyEntities;

import course3.Comment;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Service {
    private String typeOfService;
    private int numberOfPeople;
    private Date date;
    private float price;
    private List<Comment> review;
    private float rate;

    public Service() {
        this.review = new ArrayList<>();
    }

    public void pay(){
        //???
    }

    public void modifyService(){
        //???
    }

    public void addReview(Comment comment){
        review.add(comment);
    }

    public String getTypeOfService() {
        return typeOfService;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public Date getDate() {
        return date;
    }

    public float getPrice() {
        return price;
    }

    public List<Comment> getReview() {
        return review;
    }

    public float getRate() {
        return rate;
    }
}
