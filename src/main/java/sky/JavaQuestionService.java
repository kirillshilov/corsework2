package sky;

import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class JavaQuestionService implements QuestionService {

    Set < Question > questions = new HashSet < Question > ();


    @Override
    public void add(String question, String answer) {
    questions.add(new Question (question, answer));

    }

    @Override
    public void remove(String question, String answer) {
      Question temp = new Question(question,answer);
        if (!questions.contains(temp)){
       throw new NotFoundException("Вопрос не найден");
                    }
        questions.remove(temp);
    }

    @Override
    public void find() {

    }
}
