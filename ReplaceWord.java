import java.util.*;

public class ReplaceWord {
    static String replaceWord(String sentence, String oldWord, String newWord) {
        return sentence.replace(oldWord, newWord);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        String oldWord = sc.next();
        String newWord = sc.next();
        System.out.println(replaceWord(sentence, oldWord, newWord));
        sc.close();
    }
}
