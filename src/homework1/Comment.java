package homework1;

public class Comment {
    private int postId;
    private int id;
    private String name;
    private String email;
    private String body;

    public int getPostId(){
        return this.postId;
    }

    public int getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public String getEmail(){
        return this.email;
    }

    public String getBody(){
        return this.body;
    }

    public void setPostId(int postId){
        this.postId = postId;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setBody(String body){
        this.body = body;
    }

}
