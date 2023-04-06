import java.util.*;

public class Numberguess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("You have  5 chance to guess the number number should be between 1 to 100");
        int k = 5;
        Random randomNum = new Random();
        int ram = randomNum. nextInt(100);
        while(k != 0){
            int num  = sc.nextInt();
            if(num == ram){

                System.out.println("Congress ! you guess the correct number");
            }
           if(num > ram){
               System.out.println("Number you have choose is greater than real number");
               k--;
           }
           else if(num < ram) {
               System.out.println("Number you have choose is smaller than real number");
               k--;
           }
        }
        System.out.print("You lost your chance the number is" + ram);
    }
}
