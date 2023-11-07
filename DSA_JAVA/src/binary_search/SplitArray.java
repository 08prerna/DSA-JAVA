//Input: nums = [7,2,5,10,8], k = 2
//Output: 18
//Explanation: There are four ways to split nums into two subarrays.
//The best way is to split it into [7,2,5] and [10,8], where the largest sum among the two subarrays is only 18.

package binary_search;

public class SplitArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {7,2,5,10,8};
		int k=2;
		System.out.println(splitarray(nums,k));
	} 
	
                                                      // 0  1  2  3   4
	public static int splitarray(int[] nums, int k) { // 7, 2, 5, 10, 8  k=2
		// TODO Auto-generated method stub
		int s=0;
		int e=0;
		for(int i=0;i<nums.length;i++) {
			s=Math.max(s, nums[i]);   //// in the end of the loop this will contain the max item of the array
			e=e+nums[i];
		}
		//s=10, e=32
		
		while(s<e) {  //10<32 //13<32 //13<22 //13<17 //13<15 //13<14
			int m=s+(e-s)/2; //12  //22 //17 // 15 // 14 // 13
			
			int sum=0;      //0
			int pieces=1;   //1
			
			for(int num:nums) {
				if(sum + num > m) { // 14>12  15>12  18>12 | 24>22 | 24>14 18>14 | 14>13 15>13 18>13
					// you cannot add this in this subarray, make new one
                    // say you add this num in new subarray, then sum = num
					sum=num;  // sum=5 10 8 | sum=10 | sum=10 | sum=8 | sum=10 8 | sum=10 8 | sum=5 10 8
					pieces++;  // 2 3 4 | 1 | 1 2 | 1 2 | 1 2 | 1 2 3
				}
				else {
					sum=sum+num; //7 9 | 7 9 14 18 | 7 9 14  | 7 9 14 | 7 9 14 | 7 9 
				}
			}
			
			if(pieces>k) { // 4>2
				s=m+1;  // s=13
			}
			else {  
				e=m; // e=22 e=17 e=15 e=14
			}
		}
		return e; // here start == end
	}

}
