/* Mountain Array:
                s     m       e
                0 1 2 3 4 5 6 7
	int[] arr= {1,2,3,5,7,6,3,2};
	target= 3
	output: 2(index of target)
	
	 7(peak)
	5 6
   3   3
  2     2
 1
	
*/

package binary_search;

public class SearchinMountainarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,5,7,6,3,2,1};
		int target= 3;
		
		int index=search(arr,target);
		System.out.println(index);

	}

	public static int search(int[] arr, int target) {
		// TODO Auto-generated method stub
		int peak=MountainArray(arr);
		int firstTry=AscendingandDescending(arr,target,0,peak);
		
		if(firstTry!=-1) {
			return firstTry;
		}
		return AscendingandDescending(arr,target,peak+1,arr.length-1);
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
	
	public static int AscendingandDescending(int[] arr, int target, int s, int e) {
		// TODO Auto-generated method stub
		boolean isAscen=arr[0]<arr[e];
		
		while(s<=e) {
			int m=s+(e-s)/2;
			
			if(target==arr[m]) {
				return m;
			}
			if(isAscen) {
				if(target>arr[m]) {
					s=m+1;
				}
				else {
					e=m-1;
				}
			}
			else {
				if(target>arr[m]) {
					e=m-1;
				}
				else {
					s=m+1;
				}
			}
		}
		return -1;
	}

}
