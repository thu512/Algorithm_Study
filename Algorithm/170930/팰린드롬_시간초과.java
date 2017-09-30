import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char[] arr = sc.nextLine().toCharArray();
		if(arr.length==2 && arr[0]==arr[1]) {
			System.out.println(2);
			return;
		}
		char[] res = new char[arr.length+arr.length-1];
		int[] result = new int[res.length];
		
		res[0]=arr[0];
		//System.out.print(res[0]);
		for(int i=1; i<res.length; i++) {
			if(i%2 == 1) {
				res[i]='#';
			}else {
				res[i]=arr[i/2];
			}
			//System.out.print(res[i]);
		}
		//System.out.println("");
		int max=0;
		int i=0;
		int j=0;
		while(i-j>=0 && i+j<res.length) {
			if(((i-(j+1)>=0) && (i+(j+1)<res.length))&&(res[i-(j+1)] == res[i+(j+1)]) ) {
				j++;				
			}
			else {
				if(res[i]=='#' && res[i-j]=='#' && res[i+j]=='#' && j!=0) {
					result[i]=(j-1);
				}else if(res[i]!='#' && res[i-j]=='#' && res[i+j]=='#' &&(res[i-(j+1)] != res[i+(j+1)]) && j==1){
					result[i]=(0);
				}else if(res[i]!='#' && res[i-j]=='#' && res[i+j]=='#' &&(res[i-(j+1)] != res[i+(j+1)])) {
					result[i]=(j-1);
				}else {
					result[i]=(j);
				}
				i++;
				j=0;
			} 
		}
		
		for(int i1 : result) {
			if(max<=i1) {
				max = i1;
			}
			//System.out.print(i1);
		}
		//System.out.println("");
		
		System.out.println(max+1);
		
		
		
	}

}
