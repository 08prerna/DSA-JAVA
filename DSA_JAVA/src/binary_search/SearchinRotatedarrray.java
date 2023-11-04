//Search in Rotated array
//int[] arr= {4,5,6,7,0,1,2};
//target=
//output=
package binary_search;

public class SearchinRotatedarrray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {4,5,6,7,0,1,2};
		System.out.println(findPivot(arr));
		int target=;
	}
	
	static int Search(int[]arr,int target) {
		int pivot=findPivot(arr);
		
		//if pivot not found means array is sorted then do binary search
		if(pivot==-1) {
			return BinarySearch(arr,target,0,arr.length-1);
		}
		
		//if pivot is found means you found two ascending sorted array
		if(arr[pivot]==target) {
			return pivot;
		}
	}
	
	public static int BinarySearch(int[] arr,int target,int s,int e) {

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
	
	static int findPivot(int[]arr) {
		int s=0;
		int e=arr.length-1;
		while(s<=e) {
			int m=s+(e-s)/2;
			
			//four cases here
			if(m<e && arr[m]>arr[m+1]) {
				return m;
			}
			if(m>s && arr[m]<arr[m-1]) {
				return m-1;
			}
			if(arr[m]<=arr[s]) {
				 e=m-1;
			 }
			else {
				 s=m+1;
			 }
		}
		return -1;
	}

}
