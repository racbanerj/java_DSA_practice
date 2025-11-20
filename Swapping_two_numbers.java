public class Swapping_two_numbers {
    public static void main(String[] args) {
        
        //we will use multiple ways to perform this

        int a=10,b=20;
        System.out.println("Current: Before swapping value of a is:"+ a + "  and b is : "+ b);
         //LOGIC 1: THIRD Variable

         /*int t=a; //taking 3rd variable
         a=b;
         b=t;
        System.out.println("LOGIC 1: After swapping value of a is:"+ a + "  and b is : "+ b);


        //LOGIC 2: using + and - operator
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("LOGIC 2: After swapping value of a is:"+ a + "  and b is : "+ b);


        //LOGIC 3: using * and / division operator and value of a and b should not be zero
        a=a*b;
        b=a/b;
        a=a/b;
        System.out.println("LOGIC 3: After swapping value of a is:"+ a + "  and b is : "+ b);*/

        //LOGIC 4: 
        b=a+b-(a=b);
        System.out.println("LOGIC 4: After swapping value of a is:"+ a + "  and b is : "+ b);

    }

}
