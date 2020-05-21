public class Tricks{
/*
1.
 	x ^ ( x & (x-1)) : Returns the rightmost 1 in binary..
	
	x & x-1 .. will have all the bits equal to the x except for the rightmost 1 in x
	// in cases of power of 2..eg.16.. 10000.. 15 is 01111...10000 & 01111 => 00000
	// in cases otherwise.. eg 15.. 1111..14 is 1110..1111 & 1110 => 1110..all bits equal to x except last
	So to get rightmost..x ^ (x&(x-1))..i.e get all the different bits
	in case of 15..			x =  1111
						x&x-1 = ^1110
								=0001
	Hence, last bit of x.

2. 
	x & (-x) : Returns the rightmost 1 in binary representation of x

	(-x) is the two’s complement of x. (-x) will be equal to one’s complement of x plus 1.
	Therefore (-x) will have all the bits flipped that are on the left of the rightmost 1 in x.
	 So x & (-x) will return rightmost 1.	

3. 
	x | (1 << n) : Returns the number x with the nth bit set.

(1 << n) will return a number with only nth bit set. So if we OR it with x it will set the nth bit of x.	 

*/


	public static void main(String[] args) {

		
	}
}