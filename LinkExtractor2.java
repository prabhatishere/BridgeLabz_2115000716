import java.util.regex.*;
import java.util.*;

public class LinkExtractor2 {
    public static List<String> extractLinks(String text) {
        List<String> links = new ArrayList<>();
        String regex = "\\bhttps?://[a-zA-Z0-9.-]+\\.[a-z]{2,6}\\b(?:/\\S*)?";
        Matcher matcher = Pattern.compile(regex).matcher(text);

        while (matcher.find()) {
            links.add(matcher.group());
        }
        return links;
    }

    public static void main(String[] args) {
        String text = "Visit https://www.google.com and http://example.org for more info.";
        System.out.println("Extracted Links: " + extractLinks(text));
    }
}
