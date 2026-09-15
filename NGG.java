import java.util.Random;
import java.util.Scanner;
public class NGG{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int target = rd.nextInt(100) + 1;
        int attempts = 0;
        while(true){
            attempts++;
            System.out.print("Enter a number between 1 and 100: ");
            int guess = sc.nextInt();
            if(guess == target){
                System.out.println("Congratulations! You've guessed the number " + target + " in " + attempts + " attempts.");
                break;
            }
            if(guess < target){
                System.out.println("your target is bigger");
            } else if(guess > target){
                System.out.println("your target is smaller ");
            } else {
                System.out.println("Congratulations! You've guessed the number " + target + " in " + attempts + " attempts.");
                break;
            }
        }
    }
}
