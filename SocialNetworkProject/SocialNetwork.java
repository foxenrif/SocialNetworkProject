package SocialNetworkProject;

import java.util.*;

public class SocialNetwork {
    public static void main(String[] args) {
        // Регистрация пользователей
        User john = new User("John Doe", "john_doe", "password123");
        john.register();

        User jane = new User("Jane Smith", "jane_smith", "password456");
        jane.register();

        // Создание поста
        Post post = john.createPost("Hello, world!");

        // Добавление комментария
        jane.addComment(post, "Nice post!");

        // Лайк поста
        jane.like(post);

        // Лайк комментария
        john.like(post.getComments().get(0));

        // Получение уведомлений
        System.out.println("Уведомления John:");
        for (Notification notification : john.getNotifications()) {
            System.out.println(notification.getMessage());
        }

        System.out.println("Уведомления Jane:");
        for (Notification notification : jane.getNotifications()) {
            System.out.println(notification.getMessage());
        }
    }
}
