package dz4;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

class BookServiceTest {

    private BookService _sut;
    private BookRepository _repositoryMock;

    @BeforeEach
    void setUp() {
        _repositoryMock = mock(BookRepository.class);
        _sut = new BookService(_repositoryMock);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void findBookById() {
        String bookId = "10";
        Book book = new Book(bookId);
        when(_repositoryMock.findById(bookId)).thenAnswer(x -> book);

        Book result = _sut.findBookById(bookId);

        verify(_repositoryMock).findById(bookId);
        assertEquals(book, result);
    }

    @Test
    void findAllBooks() {
        Book book = new Book("10");
        List<Book> list = new ArrayList<>();
        list.add(book);
        when(_repositoryMock.findAll()).thenAnswer(x -> list);

        List<Book> result = _sut.findAllBooks();

        verify(_repositoryMock).findAll();
        assertEquals(list, result);
        assertEquals(1, result.size());
        assertEquals(book, result.get(0));
    }
}