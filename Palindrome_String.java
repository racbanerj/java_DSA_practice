public class Palindrome_String {
    public static void main (String[] args)
    {
        //LOGIC: reverse the string an dcompare if the reversed string is as same as the original string . if yes- the its a palindrome string



        String str= "MADAM";
        String original_str= str;
        String rev="";
        int len= str.length();
        for(int i=len-1;i>=0;i--)
        {
            rev=rev + str.charAt(i);
        }
        if (original_str.equals(rev))
        {
            System.out.println(original_str+ " is a palindrome string");
        }
        else {
            System.out.println(original_str+ " is not a palindrome string");
        }
    }
    
}
