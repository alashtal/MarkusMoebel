import java.util.Scanner;

/*
 * A class, that calculates the sum of all letters values in a word/s.
 * @author Moe Al Ashtal
 */
public class WordsCalculator {
    /*
     * The set of Alphabet letters in order
     */
    private final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

    /*
     * reads the name from the standard input.
     * @return name The read name.
     */
    public String readName() {
        String name = "";
				
        Scanner scan = new Scanner(System.in);
        name = scan.nextLine();
        scan.close();

        return name;
    }

    /*
     * calculates the total value of all the letters in a string
     * @return wordValue The value of the word.
     */
    public int calculator(String word) {
        int wordValue = 0;

        for (int i = 0; i < word.length(); i++)
        {
            // Gets the lower cased character's position in its alphabetical order,
            int charPosition = ALPHABET.indexOf(word.toLowerCase().charAt(i));

            // Adds 1 to the character position, as it starts counting from 0.
            // Also any entry that's not a letter is considered as -1, so it adds 1 to make it 0.
            int keyVal = charPosition + 1;

            // Adds the keyVal to the wordValue.
            wordValue += keyVal;
        }

        return wordValue;
    }

}
