package sem5;

public class User {
    private int id;
    private String username;

    public User(int userId, String expectedUsername) {
        id = userId;
        username = expectedUsername;
    }

    public User() {
    }

    public String getUsername() {
        return username;
    }

    // Конструктор, геттеры и сеттеры
}

