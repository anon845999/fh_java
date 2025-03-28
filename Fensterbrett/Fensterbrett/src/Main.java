
import java.util.*;
public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        try {
            //es gibt keine unsigned integers in Java
            int height = 0;
            int width = 0;
            int horizontal = 0;
            int vertical = 0;
            Scanner sc = new Scanner(System.in);
                try {
                    while(height <= 0){
                        System.out.println("Gib mal die Höhe des Fensterkreuzes ein (nur positiv kein minus pls: ");
                        String heightstring = sc.nextLine();
                        height = Integer.parseInt(heightstring);
                    }
                    while(width <= 0){
                        System.out.println("Gib mal die Breite des Fensterkreuzes ein (nur positiv kein minus pls: ");
                        String widthstring = sc.nextLine();
                        width = Integer.parseInt(widthstring);
                    }
                    while (horizontal <= 0 || horizontal >= width){
                        System.out.println("Gib mal die Horizontale des Fensterkreuzes ein (nur positiv kein minus pls: ");
                        String horizontalstring = sc.nextLine();
                        horizontal = Integer.parseInt(horizontalstring);
                    }
                    while (vertical <= 0 || vertical >= height ){
                        System.out.println("Gib mal die Vertikale des Fensterkreuzes ein (nur positiv kein minus pls: ");
                        String verticalstring = sc.nextLine();
                        vertical = Integer.parseInt(verticalstring);
                    }
                }catch(Exception ex) {
                    System.out.println(ex.getMessage());
                }
            char[][] board = new char[height][width];
            for (int i = 0; i < height; i++) {
                for (int j = 0; j < width; j++) {
                    board[i][j] = '.';
                }
            }
            int horizontalhelper = horizontal;
            int verticalhelper = vertical;
            for (int i = 0; i < height; i++) {
                for (int j = 0; j < width; j++) {
                    if(i == horizontal-1) {
                        board[i][j] = '-';
                    }
                    if (j == vertical-1 )
                         {
                            board[i][j] = '|';
                        }
                    if((i == horizontalhelper-1) && (j == verticalhelper-1)) {
                        board[i][j] = '+';
                    }
                }
            }
            for (char[] cs : board) {
                System.out.println(cs);
            }
        } catch(NumberFormatException exformat) {
            exformat.printStackTrace();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
