import java.util.*;

// How to generate all the possible subsets of a set ?
/*
	2^N possible subsets of any given set with N elements

	1 element=> that element and empty set....2^1 = 2
	2 element=> {},{1st},{2nd},{1st and 2nd}..2^2 = 4

	Consider a set A of 3 elements.
	A = {a, b, c}


  *******Most imp********
  Treat {a,b,c} as
  c => 2^0 = 1
  b => 2^1 = 2
  c => 2^2 = 4
  *******************

	Now, we need 3 bits, one bit for each element.
	1 represent that the corresponding element is present in the subset,
	whereas 0 represent the corresponding element is not in the subset. 

	0 = (000)2 = {}
	1 = (001)2 = {c}
	2 = (010)2 = {b}
	3 = (011)2 = {b, c}
	4 = (100)2 = {a}
	5 = (101)2 = {a, c}
	6 = (110)2 = {a, b}
	7 = (111)2 = {a, b, c}

	possibleSubsets(A, N):
        for i = 0 to 2^N:
            for j = 0 to N:
                if jth bit is set in i:
                    print A[j]
            print ‘\n’
	
	1<<N = number of subsets.. eg..1<<3 = 0001<<3 = 1000 = 8

	We take 2 things..
	1. total number of subsets that can be generated.2^N
	2. No.of bits..with which we can generate 2^N


FOR n=3 ({a,b,c})
	for(int i = 0;i < 2^N; ++i)
        {
        	for(int j = 0; j < N;++j)
                if(i & (1 << j))
                    cout << A[j] << ‘ ‘;
            cout << endl;
    	}

   take i = 0
   		for (j = 0; j < 3; ++j) 

   		j = 0
   		if(0 & (1 <<0)){ // 0000&0001 = 0000
			//cout<< A[0] // i.e c // doesnt happen cause does not go in if
   		}

   		j = 1
   		if(0 & (1 <<1)){ // 0000&0010 = 0001
			//cout<< A[1] // i.e b // doesnt happen cause does not go in if
   		}
		
		j = 2
   		if(0 & (1 <<2)){ // 0000&0100 = 0001
			//cout<< A[2] // i.e a // doesnt happen cause does not go in if
   		}	
   		
   take i = 1
   		for (j = 0; j < 3; ++j) 

   		j = 0
   		if(1 & (1 <<0)){ // 0001&0001 = 0001
			cout<< A[0] // i.e c 
   		}

   		j = 1
   		if(1 & (1 <<1)){ // 0001&0010 = 0000
			//cout<< A[1] // i.e b // doesnt happen cause does not go in if
   		}

   		j = 2
   		if(1 & (1 <<2)){ // 0001&0100 = 0000
			//cout<< A[2] // i.e a // doesnt happen cause does not go in if
   		}

  take i = 2
   		for (j = 0; j < 3; ++j) 

   		j = 0
   		if(2 & (1 <<0)){ // 0010&0001 = 0001
			cout<< A[0] // i.e c // doesnt happen cause does not go in if
   		}

   		j = 1
   		if(2 & (1 <<1)){ // 0010&0010 = 0010
			cout<< A[1] // i.e b 
   		}

   		j = 2
   		if(2 & (1 <<2)){ // 0010&0100 = 0000
			//cout<< A[2] // i.e a // doesnt happen cause does not go in if
   		} 	


  take i = 3
   		for (j = 0; j < 3; ++j) 

   		j = 0
   		if(3 & (1 <<0)){ // 0011&0001 = 0001
			cout<< A[0] // i.e c 
   		}

   		j = 1
   		if(3 & (1 <<1)){ // 0011&0010 = 0000
			cout<< A[1] // i.e b 
   		}

   		j = 2
   		if(3 & (1 <<2)){ // 0011&0100 = 0100
			//cout<< A[2] // i.e a // doesnt happen cause does not go in if
   		} 	
   		// hence {c,b}


	take i = 4
   		for (j = 0; j < 3; ++j) 

   		j = 0
   		if(4 & (1 <<0)){ // 0100&0001 = 0001
			cout<< A[0] // i.e c // doesnt happen cause does not go in if
   		}

   		j = 1
   		if(4 & (1 <<1)){ // 0100&0010 = 0000
			cout<< A[1] // i.e b // doesnt happen cause does not go in if
   		}

   		j = 2
   		if(4 & (1 <<2)){ // 0100&0100 = 0100
			cout<< A[2] // i.e a 
   		}	

**Its just we are printing individual bits of 0 to 7..
for(int i = 0;i < 2^N; ++i)
        {
        	for(int j = 0; j < N;++j) // 4,2,1 only 3 can be...what combination now it depends
                //if(i & (1 << j))		// on the number

*/
/*
[abc] => abc are the bits...421..
all combinations with this..
0->7... 1,2,4,12,124,14....all
*/


public class AllSubsets{
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();


		for(int i = 0 ; i < (1<<n); i++ ){
			for (int j = 0; j < n ; j++ ) {
				
			}
		}
	}

	/* // LEETCODE SOLUTION
	class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        
        int N = nums.length;
        int all_comb = 1<<N; // 2^N... shift 1 by N so that gets to Nth bit
        List<List<Integer>>powerSet = new ArrayList<>();
        
        for(int i = 0; i < all_comb; i++){ // iterate through all to print/store all
            List<Integer>tempSet = new ArrayList<Integer>();
            for(int j = 0; j< N; j++){ // we (& i )with 1 and shift one to get which         
                
                 if((i & (1<<j))!=0){ //1<<j..0 means bit not present
                    //System.out.print(nums[j]);      // We get and check each bits
                                            // eg N=3..so checks 1st bit 2nd bit 3rd bit    
                    tempSet.add(nums[j]);
                }                                           
            }                                                                                   
            System.out.println(tempSet);
        powerSet.add(tempSet);
        }
        
        return powerSet;                
    }
}

	*/

/*
[123] all subsets... all subsets.. 2^N..
assume 123 as binary bits with powers 421 (1=>4,2=>2,3=>1)
Using these bits all numbers=> 8(0-7);
Each number what bits present..see

*/
}