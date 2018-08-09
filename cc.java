/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		 System.out.println("Please enter an integer : ");
    int integer = new Scanner(System.in).nextInt();

    if(isPalindrome(integer)){
        System.out.println(integer + " is a palindrome");
    }else{
        System.out.println(integer + " is not a palindrome");
    }       

}
	}
