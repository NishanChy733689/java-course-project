import java.util.Random;
import java.util.Scanner;

public class MathQuiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int score = 0;
        int numberOfQuestions = 15; // More than 10 questions

        for (int i = 0; i < numberOfQuestions; i++) {
            int num1 = random.nextInt(100);
            int num2 = random.nextInt(100);
            int correctAnswer = num1 + num2;

            System.out.println("Question " + (i + 1) + ": What is " + num1 + " + " + num2 + "?");
            int userAnswer = scanner.nextInt();

            if (userAnswer == correctAnswer) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect. The correct answer is " + correctAnswer);
            }
        }

        System.out.println("Quiz Over! You scored " + score + " out of " + numberOfQuestions);
        scanner.close();
    }
}

