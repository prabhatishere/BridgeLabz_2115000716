import java.util.regex.*;
import java.util.ArrayList;

public class ExtractProgrammingLanguages {
    public static void main(String[] args) {
        String text = "I love Java, Python, and JavaScript, but I haven't tried Go yet.";

        // List of programming languages to search for
        String[] languages = {"Java", "Python", "JavaScript", "Go", "C", "C++", "Ruby", "Swift", "Kotlin", "PHP", "R", "Perl", "Rust", "TypeScript"};

        ArrayList<String> foundLanguages = new ArrayList<>();

        // Check each language in the text
        for (String lang : languages) {
            String regex = "\\b" + lang + "\\b"; // Match whole words only
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(text);

            if (matcher.find()) {
                foundLanguages.add(lang);
            }
        }

        // Print results
        System.out.println(String.join(", ", foundLanguages));
    }
}
