package com.example.quizapp.controller;

import com.example.quizapp.dao.QuestionDao;
import com.example.quizapp.model.Question;
import com.example.quizapp.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/question")
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    @GetMapping("/allQuestions")
    public List<Question> getAllQuestions() {
        return questionService.getAllQuestions();
    }

    @GetMapping("/category/{category}")
    public List<Question> getQuestionsByCategory(@PathVariable String category) {
        return questionService.getQuestionsByCategory(category);
    }

    @PostMapping("/add")
    public String addQuestion(@RequestBody Question question) {
        questionService.addOrUpdateQuestion(question);
        return "success!";
    }

    @PostMapping("/update")
    public String updateQuestion(@RequestBody Question question) {
        questionService.addOrUpdateQuestion(question);
        return "success!";
    }
}
