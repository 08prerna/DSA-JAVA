package binary_search;

public class AscendingandDescending {
	public static void main(String[] args) {
//		int[] arr= {2,4,6,9,11,12,14,20,36,48};
//		int target=36;
		int[] arr= {90,75,18,12,6,4,3,1};
		int target=75;
		int index=Search(arr,target);
		System.out.println(index);
	}

	public static int Search(int[] arr, int target) {
		// TODO Auto-generated method stub
		int s=0;
		int e=arr.length-1;
		
		boolean isAssend=arr[0]<arr[e];
		
		if(isAssend) {
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
			
		}
		else {
			while(s<=e) {
				 int m=s+(e-s)/2;
				
				if(target<arr[m]) {
					s=m+1;
				}
				else if(target>arr[m]) {
					e=m-1;
				}
				else {
					return m;
				}
			}
			
		}
		return -1;
		}
		
	}

