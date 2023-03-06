
package com.Practice;
import java.util.Scanner;
import java.util.Random;
public class GuessGame {
    public static void main(String[] args) {
        Random rand = new Random();
        int go = rand.nextInt(100);
        System.out.println(go);
        Scanner input = new Scanner(System.in);
        System.out.println("Please guess the number between 0 to 100.");
        int guess = input.nextInt();
            int nguesses=1;
        for(int i = 1; go!=guess; i++){
            if(go>guess){
                System.out.println("Higher number please");
            }
            else if(guess>go){
                System.out.println("Lower number please");
            }
            else if (guess==go) {
                System.out.println("Yes you guess the number");
            }
            guess = input.nextInt();
            nguesses++;
        }
        System.out.println("You get the number in "+nguesses+" attempts");
    }
}
