public class Reverse_string {
public static void main (String[] args)
{
    //LOGIC 1: using string concatination operator 

    String str= "ABCD";
    String rev="";  //declaring null variable for the moment
    int len=str.length();

    for(int i=len-1;i>=0;i--)
    {
        rev= rev + str.charAt(i);

    }

    System.out.println(" Reversed string using concatination is: "+ rev);

    //LOGIC 2: Using character array
    String str2 = "EFGH";
    String revr="";
    char a[]=str2.toCharArray(); //tocharArray method converts string into array objects and stors the objects into a[] array
    int len2= a.length;
    for(int i=len-1;i>=0;i--)
    {
        revr=revr + a[i];

    }
    System.out.println(" Reversed string using character array is : " + revr);


    //LOGIC 3: Using STringBuffer class
     StringBuffer sbr =new StringBuffer(str);
     StringBuffer reverSbfr= sbr.reverse();
     System.out.println(" Reversed string using StringBuffer is : " + reverSbfr);
     
}
}
