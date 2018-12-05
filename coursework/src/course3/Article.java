package course3;

import java.util.ArrayList;
import java.util.List;

public class Article {
    private String text;
    private float rate;
    private String name;
    private List<Comment> comments;

    public Article(String text, String name) {
        this.text = text;
        this.name = name;
        this.comments = new ArrayList<>();
    }

    public void editText(String text){
        this.text = text;
    }

    public void editName(String name){
        this.name = name;
    }

    public void editRate(){
        //???
    }

    public void addComment(Comment comment){
        comments.add(comment);
    }

    public void modifyArticle(){
        //???
    }
}
