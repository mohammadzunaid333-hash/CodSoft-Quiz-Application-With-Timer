import java.util.ArrayList;
import java.util.List;

public class QuestionBank {

    public static List<Question> getQuestions() {

        List<Question> questions = new ArrayList<>();

        questions.add(new Question(
                "What is the capital of India?",
                new String[]{"Mumbai", "New Delhi", "Hyderabad", "Chennai"},
                2));

        questions.add(new Question(
                "Who invented Java?",
                new String[]{"James Gosling", "Dennis Ritchie", "Bjarne Stroustrup", "Guido van Rossum"},
                1));

        questions.add(new Question(
                "Which company developed Java?",
                new String[]{"Microsoft", "Sun Microsystems", "Google", "Apple"},
                2));

        questions.add(new Question(
                "Which keyword is used for inheritance in Java?",
                new String[]{"extends", "implements", "inherits", "super"},
                1));

        questions.add(new Question(
                "Which method is the entry point of a Java program?",
                new String[]{"run()", "main()", "start()", "execute()"},
                2));

        questions.add(new Question(
                "Which collection stores unique elements?",
                new String[]{"ArrayList", "LinkedList", "HashSet", "Vector"},
                3));

        questions.add(new Question(
                "Which keyword is used to create an object?",
                new String[]{"class", "this", "new", "create"},
                3));

        questions.add(new Question(
                "Which package contains Scanner class?",
                new String[]{"java.io", "java.util", "java.lang", "java.sql"},
                2));

        questions.add(new Question(
                "What does JVM stand for?",
                new String[]{"Java Variable Machine", "Java Virtual Machine", "Java Verified Machine", "Joint Virtual Machine"},
                2));

        questions.add(new Question(
                "Which operator compares two values?",
                new String[]{"=", "==", "!=", "&&"},
                2));

        questions.add(new Question(
                "How many days are there in a leap year?",
                new String[]{"365", "364", "366", "367"},
                3));

        questions.add(new Question(
                "Which planet is known as the Red Planet?",
                new String[]{"Earth", "Mars", "Venus", "Jupiter"},
                2));

        questions.add(new Question(
                "Which is the largest ocean?",
                new String[]{"Atlantic", "Indian", "Pacific", "Arctic"},
                3));

        questions.add(new Question(
                "What is the national animal of India?",
                new String[]{"Lion", "Tiger", "Elephant", "Leopard"},
                2));

        questions.add(new Question(
                "Which language is primarily used for Android development?",
                new String[]{"Python", "Java", "C", "PHP"},
                2));

        questions.add(new Question(
                "Which loop executes at least once?",
                new String[]{"for", "while", "do-while", "foreach"},
                3));

        questions.add(new Question(
                "Which keyword is used to stop a loop?",
                new String[]{"continue", "break", "return", "exit"},
                2));

        questions.add(new Question(
                "Which data type stores decimal values?",
                new String[]{"int", "char", "double", "boolean"},
                3));

        questions.add(new Question(
                "Which symbol is used for comments in Java (single line)?",
                new String[]{"/* */", "//", "#", "<!-- -->"},
                2));

        questions.add(new Question(
                "Which class is the parent of all Java classes?",
                new String[]{"Main", "Object", "Class", "System"},
                2));

        return questions;
    }
}