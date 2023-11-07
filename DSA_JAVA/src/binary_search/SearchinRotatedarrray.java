//           Search in Rotated array
//           int[] arr= {4,5,6,7,0,1,2};
//           target=0
//           output=4(Index)


package binary_search;

public class SearchinRotatedarrray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] arr= {4,5,6,7,0,1,2};
//		System.out.println(findPivot(arr));//3(7)
//		int target=0;
//		System.out.println(Search(arr,target));//4(0)
		
//		 int[] arr = {1,2,3,4,5,5,6};
		 int[] arr= {5,6,1,2,3,4,5};
	     System.out.println(findPivotWithDuplicates(arr));
	}
	

	static int Search(int[]arr,int target) {
		int pivot=findPivot(arr); //3
		
		//if pivot not found means array is sorted then do binary search
		if(pivot==-1) {
			return BinarySearch(arr,target,0,arr.length-1);
		}
		
		//if pivot is found means you found two ascending sorted array
		if(arr[pivot]==target) {
			return pivot;
		}
		
		if(target>=arr[0]) {
			return BinarySearch(arr,target,0,pivot-1);
		}
		
		return BinarySearch(arr,target,pivot+1,arr.length-1); //binarysearch(arr,(0),4,6)
	}
	
	public static int BinarySearch(int[] arr,int target,int s,int e) {//(arr,0,4,6)

		while(s<=e) { //(4<=6) (4<=4)
			 int m=s+(e-s)/2; //5 4
			
			if(target<arr[m]) { //(0)<1 
				e=m-1;          //e=4
			}
			else if(target>arr[m]) {
				s=m+1;
			}
			else {
				return m; //4
			}
		}
		return -1;
	}
	                               // 0  1  2  3  4  5  6
	public static int findPivot(int[]arr) { // 4, 5, 6, 7, 0, 1, 2
		int s=0;				   // 0 
		int e=arr.length-1;		   // 6
		while(s<=e) {			  // (0<=6)
			int m=s+(e-s)/2;	  // 3(7)
			
			//four cases here
			if(m<e && arr[m]>arr[m+1]) { //3<7 && (7)>(0)
				return m;        // 3
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


	public static int findPivotWithDuplicates(int[] arr) {
	// TODO Auto-generated method stub
		 int s = 0;
	        int e = arr.length - 1;
	        while (s <= e) {
	            int m = s + (e - s) / 2;
	            // 4 cases over here
	            if (m < e && arr[m] > arr[m + 1]) {
	                return m;
	            }
	            if (m > s && arr[m] < arr[m - 1]) {
	                return m-1;
	            }

	            // if elements at middle, start, end are equal then just skip the duplicates
	            if (arr[m] == arr[s] && arr[m] == arr[e]) {
	                // skip the duplicates
	                // NOTE: what if these elements at start and end were the pivot??
	                // check if start is pivot
	                if (s < e && arr[s] > arr[s + 1]) {
	                    return s;
	                }
	                s++;

	                // check whether end is pivot
	                if (e > s && arr[e] < arr[e - 1]) {
	                    return e - 1;
	                }
	                e--;
	            }
	            // left side is sorted, so pivot should be in right
	            else if(arr[s] < arr[m] || (arr[s] == arr[m] && arr[m] > arr[e])) {
	                s = m + 1;
	            } else {
	                e = m - 1;
	            }
	        }
	        return -1;
	
}

}
