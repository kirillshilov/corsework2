package sky.exam;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import sky.questionServis.Question;

import java.util.Set;

@RestController
public class ExamController {
    ExaminerService service;

    public ExamController(ExaminerServiceImpl service) {
        this.service = service;
    }

    @GetMapping("exam/java/beginexam")
    Set <Question> getQuestions(@RequestParam int amount) {
        return service.getQuestions(amount);
    }
}
