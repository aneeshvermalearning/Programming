import java.util.*;

/*
5) Find the largest power of 2 (most significant bit in binary form),
 which is less than or equal to the given number N.

 e.g 15 = 1111.. so largest power of 2 is 8..8+4+2+1..2^3=8

 Way1..for(i=>32)..& with 1..shift 1..place a count where 1 occurs..

 Way2.
 If we somehow, change all the bits which are at right side of the most significant bit of N to 1,
  then the number will become x + (x-1) 
  e.g number is 21 {10101}..most significant bit(in decimal) is 16.
  	  and if we make all bits right of msb 1..it becomes 2^4 -1 = 15..
  	  16+15= 31...31 = Y
  	  To get MSB do (Y+1)/2

 Now the question arises here is how can we change all right side bits of most significant bit to 1?

	N = N | (N>>1).
					0001001
				   |0000100
				   =0001100	
	N = N | (N>>2).
					0001100
				   |0000011
				   =0001111
	// when N is odd stop

*/


public class LargestPowerTwo{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int N = n;
		int i = 1;

		do{
			System.out.println(i);	
			n = n|(n>>i);
			i = i*2;
			System.out.println(n);	
		}while(some condition);

		System.out.print(n);
	}
}