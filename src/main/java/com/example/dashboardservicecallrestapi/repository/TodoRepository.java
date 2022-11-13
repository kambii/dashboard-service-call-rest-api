package com.example.dashboardservicecallrestapi.repository;


import com.example.dashboardservicecallrestapi.model.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository<Todo, Integer> {
}
