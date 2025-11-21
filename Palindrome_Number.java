import java.util.Scanner;

public class Palindrome_Number {
    public static void main(String[] args) {
        

        /*LOGIC: first reverse the number and compare it with the original number. if the reversed number 
        is as same as the original then its a palindrome */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr your number: ");
         int num=sc.nextInt();
         int original_num=num;

         int rev=0;
         while (num !=0)
         {
            rev=rev*10 + num%10;
            num=num/10;
         }
         if(original_num==rev)
         {
            System.out.println( "its a Palindrome");
         }
         else{
            System.out.println("not a palindrome");
         }

    }
    
}
