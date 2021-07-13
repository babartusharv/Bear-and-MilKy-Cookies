import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class BearAndMilkyCookies
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int n = sc.nextInt();
		    String[] arr = new String[n];
		    for(int i=0; i<n; i++){
		        arr[i] = sc.next();
		    }boolean v=true;
		    for(int i=0; i<n-1; i++){
		        if(arr[i].equals("cookie") && !(arr[i+1].equals("milk"))){
		           v=false;
		           break;
		        }
		    }
		    if(arr[n-1].equals("cookie")){
		        v=false;
		    }
		    if(v)
		       {
		           System.out.println("YES");
		       }
		       else if(!v){
		           System.out.println("NO");
		       }
		}
	}
}
