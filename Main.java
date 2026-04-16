import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            QuizLoader loader = new QuizLoader("questions.txt");
            QuizEngine engine = new QuizEngine();
            String[] qa;

            while ((qa = loader.getNextQuestion()) != null) {
                System.out.println("\nQuestion: " + qa[0]);
                System.out.print("Your Answer: ");
                String input = scanner.nextLine();

                if (engine.checkAnswer(input, qa[1])) {
                    System.out.println("Correct!");
                } else {
                    System.out.println("Wrong! The right answer was: " + qa[1]);
                }
            }

            // The Ending Screen
            System.out.println("\n============================");
            System.out.println("Final Score: " + engine.getScore() + "/" + engine.getTotal());
            System.out.println("============================");

        } catch (Exception e) {
            System.out.println("System Error: " + e.getMessage());
        }
    }
}
