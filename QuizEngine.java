public class QuizEngine {
    private int score = 0;
    private int totalQuestions = 0;

    public boolean checkAnswer(String userInput, String correctAnswer) {
        totalQuestions++;
        if (userInput.trim().equalsIgnoreCase(correctAnswer.trim())) {
            score++;
            return true;
        }
        return false;
    }

    public int getScore() { return score; }
    public int getTotal() { return totalQuestions; }
}
