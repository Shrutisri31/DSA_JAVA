import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        int digit = n;
		int rem = 0 , sumEven = 0, sumOdd = 0;
		while(digit > 0){
          rem = digit % 10;
          if(rem % 2 == 0){
			  sumEven = sumEven + rem;
		  }
		  else{
			  sumOdd = sumOdd + rem;
		  }
		  digit = digit/10;
		}
       System.out.println(sumEven + " " + sumOdd);
	}
}
