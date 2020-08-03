package com.kallensun.dao;

import com.kallensun.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookMapper {
     int addBook(Books book);
     int deleteBookById(@Param("bookId") int id);
     int updateBook(Books book);
     Books queryBookById(int id);
     List<Books> queryBooks();
}
