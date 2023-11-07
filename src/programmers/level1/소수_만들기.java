package programmers.level1;

public class 소수_만들기 {

    public static void main(String[] args) {
        solution(new int[]{1,2,7,6,4});
    }

    public static int solution(int[] nums) {
        int answer = 0;

        for(int i = 0; i < nums.length; i++) {
            for(int j = i+1; j < nums.length; j++) {
                for(int l = j+1; l < nums.length; l++){
                    if(cal(nums[i] + nums[j] + nums[l])) {
                        answer++;
                    };

                }
            }
        }

        return answer;
    }

    public static boolean cal(int num) {
        for(int i = 2; i<num; i++) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
