public class SpaceReducer {
    public static String reduceSpaces(String text) {
        return text.replaceAll("\\s+", " ");
    }

    public static void main(String[] args) {
        System.out.println(reduceSpaces("This  is  an  example   with   multiple   spaces."));
    }
}
