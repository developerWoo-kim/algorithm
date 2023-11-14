package programmers.level1;

public class 공원산책 {
    public static void main(String[] args) {
        int[] solution = solution(new String[]{"SOO", "OOO", "OOO"},
                new String[]{"E 2", "S 2", "W 1"});


        int[] solution1 = solution(new String[]{"SOO", "OXX", "OOO"},
                new String[]{"E 2", "S 2", "W 1"});



        int[] solution2 = solution(new String[]{"OSO", "OOO", "OXO", "OOO"},
                new String[]{"E 2", "S 3", "W 1"});
        System.out.println("dsad");

    }

    public static String[][] parkArr;
    public static int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];

        parkArr = new String[park.length][park[0].toCharArray().length];

        int currH = 0;
        int currW = 0;

        for(int k = 0; k < park.length; k++) {
            char[] charArray = park[k].toCharArray();
            for(int j = 0; j < charArray.length; j++) {
                String value = String.valueOf(charArray[j]);
                if(value.equals("S")) {
                    currH = k;
                    currW = j;
                }
                parkArr[k][j] = value;
            }
        }

        for(int i = 0; i < routes.length; i++) {
            String[] route = routes[i].split(" ");


            int h = 0;
            int w = 0;
            switch (route[0]) {
                case "E" :
                    w = Integer.parseInt(route[1]);
                    if(plusChecker(currW, w, park[0].toCharArray().length-1)) {
                        boolean result = true;
                        for(int k = currW; k < currW+w; k++) {
                            if(parkArr[currH][k].equals("X")) {
                                result = false;
                                break;
                            }
                        }

                        if(result) {
                            currW += w;
                        }
                    }
                    break;
                case "S":
                    h = Integer.parseInt(route[1]);
                    if(plusChecker(currH, h, routes.length-1)) {
                        boolean result = true;
                        for(int k = currH; k < currH+h; k++) {
                            if(parkArr[k][currW].equals("X")) {
                                result = false;
                                break;
                            }
                        }

                        if(result) {
                            currH += h;
                        }
                    }
                    break;
                case "W" :
                    w = Integer.parseInt(route[1]) * -1;
                    if(minusChecker(currW, w)) {
                        boolean result = true;
                        for(int k = currW; k >= currW+w; k--) {
                            if(parkArr[currH][k].equals("X")) {
                                result = false;
                                break;
                            }
                        }

                        if(result) {
                            currW += w;
                        }
                    }
                    break;
                case "N" :
                    h = Integer.parseInt(route[1]) * -1;
                    if(minusChecker(currH, h)) {
                        boolean result = true;
                        for(int k = currH; k >= currH+h; k--) {
                            if(parkArr[k][currW].equals("X")) {
                                result = false;
                                break;
                            }
                        }
                        if(result) {
                            currH += h;
                        }
                    }
                    break;
            }
        }
        answer[0] = currH;
        answer[1] = currW;
        return answer;
    }

    public static boolean minusChecker(int curr, int move) {
        if(curr + move < 0) {
            return false;
        }
        return true;
    }

    public static boolean plusChecker(int curr, int move, int length) {
        if(curr + move > length) {
            return false;
        }
        return true;
    }
}
