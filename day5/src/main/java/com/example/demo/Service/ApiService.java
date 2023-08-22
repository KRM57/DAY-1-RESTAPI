package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Book;
import com.example.demo.Repository.BookRepo;

import jakarta.persistence.EntityNotFoundException;

@Service
public class ApiService {
  @Autowired
  BookRepo br;
  public List<Book> addBook(List<Book> b){
	  return (List<Book>) br.saveAll(b);
  }
  public List<Book> showBooks(){
	  return br.findAll();
  }
  public Book updateBook(int id,Book b) {
	  Optional<Book> temp=br.findById(id);
	  if(temp.isPresent()) {
		 Book book=temp.get();
		 book.setBookName(b.getBookName());
		 book.setPrice(b.getPrice());
		 book.setQuantity(b.getQuantity());
		 book.setAuthorName(b.getAuthorName());
	     return br.saveAndFlush(b);
	  }
	  else {
		  throw new EntityNotFoundException("Not found");
	  }
  }
  public void deleteBook(int id) {
	  br.deleteById(id);
  }
  
}
