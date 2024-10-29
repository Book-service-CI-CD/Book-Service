package com.ust.Book_Service.controller;

import com.ust.Book_Service.model.Book;
import com.ust.Book_Service.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping
    public List<Book> getAllBooks() {
        return this.bookService.getAllBooks();
    }

    @GetMapping("/{bid}")
    public Book getABooks(@PathVariable String bid) {
        return this.bookService.getABooks(bid);
    }

    @PostMapping
    public Book addBook(@RequestBody Book newBook) {
        return this.bookService.addBook(newBook);
    }

    @GetMapping("/author/{bookAuthorId}")
    public List<Book> getBooksByAuthorId(@PathVariable String bookAuthorId){
        return this.bookService.getBooksByAuthorId(bookAuthorId);
    }
}

