import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello, let's play Buzz!");



        Scanner myObj=new Scanner(System.in);
        System.out.println("Enter your name");
        String name=myObj.nextLine();

        Player player1;
        player1=new Player(name,0);
        System.out.println("Welcome"+" "+player1.getName()+"! Let's start the game! ");
        System.out.println();

        for (int i=0;i<7;i++){
            System.out.println("round "+ (i+1));
            System.out.println();
            Scanner c=new Scanner(System.in);

            String round="";
            do{
                System.out.println("Write C for a CorrectAnswer round or B for a Bet round");
                round = c.nextLine();
            }while(!(round.equals("B")||round.equals("C")));

        }

    }








}
