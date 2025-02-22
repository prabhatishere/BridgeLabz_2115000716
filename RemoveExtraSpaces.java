public class RemoveExtraSpaces {
    public static String removeExtraSpaces(String text) {
        return text.replaceAll("\\s+", " ").trim();
    }

    public static void main(String[] args) {
        String input = "This   is  an   example   with    multiple    spaces.";
        String result = removeExtraSpaces(input);
        System.out.println("Output: \"" + result + "\"");
    }
}
