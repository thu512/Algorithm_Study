package Kakao.s1;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution(1234));
	}
	
	public static int solution(int n) {
		int answer = 0;
        int x=n;
        int y=100000000;
        int s; // 몫 
        int r; // 나머지
        
        for(int i =0 ; i<9; i++) {
        	s= x/y;
        	r=x%y;
        	answer += s;
        	x=r;
        	y /= 10;
        }
		return answer;
	}
}
