
public class Q3 {

	public static void main(String[] args) {
	int []b = {2,3,15,15,3,2};
	boolean read = true;
	int j =b.length -1;
	for(int i=0;i<b.length/2;i++){
		if (b[i]!=b[j]){
			read = false ;
			break;
		}
		else
			j--;
	}
     System.out.println(read);
	}

}


