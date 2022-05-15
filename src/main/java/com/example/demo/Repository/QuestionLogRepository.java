package com.example.demo.Repository;

import com.example.demo.entity.QuestionLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface QuestionLogRepository extends JpaRepository<QuestionLog, Integer>, JpaSpecificationExecutor<QuestionLog> {
//    QuestionLog findTopByIdOrderById();
    QuestionLog findTopByIdOrderByIdDesc(Integer id);
    QuestionLog findFirstByOrderByDateTimeDesc();
}
