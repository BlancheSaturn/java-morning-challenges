
import java.util.Scanner;

//   1. Create count arrays of size 256 for both strings.
//   2. Iterate through every character of both strings and increment the count of character
//   in the corresponding count arrays.
//   3. Compare count arrays. If both count arrays are same, then return true.

public class Anagrams {
    static boolean isAnagram(String a, String b) {
        // Make the string to lowercase so they can be case-insensitive
        a=a.toLowerCase();
        b=b.toLowerCase();
        //Check if both string are the same length
        // If length of both strings is not same,
        // then they cannot be anagram
        if(a.length()==b.length())
        {
//            Create count arrays of size 256 for both strings.
            int[] arr1 = new int[256];
            int[] arr2 = new int[256];
            // For each character in input strings,
            // increment count in the corresponding
            for (int i = 0; i < a.length(); i++) {
                arr1[a.charAt(i)] += 1;
                arr2[b.charAt(i)] += 1;
            }
            // Compare count arrays
            for (int i = 0; i < 256; i++) {
                if (arr1[i] != arr2[i])
                    return false;
            }
            return true;
        }
        else
        {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter two string:: ");
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        String b = scanner.next();
        scanner.close();
        boolean ret = isAnagram(a, b);
        if(ret)System.out.println("Anagram Strings");
        else System.out.println("Not Anagram Strings");
    }
}
