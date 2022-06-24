public class Year {

    private static int year;


    public Year(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Year{" +
                "year=" + year +
                '}';
    }

    public int getLeapYear() {
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            System.out.println("is a leap year");
        } else {
            System.out.println("is not a leap year");
        }
        return year;
    }

    }


