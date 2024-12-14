package SocialNetworkProject;

import java.util.*;

public class Post {
    private User author;
    private String content;
    private Date timestamp;
    private List<Comment> comments;
    private List<User> likes;

    public Post(User author, String content) {
        this.author = author;
        this.content = content;
        this.timestamp = new Date();
        this.comments = new ArrayList<>();
        this.likes = new ArrayList<>();
    }

    public User getAuthor() {
        return author;
    }

    public void addComment(Comment comment) {
        comments.add(comment);
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void addLike(User user) {
        if (!likes.contains(user)) {
            likes.add(user);
        }
    }
}
