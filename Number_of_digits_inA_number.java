public class Number_of_digits_inA_number {
    public static void main (String[] args)
    {
        //LOGIC: elemeinate each digit from number and increase count value till number is zero
        int num=675765554;
        
        int count=0;
        while(num!=0)
        {
            num=num/10;
            count++;
        }
        System.out.println("number of digits in number is "+count);
    }
    
}
