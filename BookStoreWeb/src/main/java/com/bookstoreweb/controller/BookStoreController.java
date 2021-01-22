package com.bookstoreweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bookstoreweb.proxy.BookSearchProxy;

@RestController
public class BookStoreController {
	@Autowired
	private BookSearchProxy bookSearchProxy;
	
	@GetMapping("/jlcbooks") 
	public String getBookStoreWeb() {
		System.out.println("---BookStoreController---getJLCBooks()---");
		 String msg= bookSearchProxy.getBooks(); 
		 return msg;
	}
}
