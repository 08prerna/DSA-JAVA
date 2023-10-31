//ceiling: smallest element in array greater or equal to target
//
//arr=[2,3,4,6,9,14,16,18]
//target=15
//output=16
//
//ceiling(15)=16
//celing(14)=14
//celing(10)=14

package binary_search;

public class CelingofNumber {
	public static void main(String[] args) {
//		int[] arr= {2,3,5,9,14,16,18};
//		int target=15;
		
		int[] arr= {6,8,10,12,19,21};
		int target=18;
		
		int element=Ceiling(arr,target);
		System.out.println(element);
	}

	public static int Ceiling(int[] arr, int target) {
		// TODO Auto-generated method stub
		int s=0;
		int e=arr.length-1;
		
		if(target>arr[e]) {
			return -1;
		}
		
		while(s<=e) {
			 int m=s+(e-s)/2;
			
			if(target<arr[m]) {
				e=m-1;
			}
			else if(target>arr[m]) {
				s=m+1;
			}
			else {
				return arr[m];
			}
		}
		return arr[s];
	}
}
