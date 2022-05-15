package com.example.demo.Service;

import com.example.demo.entity.QuestionLog;

public interface QuestionLogService {
    QuestionLog saveQuestion(QuestionLog questionLog);
    QuestionLog getQuestion(Integer id);
    QuestionLog getLastQuestion(Integer id);
    QuestionLog akhriQuestion();
}
