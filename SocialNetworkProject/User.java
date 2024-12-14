package SocialNetworkProject;

import java.util.*;

public class User {
    private String name;
    private String login;
    private String password;
    private List<Post> posts;
    private List<Notification> notifications;

    public User(String name, String login, String password) {
        this.name = name;
        this.login = login;
        this.password = password;
        this.posts = new ArrayList<>();
        this.notifications = new ArrayList<>();
    }

    public void register() {
        System.out.println(name + " зарегистрирован!");
    }

    public Post createPost(String content) {
        Post newPost = new Post(this, content);
        posts.add(newPost);
        return newPost;
    }

    public void addComment(Post post, String content) {
        Comment comment = new Comment(this, content);
        post.addComment(comment);
        post.getAuthor().notifyUser(new Notification(this, "Добавлен комментарий: " + content));
    }

    public void like(Post post) {
        post.addLike(this);
        post.getAuthor().notifyUser(new Notification(this, "Ваш пост понравился пользователю " + name));
    }

    public void like(Comment comment) {
        comment.addLike(this);
        comment.getAuthor().notifyUser(new Notification(this, "Ваш комментарий понравился пользователю " + name));
    }

    public void notifyUser(Notification notification) {
        notifications.add(notification);
    }

    public List<Notification> getNotifications() {
        return notifications;
    }
}

