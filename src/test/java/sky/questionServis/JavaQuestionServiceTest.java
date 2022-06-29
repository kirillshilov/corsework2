package sky.questionServis;


import org.junit.jupiter.api.Test;


import java.util.HashSet;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;


class JavaQuestionServiceTest {
    QuestionService test = new JavaQuestionService();

    @Test
    void shouldReturnQuestionAlreadyHasMassage() {
        test.add("Test Question", "TestAnswer");
        assertEquals("Question already has", test.add("Test Question", "TestAnswer"));
        test.remove("Test Question", "TestAnswer");
    }

    @Test
    void shouldReturnQuestionAddedMassage() {
        assertEquals("Question added", test.add("Test Question", "TestAnswer"));
        test.remove("Test Question", "TestAnswer");
    }

    @Test
    void shouldReturnQuestionNotFoundMassage() {
        assertEquals("Question not Found", test.remove("Test Question", "TestAnswer"));
    }

    @Test
    void shouldReturnQuestionRemovedMassage() {
        test.add("Test Question", "TestAnswer");
        assertEquals("Question removed", test.remove("Test Question", "TestAnswer"));
        test.remove("Test Question", "TestAnswer");
    }

    @Test
    void shouldReturnEmptySet() {
        Set<Question> temp = new HashSet<>();
        assertEquals(temp, test.getAll());
    }

    @Test
    void shouldReturnSetWithQuestions() {
        Set<Question> temp = new HashSet<>();
        temp.add(new Question("Test Question", "TestAnswer"));
        test.add("Test Question", "TestAnswer");
        assertEquals(temp, test.getAll());
        test.remove("Test Question", "TestAnswer");
    }

    @Test
    void shouldReturnNotNull() {
        test.add("Test Question", "TestAnswer");
        assertNotNull(test.getRandomQuestion());
        test.remove("Test Question", "TestAnswer");
    }
}