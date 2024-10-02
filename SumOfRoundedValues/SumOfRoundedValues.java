import java.util.Scanner;

public class SumOfRoundedValues {
    public static void main(String[] args) {
        //take input from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int first = sc.nextInt();
        System.out.print("Enter second number: ");
        int second = sc.nextInt();
        System.out.print("Enter third number: ");
        int third = sc.nextInt();

        //print the result
        System.out.println("Ths sum: " +roundSum(first,second,third));
    }
    public static Integer roundSum(int a, int b, int c) {
        return round10(a)+round10(b)+round10(c);
    }

    public static Integer round10(Integer num) {
        //get the right most digit
        int rightMostDigit = num % 10;

        //check if the right most digit is bigger than 5
        //if yes, round to the next multiple of 10
        if(rightMostDigit >= 5){
            return num + (10-(num%10));
        }
        //else, round to the previous multiple of 10
        else{
            return num - (num%10);
        }
    }
}
