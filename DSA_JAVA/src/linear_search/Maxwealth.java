// arr={ {1, 2, 3}, {2, 3, 1} }
// output: 6
// (1+2+3) = 6 and (2+3+1) = 6 (max = 6)


package linear_search;

public class Maxwealth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[][] arr={ {1,2,3}, {2,3,1} };
	        int max=MaxSum(arr);
	        System.out.println(max);
	}

	public static int MaxSum(int[][] arr) {
        int maxsum=0;
        for(int r=0;r<arr.length;r++){
            int rowsum=0;
            for(int c=0;c<arr[r].length;c++){
                rowsum=rowsum+arr[r][c];
            }
            if(rowsum>maxsum){
                maxsum=rowsum;
            }
        }
        return maxsum;
    }
}
