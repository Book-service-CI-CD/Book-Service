package com.ust.Book_Service.service;

import com.ust.Book_Service.model.Book;
import com.ust.Book_Service.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    BookRepository bookRepo;

    public BookService() {
    }

    public List<Book> getAllBooks() {
        return this.bookRepo.findAll();
    }

    public Book getABooks(String bid) {
        return this.bookRepo.findById(bid).get();
    }

    public Book addBook(Book newBook) {
        return this.bookRepo.save(newBook);
    }

    public List<Book> getBooksByAuthorId(String bookAuthorId) {
        return this.bookRepo.findByBookAuthorId(bookAuthorId);
    }
}
