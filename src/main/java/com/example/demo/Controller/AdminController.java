package com.example.demo.Controller;

import com.example.demo.Service.QuestionLogService;
import com.example.demo.Service.ReviewResultService;
import com.example.demo.Service.userService;
import com.example.demo.entity.QuestionLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AdminController {

    @Autowired
    PasswordEncoder encoder;

    private QuestionLogService questionLogServ;
    private ReviewResultService reviewResultServ;
    private userService userServ;

    public AdminController(QuestionLogService questionLogServ, ReviewResultService reviewResultServ, userService userServ) {
        this.questionLogServ = questionLogServ;
        this.reviewResultServ = reviewResultServ;
        this.userServ = userServ;
    }

    @GetMapping("/admin")
    public String adminPage(Model model) {
        return "admin";
    }

    @GetMapping("/admin/question")
    public String question(Model model) {
        model.addAttribute("ques", new QuestionLog());
        return "question";
    }

    @PostMapping("/admin/question")
    public String postQuestion(@ModelAttribute("ques") QuestionLog question) {
        questionLogServ.saveQuestion(question);
        return "redirect:/admin";
    }
}
