import java.util.Scanner;

public class SumWithTeenRule {
    public static void main(String[] args) {
        //take input from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int first = sc.nextInt();
        System.out.print("Enter second number: ");
        int second = sc.nextInt();
        System.out.print("Enter third number: ");
        int third = sc.nextInt();
        System.out.println("Ths sum: " +noTeenSum( first,second,third));

    }
    public static int fixTeen(int n) {
        //check that the number is between the range 13 nd 19
       if (n>=13 && n<=19) {
           //if the number is 15 or 16 then keep it as it is
           if(n==15 || n==16){
               return n;
           }
           //otherwise change the number to 0
           else{
               n=0;
           }
       }
       //return the number
       return n;
    }

    public static int noTeenSum(int a, int b, int c) {
        return fixTeen(a)+fixTeen(b)+fixTeen(c);
    }

}
