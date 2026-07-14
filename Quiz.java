import java.util.List;

public class Quiz {

    private List<Question> questions;

    public Quiz() {
        questions = QuestionBank.getQuestions();
    }

    public List<Question> getQuestions() {
        return questions;
    }
}