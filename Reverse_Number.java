
import java.io.StringBufferInputStream;
import java.util.Scanner;
public class Reverse_Number {
public static void main(String[] args) {
   //LOGIC 1: using Modulus and Devision operator
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter a number : ");
    int num= sc.nextInt();
    int rev=0;
    while(num!=0)
    {
        rev=rev*10 + num%10; //%10 give last digit of the number.     0*10=0 + 1234%10=4  0+4=4 | 4*10=40 + 123%10=3 40+3=43  |43*10=430  12%10=2  230+2=432 | 432 *10=4320 + 1%10=1  4320+ 1=4321
        num=num/10;  //   /10 removes last digit of the number.     1234/10=123   | 123/10=12  | 12/10=1  | 1/10=01
    }
    System.out.println("Reversed number using modulus and division is : "+ rev);

    //LOGIC 2: Using string Buffer

    Scanner sc2 = new Scanner(System.in);
    System.out.println("please enter another number: ");
    int num2= sc2.nextInt();
    StringBuffer sb= new StringBuffer(String.valueOf(num2));
    StringBuffer revr= sb.reverse();  //stringbuffer class has reverse() method
    System.out.println( "reversed number using stringBuffer is : " + revr);

    //LOGIC 3: Using StringBuilder
    Scanner sc3=new Scanner(System.in);
    System.out.println("Please enter a number again: ");
    int num3= sc3.nextInt();
    StringBuilder sbl= new StringBuilder();
    sbl.append(num3); // adding num3 variable value into sbl variable
    StringBuilder revv= sbl.reverse();

    System.out.println(" Reversed number using StringBuilder is : "+ revv);




}
}
