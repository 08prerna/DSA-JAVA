/*Mountain Array or Bitonic Array: 
 *              s     m       e
 *              0 1 2 3 4 5 6 7
	int[] arr= {1,2,3,5,7,6,3,2};
	output: 7(max element of array)
	
	 7(peak)
	5 6
   3   3
  2     2
 1
*/ 


package binary_search;

public class peakIndexofMountainarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,5,7,50,6,3,2};
		int ans=MountainArray(arr);
		System.out.println(ans);
	}

	public static int MountainArray(int[] arr) {
		// TODO Auto-generated method stub
		int s=0;
		int e=arr.length-1;
		
		while(s<e) {
			int m=s+(e-s)/2;
			
			if(arr[m]>arr[m+1]) {
				e=m;
			}
			else {
				s=m+1;
			}
		}
		return arr[s]; // arr[s] or arr[e]
	}

}
