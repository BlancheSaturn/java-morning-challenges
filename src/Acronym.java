public class Acronym {

        public static String getAcronym(String input) {
            String output = "";

            output += input.charAt(0);

            for (int i = 1; i < input.length(); i++) {
                if (Character.isWhitespace(input.charAt(i))) {
                    output = output + input.charAt(i);
                    output += input.charAt(i+1);
                }
            }

            return output.replaceAll("\\s+","").toUpperCase();
        }

//        public static void main(String[] args) {
//            System.out.print(getAcronym("Mind Your Business"));
//
//        }

}





//    Call toUpperCase() on the string assigning the result back to the original string.
//        Call split("\\s+") on that String assigning the result to a new String[]
//        On each element of that array call trim() assigning the result back into the same element of the array.
//        Call charAt(0) on each element of the array to retrieve the acronym characters.
