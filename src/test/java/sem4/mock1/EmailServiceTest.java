package sem4.mock1;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class EmailServiceTest {

    @Test
    public void testSendWelcomeEmailWithMock() {
        // Создаем мок EmailSender с помощью Mockito
        EmailSender emailSender = mock(EmailSender.class);

        // Создаем экземпляр EmailService с моком
        EmailService emailService = new EmailService(emailSender);

        // Вызываем метод sendWelcomeEmail
        emailService.sendWelcomeEmail("user@example.com");

        // Проверяем, что метод sendEmail был вызван с правильными аргументами
        verify(emailSender)
                .sendEmail(
                "user@example.com",
                "Добро пожаловать",
                "Добро пожаловать на наш сайт!");
    }
}