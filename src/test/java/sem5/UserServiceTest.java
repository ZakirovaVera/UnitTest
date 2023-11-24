package sem5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class UserServiceTest {
    @Test
    void testUserServiceWithUserRepository() {
        // Создаем фиктивный объект UserRepository с помощью Mockito
        UserRepository userRepository = mock(UserRepository.class);

        // Создаем объект UserService, передавая фиктивный UserRepository
        UserService userService = new UserService(userRepository);

        // Задаем ожидаемый результат
        int userId = 1;
        String expectedUsername = "JohnDoe"; // Предположим, что у пользователя с ID 1 такое имя

        // Устанавливаем ожидание вызова метода getUserById с userId и возвращаем ожидаемый объект User
        when(userRepository.getUserById(userId)).thenReturn(new User(userId, expectedUsername));

        // Вызываем метод getUserUsernameById из UserService
        String username = userService.getUserUsernameById(userId);

        // Проверяем, что метод getUserById был вызван с ожидаемым userId
        verify(userRepository).getUserById(userId);

        // Проверяем, что результат соответствует ожиданиям
        assertEquals(expectedUsername, username);
    }
}