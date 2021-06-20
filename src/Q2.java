import java . util.*;
public class Q2 {

	public static void main(String[] args) {
	@SuppressWarnings("resource")
	Scanner s = new Scanner (System .in);
	int []a = new int [10];
	int [] b = new int [10];
	for (int i = 0; i< a .length ;i ++){
		System.out.println("Enter the value of a ["+i+"]");
		a[i] = s. nextInt();
	}
	  @SuppressWarnings("unused")
	int j =0;
	  for (int i = b.length - 1; i >=0; i--){
		b[i] = a [i];
		j++;
		
	}
	  for (int i = 0; i<b.length;i++){
	   System.out.println("The value of b["+i+"]is"+b[i]);
	  }
	}

}






