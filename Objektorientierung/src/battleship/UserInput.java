package battleship;

import java.util.Scanner;

public class UserInput {

    private String rawUserInput;
    private int xCoordinate;
    private int yCoordinate;

    private int integerValue;
    private double doubleValue;
    private char charValue;
    private boolean booleanValue;

    public int getIntegerValue() {
        return integerValue;
    }

    public void setIntegerValue(int integerValue) {
        this.integerValue = integerValue;
    }

    public UserInput(String rawUserInput){
        this.rawUserInput = rawUserInput;
    }
    public String getRawUserInput() {
        return rawUserInput;
    }
    public void setRawUserInput(String rawUserInput) {
        this.rawUserInput = rawUserInput;
    }

    public boolean isBooleanValue() {
        return booleanValue;
    }

    public void setBooleanValue(boolean booleanValue) {
        this.booleanValue = booleanValue;
    }

    public char getCharValue() {
        return charValue;
    }

    public void setCharValue(char charValue) {
        this.charValue = charValue;
    }

    public double getDoubleValue() {
        return doubleValue;
    }

    public void setDoubleValue(double doubleValue) {
        this.doubleValue = doubleValue;
    }

    public int getxCoordinate() {
        return xCoordinate;
    }

    public void setxCoordinate(int xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

    public int getyCoordinate() {
        return yCoordinate;
    }

    public void setyCoordinate(int yCoordinate) {
        this.yCoordinate = yCoordinate;
    }

    //Methods (! getter and setter)
    public String getUserInput(){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        return input;
    }

    public  int tryParseToInteger(String userInput){
        try {
            return Integer.parseInt(userInput);
        }catch (NumberFormatException e){
            throw new UnsupportedOperationException("User input not a valid integer");
        }
    }

    public  double tryParseToDouble(String userInput){
        try {
            return Double.parseDouble(userInput);
        }catch (NumberFormatException e){
            throw new UnsupportedOperationException("User input not a valid double");
        }
    }
    public char tryParseToChar(String userInput){
        try {
            return userInput.charAt(0);
        }catch (IndexOutOfBoundsException e){
            throw new UnsupportedOperationException("User input not a valid char");
        }
    }
    public boolean tryParseToBoolean(String userInput){
        try {
            return Boolean.parseBoolean(userInput);
        }catch (NumberFormatException e){
            throw new UnsupportedOperationException("User input not a valid boolean");
        }
    }
}
