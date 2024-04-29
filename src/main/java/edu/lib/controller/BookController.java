package edu.lib.controller;

import edu.lib.dto.Book;
import edu.lib.entity.BookEntity;
import edu.lib.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/book")
@CrossOrigin
public class BookController {

    @Autowired
    BookService bookService;

    @PostMapping("/add-book")
    @ResponseStatus(HttpStatus.CREATED)
    public void addBook(@RequestBody Book book){
        bookService.addBook(book);
    }

    @GetMapping("/get-book")
    public Iterable<BookEntity> getBooks(){
        return bookService.getBooks();
    }

    @DeleteMapping("/drop-book/{id}")
    Map<String,String> deleteBook(@PathVariable Long id){
        return bookService.deleteBook(id)?
                Collections.singletonMap("status","Student removed successfulll"):
                Collections.singletonMap("status","Book Id not found");
    }

    @GetMapping("get-book/{id}")
    public Book getBookById(@PathVariable Long id){
       return bookService.getBookById(id);
    }

    @PostMapping("/add-list")
    public void addList(@RequestBody List<Book> bookList){
        bookService.addList(bookList);
    }

}
