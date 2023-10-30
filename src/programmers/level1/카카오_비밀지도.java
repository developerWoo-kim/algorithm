package programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 카카오_비밀지도 {
    public static void main(String[] args) {
        solution(5, new int[]{9, 20, 28, 18, 11}, new int[]{30, 1, 21, 17, 28});

    }
    public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        int[][] resultArr = new int[n][n];
        for (int i = 0; i < n; i++) {
            String resultStr = Integer.toString(arr1[i], 2);
            String[] split = resultStr.split("");
            int splitLength = split.length;
            int differ = n - split.length;
            for(int j = 0; j < n; j++) {
                if (n != splitLength) {
                    splitLength++;
                    resultArr[i][j] = 0;
                    continue;
                }
                resultArr[i][j] = Integer.parseInt(split[j-differ]);
            }
        }

        for (int i = 0; i < n; i++) {
            String resultStr = Integer.toString(arr2[i], 2);
            String[] split = resultStr.split("");
            int splitLength = split.length;
            int differ = n - split.length;
            for(int j = 0; j < n; j++) {
                if (n != splitLength) {
                    splitLength++;
                    if(resultArr[i][j] == 0) {
                        resultArr[i][j] = 0;
                    } else {
                        resultArr[i][j] = 1;
                    }
                    continue;
                }
                int i1 = Integer.parseInt(split[j - differ]);
                if(resultArr[i][j] == 0 && i1 == 0) {
                    resultArr[i][j] = 0;
                } else {
                    resultArr[i][j] = 1;
                }

            }
        }

        for(int i = 0; i < resultArr.length; i++) {
            String resultStr = "";
            for(int j = 0; j < resultArr[i].length; j++) {
                String str = String.valueOf(resultArr[i][j]);
                if("1".equals(str)) {
                    resultStr += "#";
                } else {
                    resultStr += " ";
                }
            }
            answer[i] = resultStr;
        }
        return answer;
    }

}
