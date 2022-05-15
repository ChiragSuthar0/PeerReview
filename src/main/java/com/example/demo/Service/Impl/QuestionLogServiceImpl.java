package com.example.demo.Service.Impl;

import com.example.demo.Repository.QuestionLogRepository;
import com.example.demo.Service.QuestionLogService;
import com.example.demo.entity.QuestionLog;
import org.springframework.stereotype.Service;

@Service
public class QuestionLogServiceImpl implements QuestionLogService {

    private QuestionLogRepository questionLogRepo;

    public QuestionLogServiceImpl(QuestionLogRepository questionLogRepo) {
        super();
        this.questionLogRepo = questionLogRepo;
    }


    @Override
    public QuestionLog saveQuestion(QuestionLog questionLog) {
        return questionLogRepo.save(questionLog);
    }

    @Override
    public QuestionLog getQuestion(Integer id) {
        return questionLogRepo.getById(id);
    }

    @Override
    public QuestionLog getLastQuestion(Integer id) {
        return questionLogRepo.findTopByIdOrderByIdDesc(id);
    }

    @Override
    public QuestionLog akhriQuestion() {
        return questionLogRepo.findFirstByOrderByDateTimeDesc();
    }

//    @Override
//    public QuestionLog getLastQuestion() {
//        return questionLogRepo.findTopByIdOrderById();
//    }
}
