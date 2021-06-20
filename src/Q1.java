import java .util.*;
  public class Q1 {
	  
	public static void main(String [] args){
		  
		@SuppressWarnings("resource")
		Scanner s = new Scanner (System .in);
		  int[] a =new int [10];
		  for(int i =0; i<a.length; i++){
		  System.out.println("Print the value of a ["+i+"]");
		  a[i] = s.nextInt();
		  
		  }
		  for (int i = 0;i<a.length;i++){
	    System.out.println("The value of a["+i+"] is " + a [i]);
		  }
		  
	  }
  }

