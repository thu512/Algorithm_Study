public class Test_1 {

    // Success
    public static int solution(int n) {
        int answer = 0;
        String s = n + "";
        for (char c : s.toCharArray()) {
            answer += Integer.parseInt(c + "");
        }
        return answer;
    }

    public static void main(String[] args) {

        System.out.println(solution(15));
    }
}
