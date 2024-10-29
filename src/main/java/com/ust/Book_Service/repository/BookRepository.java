package com.ust.Book_Service.repository;

import com.ust.Book_Service.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends MongoRepository<Book, String> {

    List<Book> findByBookAuthorId(String bookAuthorId);
}

