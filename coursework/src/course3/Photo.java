package course3;

import course3.users.Client;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Photo {
    public static int lastId = 0;
    private int photoId;
    private byte[] photo;
    private int clientId;
    List<Comment> comments;
    private Date date;
    private String location;

    {
        this.photoId = ++lastId;
    }

    public Photo(byte[] photo, Client client) {
        this.comments = new ArrayList<>();
        this.photo = photo = photo;
        this.clientId = client.getClientId();
        this.date = new Date();
    }

    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
        this.photoId = ++lastId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getPhotoId() {
        return photoId;
    }

    public int getClientId() {
        return clientId;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public Date getDate() {
        return date;
    }

    public void addComment (Comment comment){
        comments.add(comment);
    }
}
