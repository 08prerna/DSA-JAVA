//ceiling: greatest element in array which is smaller or equal to target
//
//arr=[2,3,4,6,9,14,16,18]
//target=15
//output=14
//
//floor(15)=14
//floor(14)=14
//floor(10)=9

package binary_search;

public class FloorofNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,3,5,9,14,16,18};
		int target=15;
		
//		int[] arr= {6,8,10,12,19,21};
//		int target=18;
		
		int element=Floor(arr,target);
		System.out.println(element);

	}
	
	public static int Floor(int[] arr, int target) {
		// TODO Auto-generated method stub
		int s=0;
		int e=arr.length-1;
		
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
		return arr[e];
	}

}
