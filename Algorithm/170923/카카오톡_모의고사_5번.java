package Kakao.s5;
public class Solution {
	public static void main(String[] args) {
		//TODO Auto-generated method stub
		
		int[][] arr = {{1,2,3,5},{5,6,7,8},{4,3,2,1}};
		System.out.println(solution(arr));
	}
	static int[][] dp= new int[100001][4];
	
	public static int solution(int[][] land) {
        int answer = 0;
        int len = land.length;
        
        dp[0]= land[0];
        
        
        for(int i = 1; i< len; i++) {
        	for(int j = 0; j<4; j++) {
        		int max=0;
        		for(int k=0; k<4; k++) {
        			if(j==k) {
        				continue;
        			}else {
        				max=Math.max(max, dp[i-1][k]+land[i][j]);
        			}
        			
        		}
        		dp[i][j]=max;
        	}
        }
        
        
        for(int i=0; i<4; i++) {
        	answer=Math.max(answer, dp[land.length-1][i]);
        }
        return answer;
    
	}
}
