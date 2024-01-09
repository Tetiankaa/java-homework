package homework2.additional;

import lombok.Data;

import java.util.ArrayList;

@Data
public class Post {
    private int userId;
    private int id;
    private String title;
    private String body;
    private ArrayList<Comment> comments;

    public void addComment(Comment comment){
        if (comments == null){
            comments = new ArrayList<>();
        }
        comments.add(comment);
    }


}
