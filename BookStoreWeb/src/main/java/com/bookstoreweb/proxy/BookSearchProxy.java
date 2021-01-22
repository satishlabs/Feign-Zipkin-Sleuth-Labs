package com.bookstoreweb.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "MyBookSearchMS")
public interface BookSearchProxy {
	@GetMapping("/mybooks")
	public String getBooks();
}
