import java.sql.SQLOutput;
import java.util.Scanner;

public class TicTacToe {
    private static void print(char[][] gameBoard){
        for (int i = 0 ; i < gameBoard.length ;i++){
            for (int j = 0; j < gameBoard[0].length;j++){
                System.out.print(gameBoard[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] gameBoard = {{' ','|',' ','|',' '},{'-','+','-','+','-'},{' ','|',' ','|',' '},{'-','+','-','+','-'},{' ','|',' ','|',' '}};
        System.out.println("Hence the game Begins");
        int count = 1;
        char winner = ' ';

        System.out.println("Player X turn");
        System.out.println("Enter Position");
        int posX = scanner.nextInt();
        put(gameBoard,posX,'x');
        count++;
        print(gameBoard);
        System.out.println("__________________________________");

        while (!checkWin(gameBoard,winner)){
            if (count >= 9){
                System.out.println("Its A Tie");
                break;
            }
            System.out.println("Player O turn");
            System.out.println("Enter Position");
            int posO = scanner.nextInt();
            put(gameBoard,posO,'O');
            count++;
            print(gameBoard);
            System.out.println("__________________________________");
            System.out.println("Player X turn");
            System.out.println("Enter Position");
            posX = scanner.nextInt();
            put(gameBoard,posX,'x');
            count++;
            print(gameBoard);
            System.out.println("__________________________________");
        }
    }

    private static void put(char[][] arr,int posX,char c) {
        switch (posX) {
            case 1:
                if (arr[0][0] == ' ') {
                    arr[0][0] = c;
                }
                else {
                    System.out.println("Due to Violation of rules You lost Your Turn ");
                }
                break;
            case 2:
                if (arr[0][2] == ' ') {
                    arr[0][2] = c;
                }
                else {
                    System.out.println("Due to Violation of rules You lost Your Turn ");
                }
                break;
            case 3:
                if (arr[0][4] == ' ') {
                    arr[0][4] = c;
                }
                else {
                    System.out.println("Due to Violation of rules You lost Your Turn ");
                }
                break;
            case 4:
                if (arr[2][0] == ' ') {
                    arr[2][0] = c;
                }
                else {
                    System.out.println("Due to Violation of rules You lost Your Turn ");
                }
                break;
            case 5:
                if (arr[2][2] == ' ') {
                    arr[2][2] = c;
                }
                else {
                    System.out.println("Due to Violation of rules You lost Your Turn ");
                }
                break;
            case 6:
                if (arr[2][4] == ' ') {
                    arr[2][4] = c;
                }
                else {
                    System.out.println("Due to Violation of rules You lost Your Turn ");
                }
                break;
            case 7:
                if (arr[4][0] == ' ') {
                    arr[4][0] = c;
                }
                else {
                    System.out.println("Due to Violation of rules You lost Your Turn ");
                }
                break;
            case 8:
                if (arr[4][2] == ' ') {
                    arr[4][2] = c;
                }
                else {
                    System.out.println("Due to Violation of rules You lost Your Turn ");
                }
                break;
            case 9:
                if (arr[4][4] == ' ')
                arr[4][4] = c;

                else {
                System.out.println("Due to Violation of rules You lost Your Turn ");
            }
                break;
        }
    }

    private static boolean checkWin(char[][] gameBoard,char winner){
        if (gameBoard[0][0] == gameBoard[0][2] && gameBoard[0][2] == gameBoard[0][4] && (gameBoard[0][4] == 'x' || gameBoard[0][4] == 'y')){
            if (gameBoard[0][0] == 'x'){
                winner = 'x';
            }
            else {
                winner = 'y';
            }
            System.out.println(winner + " won the Game");
            return true;
        }
        else if(gameBoard[2][0] == gameBoard[2][2] && gameBoard[2][2] == gameBoard[2][4]&& (gameBoard[2][4] == 'x' || gameBoard[2][4] == 'y')){
            if (gameBoard[2][0] == 'x'){
                winner = 'x';
            }
            else {
                winner = 'y';
            }
            System.out.println(winner + " won the Game");
            return true;
        }
        else if(gameBoard[4][0] == gameBoard[4][2] && gameBoard[4][2] == gameBoard[4][4]&& (gameBoard[4][4] == 'x' || gameBoard[4][4] == 'y')){
            if (gameBoard[4][0] == 'x'){
                winner = 'x';
            }
            else {
                winner = 'y';
            }
            System.out.println(winner + " won the Game");
            return true;
        }
        else if(gameBoard[0][0] == gameBoard[2][0] && gameBoard[2][0] == gameBoard[4][0]&& (gameBoard[0][0] == 'x' || gameBoard[0][0] == 'y')){
            if (gameBoard[0][0] == 'x'){
                winner = 'x';
            }
            else {
                winner = 'y';
            }
            System.out.println(winner + " won the Game");
            return true;
        }
        else if(gameBoard[0][2] == gameBoard[2][2] && gameBoard[2][2] == gameBoard[4][2]&& (gameBoard[0][2] == 'x' || gameBoard[0][2] == 'y')){
            if (gameBoard[0][2] == 'x'){
                winner = 'x';
            }
            else {
                winner = 'y';
            }
            System.out.println(winner + " won the Game");
            return true;
        }
        else if(gameBoard[0][4] == gameBoard[2][4] && gameBoard[2][4] == gameBoard[4][4]&& (gameBoard[0][4] == 'x' || gameBoard[0][4] == 'y')){
            if (gameBoard[0][4] == 'x'){
                winner = 'x';
            }
            else {
                winner = 'y';
            }
            System.out.println(winner + " won the Game");
            return true;
        }
        else if(gameBoard[0][0] == gameBoard[2][2] && gameBoard[2][2] == gameBoard[4][4]&& (gameBoard[4][4] == 'x' || gameBoard[4][4] == 'y')){
            if (gameBoard[0][0] == 'x'){
                winner = 'x';
            }
            else {
                winner = 'y';
            }
            System.out.println(winner + " won the Game");
            return true;
        }
        else if(gameBoard[4][0] == gameBoard[2][2] && gameBoard[2][2] == gameBoard[0][4]&& (gameBoard[0][4] == 'x' || gameBoard[0][4] == 'y')){
            if (gameBoard[4][0] == 'x'){
                winner = 'x';
            }
            else {
                winner = 'y';
            }
            System.out.println(winner + " won the Game");
            return true;
        }
        return false;
    }
}
