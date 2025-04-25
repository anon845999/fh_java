package Battleship;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class BattleShipGameManager {


   private BattleShipGameManager(){}

    public static class BattleShipGameManagerInstance{
        private static final BattleShipGameManager instance = new BattleShipGameManager();

        public void startGame(){
            boolean isBoardNotYetCreated = true;

            Board board = null;
            Random random = new Random();
            Player player1 = new Player();
            Player player2 = new Player();
            boolean isGameFinished = false;
            boolean hasAPLayerWon = false;
            Scanner sc = new Scanner(System.in);
            ArrayList<Integer> freeFields = new ArrayList<Integer>();



            while(isBoardNotYetCreated){
                System.out.println("BattleShipGameManagerInstance startGame");
                System.out.println("Each Player has one move per round");
                System.out.println("How big shall the board be? not greater than 10 pls");
                System.out.println("if numbers not valid, field of 10,10 would be generated than");

                System.out.println("gimme the width of the board: (not longer than maybe 10 ? for simplification");

                UtilityClass.userInput = sc.nextLine();
                int width = UtilityClass.tryParseToInteger(UtilityClass.userInput);

                System.out.println("gimme the height of the board: (not longer than maybe 10 ? for simplification");
                UtilityClass.userInput = sc.nextLine();
                int height = UtilityClass.tryParseToInteger(UtilityClass.userInput);

                if(width >= 0 && height >= 0 && width <= 10 && height <= 10){
                    board = getBoard(width, height);
                    isBoardNotYetCreated = false;
                }
            }

            Round currentRound = Round.PLAYER_1_ACTIVE;

            BoardPrinter boardPrinter = new BoardPrinter(board);
            boardPrinter.printBoard(board);


            System.out.println("BattleShipGameManagerInstance startGame");


               while(!isGameFinished){
                   isGameFinished = board.isBoardFinished();
                   boardPrinter.printBoard(board);
                   freeFields = board.getFreeFields();
                   if(currentRound == Round.PLAYER_1_ACTIVE){
                       System.out.println("Player 1's turn");
                       System.out.println();
                       System.out.println("on which coordinates u wanna make ur next move?:(x,y) ");
                       System.out.println("Numbers for field: " + freeFields.size());

                       System.out.println("gimme x coordinates: ");
                       UtilityClass.userInput = sc.nextLine();
                       int x = UtilityClass.tryParseToInteger(UtilityClass.userInput);
                       System.out.println();
                       System.out.println("gimme y coordinates: ");
                       UtilityClass.userInput = sc.nextLine();
                       int y = UtilityClass.tryParseToInteger(UtilityClass.userInput);
                       System.out.println();

                       if(board.getField(x, y) == State.SHIP_NO_HIT){
                           board.player1.addPoints(1);
                           board.setField(x,y, State.SHIP_HIT);
                       }
                       currentRound = Round.PLAYER_2_ACTIVE;
                       continue;
                   }
                   if(currentRound == Round.PLAYER_2_ACTIVE){
                       System.out.println("Player 2's turn");

                       System.out.println();
                       System.out.println("on which coordinates u wanna make ur next move?:(x,y) ");
                       System.out.println("Numbers for field: " + freeFields.size());

                       System.out.println("gimme x coordinates: ");
                       UtilityClass.userInput = sc.nextLine();
                       int x = UtilityClass.tryParseToInteger(UtilityClass.userInput);
                       System.out.println();
                       System.out.println("gimme y coordinates: ");
                       UtilityClass.userInput = sc.nextLine();
                       int y = UtilityClass.tryParseToInteger(UtilityClass.userInput);
                       System.out.println();

                       //todo  bessere punkteübersicht
                       if(board.getField(x, y) == State.SHIP_NO_HIT){
                           board.player2.addPoints(1);
                           board.setField(x,y, State.SHIP_HIT);
                       }
                       currentRound = Round.PLAYER_1_ACTIVE;
                   }

               }
            System.out.println("Lets see which player has won: ");
               if(board.player1.getPoints()> board.player2.getPoints()){
                   System.out.println("Player 1 has won !! with" + board.player1.getPoints() + " points");
               }else if(board.player2.getPoints()> board.player1.getPoints()){
                   System.out.println("Player 2 has won !! with" + board.player2.getPoints() + " points");
               }
               if(board.player1.getPoints() == board.player2.getPoints()){
                   System.out.println("its a draw");
                   System.out.println("Player1 points: " + board.player1.getPoints());
                   System.out.println("Player2 points: " + board.player2.getPoints());
               }



                


        }

        private Board getBoard(int width, int height){
            Board board = new Board(width, height,getPlayer(),getPlayer());
            return board;
        }
        private Player getPlayer(){
            return new Player();
        }
        
    }

    public static BattleShipGameManager getInstance(){
        return BattleShipGameManagerInstance.instance;
    }

}
