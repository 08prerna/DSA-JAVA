//Infinite Array(beacuse in infinite array we can not use length of array for finding target)

package binary_search;

public class InfiniteArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,3,5,6,7,8,10,11,12,13,14,15,20,23,30};
		int target=15;
		
		int ans=infiniteArray(arr,target);
		System.out.println(ans);
	}

	public static int infiniteArray(int[] arr, int target) {
		// TODO Auto-generated method stub
		int s=0;
		int e=1;
		
		while(target>arr[e]) {
			int newStart=e+1;
			e=e+(e-s+1)*2; //we are doubling the end index
			s=newStart;
		}
		return search(arr,target,s,e);
	}

	public static int search(int[] arr, int target, int s, int e) {
		// TODO Auto-generated method stub
		while(s<=e) {
			int m=s+(e-s)/2;
			
			if(target<arr[m]) {
				e=m-1;
			}
			else if(target>arr[m]) {
				s=m+1;
			}
			else {
				return m;
			}
		}
		return -1;
	}

}
