import java.util.*;

public class PowerTwoCheck{

// Given number is a power of 2	
/*
	Normal way: complexity log n		
*/
	public static boolean checkPowerTwo(int x){
		if(x == 0){
			return false;
		}
		else{
			while(x%2 == 0){
				x = x/2;
			}
			return(x == 1);
			// or if x == 1 return true else false..eg 20..keep on dividing will eventually become 5
			// 5%2 !=0... and 5!=1 so return false
			// e.g 16.... 16,8,4,2,1..so x == 1..so return true.
		}
	}
/*
	in complexity O(1)
	using bitwise..

	The number will be a power of 2 only if one bit(except 0th) is set..and not more than one is set
	e.g 128 64 32 16 8 4 2...only if one bit is set then power of 2...because addition of two
	 						different powers of 2 will result in not a power of 2.
	 						128+2 = 130 != power of 2
	So, to make sure only 1 bit is set..we do x&(x-1)
	e.g take 6...   110...so if we subtract one and if number was power of 2..
				    like 4 or 8.. 1000..subtracting one would make it 0111..
										1000
									   &0111
									   =0000
					if any other number like 6 from earlier means 110..sub 1=>101
										110
									   &101
									   =100 .. not zero...hence 1 exists multiple times in bits
									   		   because..after subtracting 1 should shift to right.

	

*/


	public static boolean checkPowerTwoBitwise(int x){
		int tmp = (x&(x-1));
		System.out.println(x);
		return ((x!=0)&&(tmp==0));

		//return (x && !tmp); // true && !(false)
								 // 0 & -1... 000..0000 & 111..1111 = 0...
									//i.e !(false) = true but x == false(0)..so false
									// Hence zero handled
	}



	public static void main(String[] args) {
		System.out.println(checkPowerTwo(20));
		System.out.println(checkPowerTwo(16));

		System.out.println(checkPowerTwoBitwise(0));
		System.out.println(checkPowerTwoBitwise(16));
		System.out.println(checkPowerTwoBitwise(-2)); // cause -2 is not a power of 2

	}

}