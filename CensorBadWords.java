import java.util.regex.*;

public class CensorBadWords {
    public static String censorBadWords(String text) {
        // List of bad words to be censored
        String[] badWords = {"damn", "stupid"};
        
        // Replace each bad word with ****
        for (String badWord : badWords) {
            text = text.replaceAll("(?i)\\b" + badWord + "\\b", "****");
        }
        return text;
    }

    public static void main(String[] args) {
        String input = "This is a damn bad example with some stupid words.";
        String result = censorBadWords(input);
        System.out.println("Output: " + result);
    }
}
