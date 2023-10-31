//char[] ch= {'c','d','f','j'};
//char target='j';
//output: c (target is'j' which is more or equal to ch[ch.length-1](last element of array).
// therefore we have to return '0' element(ch[0]='c') from array.
// above problem if similar to ceiling of number

package binary_search;

public class Ceiling_String {
	public static void main(String[] args) {
		char[] ch= {'c','d','f','j'};
		char target='d';
		char ans=search(ch,target);
		System.out.println(ans);
	}

	public static char search(char[] ch, char target) {
		// TODO Auto-generated method stub
		int s=0;
		int e=ch.length-1;
		
		while(s<=e) {
			int m=s+(e-s)/2;
			
			if(target<ch[m]) {
				e=m-1;
			}
			else{
				s=m+1;
			}
//			else {
//				return ch[m];
//			}
		}
		return ch[s%ch.length];
	}
}
