public class Result {

    public static void showResult(String name, int score, int totalQuestions) {

        System.out.println("\n========================");
        System.out.println("       QUIZ RESULT");
        System.out.println("========================");
        System.out.println("Player : " + name);
        System.out.println("Score : " + score + " / " + totalQuestions);

        double percentage = (score * 100.0) / totalQuestions;
        System.out.printf("Percentage : %.2f%%\n", percentage);

        if (percentage >= 80) {
            System.out.println("Excellent!");
        } else if (percentage >= 60) {
            System.out.println("Good Job!");
        } else {
            System.out.println("Keep Practicing!");
        }
    }
}