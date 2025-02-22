public class BadWordFilter {
    public static String censorBadWords(String text) {
        return text.replaceAll("damn|stupid", "****");
    }

    public static void main(String[] args) {
        System.out.println(censorBadWords("This is a damn bad example with some stupid words."));
    }
}
