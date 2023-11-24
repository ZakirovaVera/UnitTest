package sem5;

// Класс UserService
public class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public String getUserUsernameById(int userId) {
        User user = userRepository.getUserById(userId);
        return user.getUsername();
    }
}