package com.example.demo.Service;

import com.example.demo.entity.ReviewResult;

public interface ReviewResultService {
    ReviewResult saveResult(ReviewResult reviewResult);
    ReviewResult getResultFromUserName(String userName);
}
