package sky.exam;

import sky.questionServis.Question;

import java.util.Set;

public interface ExaminerService {
    Set<Question> getQuestions(int amount);

}
