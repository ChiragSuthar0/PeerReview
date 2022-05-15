package com.example.demo.Repository;

import com.example.demo.entity.ReviewResult;
import org.springframework.data.repository.CrudRepository;

public interface ReviewResultRepository extends CrudRepository<ReviewResult, Integer> {
    ReviewResult findByUserName(String userName);
}
