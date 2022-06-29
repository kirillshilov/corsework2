package sky.exam;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import sky.questionServis.JavaQuestionService;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import sky.exam.BedParamException;
import sky.questionServis.Question;
import sky.questionServis.QuestionService;

import java.util.HashSet;
import java.util.Set;

class ExaminerServiceImplTest {
private final QuestionService serviceMock = mock(JavaQuestionService.class);
private final ExaminerService test = new ExaminerServiceImpl(serviceMock);

    @Test
    void shouldReturnBadParamException() {
        when(serviceMock.getAll()).thenReturn(Set.of(new Question("aaa", "bbb")));
        Assertions.assertThrows(BedParamException.class,()-> test.getQuestions(3));
    }
    @Test
    void shouldReturnSetOfQuestions() {
        Set <Question> temp = new HashSet<>();
        temp.add(new Question("aaa", "bbb"));
        temp.add(new Question("bbb", "ccc"));
        temp.add(new Question("ccc", "ddd"));
        when(serviceMock.getAll()).thenReturn(temp);
        Assertions.assertEquals(temp, test.getQuestions(1));
    }
}