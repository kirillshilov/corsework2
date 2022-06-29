package sky.exam;


import org.springframework.stereotype.Service;
import sky.questionServis.Question;
import sky.questionServis.QuestionService;

import java.util.HashSet;

import java.util.Set;

@Service
public class ExaminerServiceImpl implements ExaminerService {
    QuestionService service;

    public ExaminerServiceImpl(QuestionService javaQuestionService) {
        this.service = javaQuestionService;
    }

    @Override
    public Set<Question> getQuestions(int amount) {
        Set<Question> temp = new HashSet<>();
        if (amount > service.getAll().size()) {
            throw new BedParamException("very large number");
        }
       while (temp.size() < amount){
           temp.add(service.getRandomQuestion());
       }
        return temp;
    }
}
