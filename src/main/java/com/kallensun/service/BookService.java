package com.kallensun.service;

import com.kallensun.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookService {
    int addBook(Books book);
    int deleteBookById(int id);
    int updateBook(Books book);
    Books queryBookById(int id);
    List<Books> queryBooks();

}
