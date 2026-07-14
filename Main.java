import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("==========================================");
        System.out.println("         CODSOFT QUIZ APPLICATION");
        System.out.println("==========================================");

        System.out.print("Enter Your Name: ");
        String name = scanner.nextLine();

        User user = new User(name);

        Quiz quiz = new Quiz();
        List<Question> questions = quiz.getQuestions();

        if (questions == null || questions.isEmpty()) {
            System.out.println("No questions available!");
            scanner.close();
            return;
        }

        System.out.println("\nWelcome " + user.getName() + "!");
        System.out.println("Best of Luck!\n");

        for (int i = 0; i < questions.size(); i++) {

            Question q = questions.get(i);

            System.out.println("------------------------------------------");
            System.out.println("Question " + (i + 1));
            System.out.println(q.getQuestion());

            String[] options = q.getOptions();

            for (int j = 0; j < options.length; j++) {
                System.out.println((j + 1) + ". " + options[j]);
            }

            // Start Timer
            Timer timer = new Timer(10);
            timer.start();

            int answer = 0;

            while (true) {

                System.out.print("Enter your answer (1-4): ");

                if (scanner.hasNextInt()) {

                    answer = scanner.nextInt();

                    timer.interrupt();

                    if (answer >= 1 && answer <= 4) {
                        break;
                    } else {
                        System.out.println("Please enter a number between 1 and 4.");
                    }

                } else {

                    System.out.println("Invalid input! Please enter numbers only.");
                    scanner.next();
                }
            }

            if (answer == q.getCorrectAnswer()) {

                System.out.println("✅ Correct!");
                user.increaseScore();

            } else {

                System.out.println("❌ Wrong!");
                System.out.println("Correct Answer: " +
                        options[q.getCorrectAnswer() - 1]);
            }

            System.out.println();
        }

        Result.showResult(
                user.getName(),
                user.getScore(),
                questions.size()
        );

        System.out.println("==========================================");
        System.out.println("        THANK YOU FOR PLAYING!");
        System.out.println("==========================================");

        scanner.close();
    }
}