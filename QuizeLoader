import java.io.*;
import java.util.*;

public class QuizLoader {
    private BufferedReader reader;

    public QuizLoader(String filePath) throws FileNotFoundException {
        this.reader = new BufferedReader(new FileReader(filePath));
    }

    // This returns a simple Map or a custom 'Question' object
    public String[] getNextQuestion() throws IOException {
        String line;
        String q = null, a = null;
        
        while ((line = reader.readLine()) != null) {
            if (line.startsWith("Q> ")) q = line.substring(3);
            if (line.startsWith("A> ")) a = line.substring(3);
            if (line.equals("----QUESTION_BANK_END----")) {
                return new String[]{q, a};
            }
        }
        return null; // Signals end of file
    }
}
