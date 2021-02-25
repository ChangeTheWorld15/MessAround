/**
 * Magic 8 ball game that tells the user the answers to yes or no questions.
 *
 * @version:1.0
 * @author: Bryan Henriquez
 */

package tictactoe;
import java.util.*;


public class magic {

    public static void main(String []args) throws InterruptedException {
        Scanner sc = new Scanner((System.in));
        Random random = new Random();
        System.out.println("Booting up Magic 8 Ball Prediction game.........");

        int c = 0;

        while( c == 0) {
            System.out.println("   __-----__");
            System.out.println(" /     _     \\");
            System.out.println("|     |8|     |");
            System.out.println(" \\     -     /");
            System.out.println("   --_____--");
            System.out.println("Please type a question? ");
            int a = random.nextInt(17);
            String g = sc.nextLine();

                if (g.contains("end")){
                    c = 1;
                }if (g.contains("?")){

                }

            System.out.println("Shake..Shake..Shake");
            Thread.sleep(2000);
            switch (a) {
                case 1:
                    System.out.println  (("As I see it, yes."));
                    break;

                case 2:
                    System.out.println(("Ask again later."));
                    break;

                case 3:
                    System.out.println(("Cannot predict now"));
                    break;

                case 4:
                    System.out.println(("Don’t count on it."));
                    break;

                case 5:
                    System.out.println(("It is certain."));
                    break;

                case 6:
                    System.out.println(("Most likely."));
                    break;

                case 7:
                    System.out.println("My reply is no.");
                    break;

                case 8:
                    System.out.println("My sources say no.");
                    break;

                case 9:
                    System.out.println("Outlook not so good.");

                case 10:
                    System.out.println("Outlook good.");
                    break;

                case 11:
                    System.out.println("Reply hazy, try again.");
                    break;

                case 12:
                    System.out.println("Signs point to yes.");
                    break;

                case 13:
                    System.out.println("Very doubtful.");
                    break;

                case 14:
                    System.out.println("Without a doubt.");
                    break;

                case 15:
                    System.out.println("Yes.");
                    break;
                case 16:
                    System.out.println("Yes – definitely.");
                    break;
                case 17:
                    System.out.println("You may rely on it.");
                    break;
            }


        }

    }
}


