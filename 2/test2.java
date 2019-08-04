//import java.util.Arrays;
//import java.util.List;

class Test2 {
    public int solution(String k, String w) {
        char[] a = k.toCharArray(); // k to String
        char[] b = w.toCharArray(); // w to String
        int n = k.length(); // k의 문자열 길이
        int m = w.length(); // w의 문자열 길이
        int[] count = new int[m]; // 숫자를 저장할 배열
        int c = 0;
        int d = 0;
        int sum = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (a[j] == b[i]) {
                    d = Math.abs(c - j); // 두 문자간의 이동거리
                    count[i] = d;
                    c = j;
                }
            }
        }
        for (int l = 1; l < m; l++) {
            sum += count[l]; // 첫번째만 빼고 다 더하기
        }
        return sum;
    }

    public static void main(String[] args) {
        Test2 test2 = new Test2();
        int str1 = test2.solution("oncder", "rdeo");
        int str2 = test2.solution("thinkspace", "ckep");
        int str3 = test2.solution("a", "aaaaaaaaaaa");
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
    }
}