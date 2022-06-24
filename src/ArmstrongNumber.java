public class ArmstrongNumber {

    static int n;

    public ArmstrongNumber(int n) {
        this.n = n;
    }


    public static boolean isArmstrong() {
        int remainder, sum = 0, temp;
        temp = n;
        while (n > 0) {
            remainder = n % 10;
            sum = sum + (remainder * remainder * remainder);
            n = n / 10;
        }

        if (sum == temp)
            System.out.println("armstrong number");
        else
            System.out.println("Not armstrong number");
        return false;
    }
}



