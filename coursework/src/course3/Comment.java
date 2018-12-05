package course3;

import course3.users.Client;

import java.util.Date;

public class Comment {
    public static int lastId = 0;
    private int commentId;
    private int clientId;
    private String name;
    private String surname;
    private Date dateAndTime;
    private String description;
    private Photo photo;
    private float rate;

    {
        this.commentId = ++lastId;
    }

    public Comment(int commentId, Client client, String description, float rate) {
        this.commentId = commentId;
        this.clientId = client.getClientId();
        this.name = client.getClientName();
        this.surname = client.getClientSurname();
        this.dateAndTime = new Date();
        this.description = description;
        this.photo = client.getClientPhoto();
        this.rate = rate;
    }
}
