// arr=[11, 2, 5, 9, 16, 12]
// target=9
// output: 9

package linear_search;

public class LinearSearch {
	public static void main(String[] args) {
		int[] arr={11,2,5,9,16,12};
        int target=9;

        int index=Linear(arr,target);
        System.out.println(index);
	}

	public static int Linear(int[] arr, int target) {
		// TODO Auto-generated method stub
		if(arr.length==0){
            return -1;
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
	}
}
