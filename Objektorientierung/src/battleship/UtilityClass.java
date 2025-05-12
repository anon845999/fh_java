package battleship;

public class UtilityClass {

    public static String userInput;
    private UtilityClass(){
        throw new UnsupportedOperationException("UtilityClass cannot be instantiated");
    }


    public static int tryParseToInteger(String userInput){
        try {
            return Integer.parseInt(userInput);
        }catch (NumberFormatException e){
            throw new UnsupportedOperationException("User input not a valid integer");
        }
    }

    public static double tryParseToDouble(String userInput){
        try {
            return Double.parseDouble(userInput);
        }catch (NumberFormatException e){
            throw new UnsupportedOperationException("User input not a valid double");
        }
    }
    public static char tryParseToChar(String userInput){
        try {
            return userInput.charAt(0);
        }catch (IndexOutOfBoundsException e){
            throw new UnsupportedOperationException("User input not a valid char");
        }
    }
    public static boolean tryParseToBoolean(String userInput){
        try {
            return Boolean.parseBoolean(userInput);
        }catch (NumberFormatException e){
            throw new UnsupportedOperationException("User input not a valid boolean");
        }
    }


}
