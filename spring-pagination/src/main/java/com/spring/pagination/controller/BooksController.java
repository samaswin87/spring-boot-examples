package com.spring.pagination.controller;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.pagination.model.Books;
import com.spring.pagination.repository.BookRepository;

@Controller
public class BooksController {
	
	@Autowired
	private BookRepository service;
	
	@GetMapping("/")
    public String index() {
        return "index.html";
    }
	
	@GetMapping("/books")
    public String books(@RequestParam("page") Optional<Integer> pageIndex, ModelMap map) {
		int currentPage = pageIndex.orElse(1);
		Pageable page = PageRequest.of(currentPage - 1, 20, Sort.by("name").descending());
		Page<Books> list = service.findAll(page);
		map.addAttribute("books", list);
		Integer totalPages = list.getTotalPages();
		if (totalPages > 0) {
            List<Integer> pageNumbers = IntStream.rangeClosed(1, totalPages)
									             .boxed()
									             .collect(Collectors.toList());
            map.addAttribute("pageNumbers", pageNumbers);
        }
        return "books.html";
    }

}
