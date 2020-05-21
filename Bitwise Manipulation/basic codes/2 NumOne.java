import java.util.*;

public class NumOne{

// Count the number of ones in the binary representation of the given number.	

/*
WAY 1

With bitwise
	till 32 bits a loop...num & 1<<i.. if one count++..
	complexity 32 times run

WAY 2
	k times run..k = number of ones
	
	n&(n-1) as seen in PowerTwoCheck.java....if power of 2 then one 1 bit set...
	e.g 8 = 1000...8-1=7=0111....1000&0111 = 0000.. hence one step in count
	e.g 15 = 1111..14=1110....1111&1110 = 1110..replace n by 1110 now..and continue
				1110&1101...=1100..replace n by 1100(12) now..
				1100&1011...=1000..replace n by 1000(8) now..
				1000&0111...=0000...complete
*/

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int n = x;

		//WAY2
		int count = 0;
		for(int i = 0; i < 32; i++){			
			if((x&(1<<i))!= 0){ // i.e true means not equal to zero..means 1 present
				count++;
			}
		}
		System.out.println(count);
		count=0;
		
		//WAY3
		while(n!=0){
			n = n&(n-1);
			count++;
		}
		System.out.println(count);

	}
	
}