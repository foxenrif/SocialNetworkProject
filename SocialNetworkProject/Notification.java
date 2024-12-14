package SocialNetworkProject;

import java.util.*;

public class Notification {
    private User sender;
    private String message;
    private Date timestamp;

    public Notification(User sender, String message) {
        this.sender = sender;
        this.message = message;
        this.timestamp = new Date();
    }

    public String getMessage() {
        return message;
    }
}
