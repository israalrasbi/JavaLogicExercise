import java.util.Scanner;

public class ChocolatePackaging {
    public static void main(String[] args) {
        //take input from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of small bars: ");
        int smallBars = sc.nextInt();
        System.out.print("Enter the number of big bars: ");
        int bigBars = sc.nextInt();
        System.out.print("Enter the number goal weight: ");
        int goalWeight = sc.nextInt();

        //print result
        System.out.print("The number of small bars needed:  " +makeChocolate(smallBars, bigBars, goalWeight));
    }

    public static Integer makeChocolate(int smallBar, int bigBars, int goalWeight) {
        //if the combination of small and big bars are not enough to achieve the goal, return -1
        //the small is 1 kilo, and the big is 5 kilo
        if (smallBar + bigBars * 5 < goalWeight){
            return -1;
        }

        //calculate what will be the value if only big bars were used to achieve the goal
        int onlyBigBars = goalWeight/5;
        //calculate how many big bars can be used without exceeding the goal
        /* Example:
        weight: 9 kilos
        Available big bars: 2
        onlyBigBars = 9 / 5 = 1 (you can use at most 1 big bar based on the goal).
        bigBars = 2 (you have 2 big bars).
        Math.min(1, 2) returns 1 because you can only use 1 big bar for this goal without exceeding the goal weight.
         */
        int bigBarsUsed = Math.min(onlyBigBars, bigBars);

        //calculate the remaining weight after using the big bars
        int remainingWeight = goalWeight - bigBarsUsed * 5;

        //check if there are enough small bars to satisfy the remaining weight
        if (remainingWeight <= smallBar) {
            return remainingWeight; //return how many small bars are needed
        }
        //if there is no engoup small bars to achieve the goal, return -1
        else {
            return -1;
        }
    }

}
