/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
        while(t>0)
        {
		float x = sc.nextFloat();
		float y = sc.nextFloat();
		float z = sc.nextFloat();
		float w = sc.nextFloat();
		float time = (100) / (x*y*z*w);
		double roundOff = Math.round(time * 100.0) / 100.0;
		double k =9.58;
		if((float)roundOff < (float)k){
		    System.out.println("YES");    
		}
		else{
		    System.out.println("NO");
		}
		t--;
        }
	}
}
