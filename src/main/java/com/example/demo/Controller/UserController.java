package com.example.demo.Controller;

import com.example.demo.Service.QuestionLogService;
import com.example.demo.Service.ReviewResultService;
import com.example.demo.entity.ReviewResult;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    private QuestionLogService questionLogServ;
    private ReviewResultService reviewResultServ;

    public UserController(QuestionLogService questionLogServ, ReviewResultService reviewResultServ) {
        this.questionLogServ = questionLogServ;
        this.reviewResultServ = reviewResultServ;
    }

    @GetMapping("/review")
    public String reviewArea(Model model) {
        ReviewResult reviewResult = new ReviewResult();
        reviewResult.setQuestion(questionLogServ.akhriQuestion().getQuestion());
        model.addAttribute("reviewAns", reviewResult);
        return "reviewArea";
    }

    @PostMapping("/review/submit")
    public String reviewSubmit(@ModelAttribute("reviewAns") ReviewResult reviewResult, @AuthenticationPrincipal UserDetails user) {
        reviewResult.setQuestion(questionLogServ.akhriQuestion().getQuestion());
        reviewResult.setUserName(user.getUsername());

        System.out.println(reviewResultServ.getResultFromUserName(user.getUsername()));

        if (reviewResultServ.getResultFromUserName(user.getUsername()) == null) {
            reviewResultServ.saveResult(reviewResult);
            return "redirect:/review";
        }
        return "redirect:/review";
    }


}
