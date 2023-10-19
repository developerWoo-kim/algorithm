package programmers.level1;

public class 카카오_키패드_누르기 {
    public static void main(String[] args) {
        String right = solution(new int[]{1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5}, "right");
        System.out.println(right);
    }

    public static String solution(int[] numbers, String hand) {
        String answer = "";

        int left = 0;
        int right = 0;

        return answer;
    }

    public static String checkingCloser(int num, String hand, int left, int right) {
        if(num == 0) num=11;
        int leftCount = 1;
        left++;
        while (true) {
            if(left == num) {
                break;
            } else {
                leftCount++;
                if(num > left) {
                    left = left+3;
                } else {
                    left = left-3;
                }

            }
        }

        int rightCount = 1;
        right--;
        while (true) {
            if(right == num) {
                break;
            } else {
                rightCount++;
                if(num > right) {
                    right = right+3;
                } else {
                    right = right-3;
                }
            }
        }

        String result = "";
        if(leftCount == rightCount) {
            result = hand.equals("right") ? "R" : "L";
        } else if(leftCount > rightCount) {
            result = "R";
        } else {
            result = "L";
        }
        return result;
    }
}
