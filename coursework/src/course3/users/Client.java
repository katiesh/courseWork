package course3.users;

import course3.Comment;
import course3.Photo;
import course3.journeyEntities.Journey;
import course3.journeyEntities.Service;
import course3.users.personalCabinets.PersonalCabinet;
import course3.users.personalCabinets.PersonalCabinetClient;

import java.util.List;

public class Client {
    private PersonalCabinet personalCabinet;

    public Client(PersonalCabinetClient personalCabinet) {
        this.personalCabinet = personalCabinet;
    }
//из бд берем
    public List<Journey> searchJourney(){
        return null;
    }

    public String getClientName(){
        return personalCabinet.getName();
    }

    public String getClientSurname(){
        return personalCabinet.getSurname();
    }

    public Photo getClientPhoto(){
        return personalCabinet.getPhoto();
    }

    public int getClientId(){
        return personalCabinet.getUserId();
    }

    public void setRating(float Rate){
        //кому?
    }

    public Comment addComment(Comment comment){
        //куда откуда?
        return null;
    }

    public void bookService(Service service){
        //???
    }

//наверное этот метод лишний
    public PersonalCabinet createPersonalCabinet ( PersonalCabinetClient personalCabinet){
        return personalCabinet;
    }
}
