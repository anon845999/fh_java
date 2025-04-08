package HelperClass;

import java.util.Scanner;

public class CUserinput {

    private final Scanner sc = new Scanner(System.in);
    private String input;
    public CUserinput() {
    }

    public void askUser(String input) {
        System.out.println("Gib mal ein was zum eingeben");
    }

    public void close(){
        sc.close();
    }

    public void setInput(String input) {
        this.input = input;
    }

    public String getInput() {
        return input;
    }

    public Integer tryParse(String input) {
        try {
            return Integer.parseInt(input);

        }catch (Exception e) {
            throw new NumberFormatException("Pls give in an valid Integer: ");
        }
    }
    public Double tryParseDouble(String input) {
        try {
            return Double.parseDouble(input);
        }catch (Exception e) {
            throw new NumberFormatException("Pls give in an valid Double:  ");
        }
    }
    public Float tryParseFloat(String input) {
        try {
            return Float.parseFloat(input);
        }catch (Exception e) {
            throw new NumberFormatException("Pls give in an valid Float:  ");
        }
    }
    public Boolean tryParseBoolean(String input) {
        try {
            return Boolean.parseBoolean(input);
        }catch (Exception e) {
            throw new NumberFormatException("Pls give in an valid Boolean:  ");
        }
    }




}
