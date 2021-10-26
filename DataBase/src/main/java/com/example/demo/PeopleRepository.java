package com.example.demo;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface PeopleRepository extends PagingAndSortingRepository<People, Long>{
}
