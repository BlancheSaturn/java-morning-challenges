
// Convert each letter of the string to the lower or upper case.
// Create a frequency array to mark the frequency of each letter from a to z.
// Then, loop the frequency array and if there is any letter that is not present in the given string then print No, otherwise print Yes.


public class Pangram {
 // declare size so we can yse to check the frequency of the letter
    static int size = 26;

    // Function to check if ch is a letter
    public static boolean isLetter(char ch) {
        return Character.isLetter(ch);
    }

    // Function to check if a string
    // contains all the letters from
    // a to z
    public static boolean isPangram(String sentence, int len) {
        // Convert the given string
        // into lowercase
        sentence = sentence.toLowerCase();
        //create a frequency array to mark the frequency of each letter from a to z
        // Create a frequency array to
        // mark the present letters
        boolean[] current = new boolean[size];
        // loop for each character
        // of the string
        for (int i = 0; i < len; i++) {
            // If the current character
            // is a letter
            if (isLetter(sentence.charAt(i))) {

                // Mark current letter as current
                int letter = sentence.charAt(i) - 'a';
                current[letter] = true;
            }
        }
        // loop for every letter
        // from a to z
        for (int i = 0; i < size; i++) {

            // If the current character
            // is not present in string
            // then return false,
            // otherwise return true
            if (!current[i])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        // Given string sentence
        String sentence = "The quick brown fox jumps over the lazy dog";
        int len = sentence.length();

        // If the sentence is a Pangram print Yes, if not print No.
        if (isPangram(sentence, len)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}


