import java.util.Arrays;
import java.util.Scanner;

public class NumberWar {
    public static void WinningNumbers() {
    System.out.println("Enter the required size of the array :: ");
    Scanner scanner = new Scanner(System.in);
    int size = scanner.nextInt();
    int[] myArray = new int [size];
    int sumEven = 0;
    int sumOdd = 0;
    int differenceEvenOdd = 0;
    System.out.println("Enter the elements of the array one by one ");
      for(int i=0; i<size; i++){
        myArray[i] = scanner.nextInt();
          if ((myArray[i])%2==0)
                sumEven = sumEven + myArray[i];
            else
                sumOdd = sumOdd + myArray[i];
          differenceEvenOdd = sumOdd - sumEven;

    }

        System.out.println("Even sum: " + sumEven);
        System.out.println("Odd sum: " + sumOdd);
        System.out.println("Different between EvenSum and OddSum: " + differenceEvenOdd);
}
}


