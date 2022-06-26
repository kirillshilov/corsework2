package sky;

import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class JavaQuestionService implements QuestionService {

    Set <Question> questions = new HashSet <Question>();


    @Override
    public void add(String question, String answer) {
    questions.add(new Question(question, answer));

    }

    @Override
    public void remove() {
        if (questions.contains())

    }

    @Override
    public void find() {

    }
}
