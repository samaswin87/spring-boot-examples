package com.spring.pagination.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.spring.pagination.model.Books;

public interface BookRepository extends PagingAndSortingRepository<Books, Long>{

}
