package sky.questionServis;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
@Scope ("Singleton")
public class JavaQuestionService implements QuestionService {

    private static Set<Question> questions = new LinkedHashSet<>();


    @Override
    public String add(String question, String answer) {
        Question temp = new Question(question, answer);
        if (questions.contains(temp)) {
            return "Question already has";
        }
        questions.add(temp);
        return "Question added";
    }

    @Override
    public String remove(String question, String answer) {
        Question temp = new Question(question, answer);
        if (!questions.contains(temp)) {
            return "Question not Found";
        }
        questions.remove(temp);
        return "Question removed";
    }

    @Override
    public Set<Question> getAll() {
        return questions;
    }

    @Override
    public Question getRandomQuestion() {
        final Random random = new Random();
        List<Question>
                temp = questions.stream().toList();
        return temp.get(random.nextInt(questions.size()));
    }
}
