package homework2.additional;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Post post1 = new Post();
        post1.setId(1);
        post1.setUserId(1);
        post1.setTitle("sunt aut facere repellat provident occaecati excepturi optio reprehenderit");
        post1.setBody("quia et suscipituscipit recusandae consequuntur expedita et cumreprehenderit molestiae ut ut quas totamnostrum rerum est autem sunt rem eveniet architecto");

        Post post2 = new Post();
        post2.setId(2);
        post2.setUserId(1);
        post2.setTitle("qui est esse");
        post2.setBody("est rerum tempore vitaeequi sint nihil reprehenderit dolor beatae ea dolores nequeugiat blanditiis voluptate porro vel nihil molestiae ut reiciendisui aperiam non debitis possimus qui neque nisi nulla");

        Post post3 = new Post();
        post3.setId(3);
        post3.setUserId(1);
        post3.setTitle("ea molestias quasi exercitationem repellat qui ipsa sit aut");
        post3.setBody("et iusto sed quo iureoluptatem occaecati omnis eligendi aut adoluptatem doloribus vel accusantium quis pariaturolestiae porro eius odio et labore et velit aut");


        Comment comment1 = new Comment();
        comment1.setPostId(1);
        comment1.setId(1);
        comment1.setName("id labore ex et quam laborum");
        comment1.setEmail("Eliseo@gardner.biz");
        comment1.setBody("laudantium enim quasi est quidem magnam voluptate ipsam eostempora quo necessitatibudolor quam autem queiciendis et nam sapiente accusantium");

        Comment comment2 = new Comment();
        comment2.setPostId(1);
        comment2.setId(2);
        comment2.setName("quo vero reiciendis velit similique earum");
        comment2.setEmail("Jayne_Kuhic@sydney.com");
        comment2.setBody("est natus enim nihil est dolore omnis voluptatem numquamt omnis occaecati quod ullam avoluptatem error expedita pariaturnihil sint nostrum voluptatem reiciendis et");

        Comment comment3 = new Comment();
        comment3.setPostId(1);
        comment3.setId(3);
        comment3.setName("odio adipisci rerum aut animi");
        comment3.setEmail("Nikita@garfield.biz");
        comment3.setBody("quia molestiae reprehenderit quasi aspernaturut expedita occaecati aliquam eveniet laudantiumnis quibusdam delectus saepe quia accusamus maiores nam estcum et ducimus et vero voluptates excepturi deleniti ratione");

        Comment comment4 = new Comment();
        comment4.setPostId(2);
        comment4.setId(7);
        comment4.setName("repellat consequatur praesentium vel minus molestias voluptatum");
        comment4.setEmail("Dallas@ole.me");
        comment4.setBody("maiores sed dolores similique labore et inventore etquasi temporibus esse sunt id eteos voluptatem aliquliquid ratione corporis molestiae mollitia quia et magnam dolor");

        Comment comment5 = new Comment();
        comment5.setPostId(2);
        comment5.setId(8);
        comment5.setName("et omnis dolorem");
        comment5.setEmail("Mallory_Kunze@marie.org");
        comment5.setBody("ut voluptatem corrupti veliad voluptatem maiorest nisi velit vero accusamus maiooluptates quia aliquid ullam eaque");

        Comment comment6 = new Comment();
        comment6.setPostId(3);
        comment6.setId(13);
        comment6.setName( "aut inventore non pariatur sit vitae voluptatem sapiente");
        comment6.setEmail("Kariane@jadyn.tv");
        comment6.setBody("fuga eos qui dolor reruminventore corporis exercitationeris cupiditate et deserunt recusandae est sed quis culpaeum maiores corporis et");

        Comment comment7 = new Comment();
        comment7.setPostId(3);
        comment7.setId(14);
        comment7.setName( "et officiis id praesentium hic aut ipsa dolorem repudiandae");
        comment7.setEmail("Nathan@solon.io");
        comment7.setBody("vel quae voluptas qui exercitationeptatibus unde seinima et qui ipsam aspernatupedita magnam laudantium et et quaerat ut qui dolorum");

        Comment comment8 = new Comment();
        comment8.setPostId(3);
        comment8.setId(15);
        comment8.setName("debitis magnam hic odit aut ullam nostrum tenetur");
        comment8.setEmail("Maynard.Hodkiewicz@roberta.com");
        comment8.setBody("nihil ut voluptates blanditiis autem odio dicta rerumisquam saepe et esnt quasi nemo laudantium deserunolestias tempora quo quia");

        ArrayList<Post> posts = new ArrayList<>();
        posts.add(post1);
        posts.add(post2);
        posts.add(post3);

        ArrayList<Comment> comments = new ArrayList<>();
        comments.add(comment1);
        comments.add(comment2);
        comments.add(comment3);
        comments.add(comment4);
        comments.add(comment5);
        comments.add(comment6);
        comments.add(comment7);
        comments.add(comment8);

        for (Post post : posts){
            for (Comment comment : comments){
                if (comment.getPostId() == post.getId()){
                   post.addComment(comment);
                }


            }
        }


        //
        for (Post post : posts){
            System.out.println(post.getComments());
        }


    }
}
