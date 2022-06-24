import java.util.Scanner;


public class Solution {
    static boolean isAnagram(String a, String b) {

        a=a.toLowerCase();
        b=b.toLowerCase();
        // If length of both strings is not same,
        // then they cannot be anagram
        if(a.length()==b.length())
        {
//            Create count arrays of size 256 for both strings.
            int[] arr = new int[256];
            int[] brr = new int[256];
            // For each character in input strings,
            // increment count in the corresponding
            for (int i = 0; i < a.length(); i++) {
                arr[a.charAt(i)] += 1;
                brr[b.charAt(i)] += 1;
            }
            // Compare count arrays
            for (int i = 0; i < 256; i++) {
                if (arr[i] != brr[i])
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
        if(ret)System.out.println("Anagram");
        else System.out.println("Not Anagram");
    }
}
