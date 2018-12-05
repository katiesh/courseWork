package course3.users.personalCabinets;

import course3.Photo;
import course3.Question;

public class PersonalCabinet {
    protected int userId;
    private String email;
    private String password;
    private String name;
    private String surname;
    private String phoneNumber;
    private String location;
    private String telegramLink;
    private Photo photo;
    private int complain;
    private boolean state;

    public PersonalCabinet(String email, String password, String name, String surname, String phoneNumber) {
        this.email = email;
        this.password = password;
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        this.complain = 0;
        this.state = true;
    }

    public int getUserId() {
        return userId;
    }

    public boolean isState() {
        return state;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTelegramLink() {
        return telegramLink;
    }

    public void setTelegramLink(String telegramLink) {
        this.telegramLink = telegramLink;
    }

    public Photo getPhoto() {
        return photo;
    }

    public void setPhoto(Photo photo) {
        this.photo = photo;
    }

    public int getComplain() {
        return complain;
    }

    public boolean checkEmail(String email){
        return this.email == email;
    }

    public boolean checkPassword(String password){
        return this.password == password;
    }

    public Question sendQuestion(String question){
        return new Question(question);
    }

    public void addComplain(){
        complain++;
    }
}
