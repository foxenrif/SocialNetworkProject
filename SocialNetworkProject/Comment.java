package SocialNetworkProject;

import java.util.*;

public class Comment {
    private User author;
    private String content;
    private Date timestamp;
    private List<User> likes;

    public Comment(User author, String content) {
        this.author = author;
        this.content = content;
        this.timestamp = new Date();
        this.likes = new ArrayList<>();
    }

    public User getAuthor() {
        return author;
    }

    public void addLike(User user) {
        if (!likes.contains(user)) {
            likes.add(user);
        }
    }
}
