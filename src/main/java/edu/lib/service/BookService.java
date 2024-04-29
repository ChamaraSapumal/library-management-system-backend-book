package edu.lib.service;

import edu.lib.dto.Book;
import edu.lib.entity.BookEntity;

import java.util.List;

public interface BookService {
    void addBook(Book book);
    List<BookEntity> getBooks();
    boolean deleteBook(Long id);
    Book getBookById(Long id);
    void addList(List<Book> bookList);
}
