package dz4;

import java.util.List;

public class BookService {
    private BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Book findBookById(String id) {
        Book bookFromDatabase = bookRepository.findById(id);
        return bookFromDatabase;
    }

    public List<Book> findAllBooks() {
        return bookRepository.findAll();
    }
}

