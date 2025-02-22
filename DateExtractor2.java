import java.util.regex.*;
import java.util.*;

public class DateExtractor2 {
    public static List<String> extractDates(String text) {
        List<String> dates = new ArrayList<>();
        Matcher matcher = Pattern.compile("\\b(\\d{2}/\\d{2}/\\d{4})\\b").matcher(text);

        while (matcher.find()) {
            dates.add(matcher.group());
        }
        return dates;
    }

    public static void main(String[] args) {
        String text = "The events are scheduled for 12/05/2023, 15/08/2024, and 29/02/2020.";
        System.out.println("Extracted Dates: " + extractDates(text));
    }
}
