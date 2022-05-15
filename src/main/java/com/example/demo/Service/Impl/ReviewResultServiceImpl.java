package com.example.demo.Service.Impl;

import com.example.demo.Repository.ReviewResultRepository;
import com.example.demo.Service.ReviewResultService;
import com.example.demo.entity.ReviewResult;
import org.springframework.stereotype.Service;

@Service
public class ReviewResultServiceImpl implements ReviewResultService {

    private ReviewResultRepository reviewResultRepo;

    public ReviewResultServiceImpl(ReviewResultRepository reviewResultRepo) {
        super();
        this.reviewResultRepo = reviewResultRepo;
    }

    @Override
    public ReviewResult saveResult(ReviewResult reviewResult) {
        return reviewResultRepo.save(reviewResult);
    }

    @Override
    public ReviewResult getResultFromUserName(String userName) {
        return reviewResultRepo.findByUserName(userName);
    }
}
