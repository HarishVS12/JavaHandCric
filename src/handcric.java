import java.util.Random;
import java.util.Scanner;

import static javafx.application.Platform.exit;

public class handcric {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String PName;
        int runsToChase;
        char PlayOrNot = 'Y';
        char YN;
        System.out.println("\n\n*************Welcome to the Java Cricket***************");
        while (PlayOrNot == 'Y' || PlayOrNot == 'y') {
            System.out.println("What is your name? : ");
            PName = sc.nextLine();
            System.out.println("Welcome "+ PName + ", Nice to have you on board.. SO ARE YOU READY? (Y/N)");
            YN = sc.next().charAt(0);
            if(YN=='Y' || YN=='y') {

                System.out.println("How many RUNS you wish to chase? : ");
                runsToChase = sc.nextInt();
                int random = 0, wickets = 0;
                int yourRuns = 0 , total =0;
                while(total<runsToChase) {

                    System.out.println("\n\nEnter the RUNS you need to score : ");
                    yourRuns = sc.nextInt();
                    if (yourRuns <= 6 && yourRuns >= 0) {
                        random = RandomNo();
                        System.out.println("Opponent enters : " + random + "\n");
                        if (yourRuns == random) {
                            System.out.println("You're OUT!");
                            wickets++;
                            if(wickets==10){
                                break;
                            }
                            System.out.println("-*-*-*-* Your Team total SCORE is : " + total + "/" + wickets + "-*-*-*-*-");
                        }else {
                            total = total + yourRuns;
                            System.out.println("-*-*-*-* Your Team total SCORE is : " + total + "/" + wickets + "-*-*-*-*-");
                        }
                    }
                    else{
                        System.out.println("*******Enter a Valid Input within 6 Runs!********");
                        System.out.println();
                        continue;
                    }

                }
                if(yourRuns!=random){
                    System.out.println("*******************\n\nYOU WOONNNNN!!******************\n\n");
                }
                else{
                    System.out.println("\n\nBetter Luck Next Time! \n\n");
                }

            }
            else if(YN=='N' || YN=='n'){
                System.out.println("Take Your time and come back.. BYE!");
                exit();
                break;
            }
            else{
                System.out.println("Wrong Input!! Try Again!!!");
            }

            System.out.println("Do You Need to Play Again? (Y/N) : ");
            PlayOrNot = sc.next().charAt(0);
            sc.nextLine();
            }


    }

    public static int RandomNo(){
        Random r = new Random();
        int j = r.nextInt(6)+1;
        return j;
    }
}
