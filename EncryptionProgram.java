import javax.swing.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EncryptionProgram {
    static protected Scanner scanner;
    static protected Random random;
    static protected ArrayList<Character> list;
    static protected ArrayList<Character> shuffledList;
    static protected char character;
    static protected String line;
    static protected char[] letters;

    EncryptionProgram() {

        scanner = new Scanner(System.in);
        random = new Random();
        list = new ArrayList();
        shuffledList = new ArrayList();
        character = ' ';

        MyUI myUI = new MyUI();
        newKey();

    }
    static protected void newKey() {

        character = ' ';
        list.clear();
        shuffledList.clear();

        for (int i = 32; i < 127; i++) {
            list.add(Character.valueOf(character));
            character++;
        }

        shuffledList = new ArrayList(list);
        Collections.shuffle(shuffledList);

        String stringShuffledList = String.valueOf(shuffledList)
                .replace(",,", "Netherlands")
                .replace(",", "")
                .replace("Netherlands", ",")
                .replace("  ", "Amsterdam")
                .replace(" ", "")
                .replace("Amsterdam", " ");

        MyUI.keyField.setText(stringShuffledList.substring(1, stringShuffledList.length() - 1));
    }

    static protected void setKey() {

        for (int i = 32; i < 127; i++) {
            list.add(Character.valueOf(character));
            character++;
        }

        shuffledList.clear();
        String str1 = MyUI.keyField.getText();

        for (char c : str1.toCharArray()) {
            shuffledList.add(c);
        }

        MyUI.keyField.setText(str1.substring(1, str1.length() - 1));
    }

    static protected void encrypt() {

        String message = MyUI.messageField.getText();
        letters = message.toCharArray();

        for (int i = 0; i < letters.length; i++) {
            for (int j = 0; j < list.size(); j++) {
                if (letters[i] == list.get(j)) {
                    letters[i] = shuffledList.get(j);
                    break;
                }
            }
        }

        MyUI.messageField.setText(String.valueOf(letters));
    }

    static protected void decrypt() {

        String message = MyUI.messageField.getText();
        letters = message.toCharArray();

        for (int i = 0; i < letters.length; i++) {
            for (int j = 0; j < shuffledList.size(); j++) {
                if (letters[i] == shuffledList.get(j)) {
                    letters[i] = list.get(j);
                    break;
                }
            }
        }

        MyUI.messageField.setText(String.valueOf(letters));
    }
}