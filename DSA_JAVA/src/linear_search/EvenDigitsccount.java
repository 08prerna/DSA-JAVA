// arr={12, 345, 5, 6, 1234, 12}
// output: 2 (12,1234,12 = 3)

package linear_search;

public class EvenDigitsccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={12,345,5,6,1234,12};
        int count=DigitSum(arr);

        System.out.println(count);
	}
	
	public static int DigitSum(int[] arr) {
        int cnt=0;
        for(int array:arr){
            if(EvenNum(array)){
                cnt++;
            }
        }
        return cnt;
    }

    public static boolean EvenNum(int array) {
        int digit=Digits(array);
        if(digit%2==0){
            return true;
        }
        return false;
    }

    public static int Digits(int array) {
        int cnt=0;
        while (array>0) {
            cnt++;
            array=array/10;
        }
        return cnt;
    }

}
