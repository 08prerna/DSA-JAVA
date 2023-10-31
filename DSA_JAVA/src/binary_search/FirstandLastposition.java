//we have to find 1st and last index position of target element from given array
//index:      0 1 2 3 4 5
//int[] arr= {5,7,7,8,8,9};
//int target=7;
//output: [1,2] (target=7 is in the rage 1-2)

package binary_search;

import java.util.Arrays;

public class FirstandLastposition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {7,7,7,8,8,9};
		int target=7;
		
		int[] ans=searchRange(arr,target);
		System.out.println(Arrays.toString(ans));
	}

	public static int[] searchRange(int[] arr, int target) {
		// TODO Auto-generated method stub
		int[] ans= {-1,-1};
		int start=search(arr,target,true);
		int end=search(arr,target,false);
		ans[0]=start;
		ans[1]=end;
		return ans;
	}

	public static int search(int[] arr, int target, boolean firstIndex) {
		int ans=-1;
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
				ans=m;
				if(firstIndex) {
					e=m-1;
				}
				else {
					s=m+1;
				}
			}
		}
		// TODO Auto-generated method stub
		return ans;
	}

}
