package sky.questionServis;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
@RequestMapping("/exam/java/")
public class JavaQuestionController {
    QuestionService service;

    public JavaQuestionController(JavaQuestionService javaQuestionService) {
        this.service = javaQuestionService;
    }

    @GetMapping("/add")
    String add(@RequestParam String question, @RequestParam String answer) {
        return service.add(question, answer);
    }

    @GetMapping("/remove")
    String remove(@RequestParam String question, @RequestParam String answer) {
        return service.remove(question, answer);
    }

    @GetMapping("/")
    Set<Question> find() {
        return service.getAll();
    }

}
