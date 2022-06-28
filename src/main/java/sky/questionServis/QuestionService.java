package sky.questionServis;

import java.util.Set;

public interface QuestionService {

    String add(String question, String answer);

    String remove(String question, String answer);

    Set<Question> getAll();

    Question getRandomQuestion();
}
