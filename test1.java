class Test1 {
    public int find(int left, int right) {
        int count = 0; // 36이 있는 수
        for (int i = left; i <= right; i++) {
            String temp = Integer.toString(i); // 수를 문자열 배열로 변환
            int len = temp.length(); // 숫자의 길이
            int[] array = new int[len];
            int[] digits = new int[len];
            for (int k = 0; k < len; k++) {
                digits[k] = temp.charAt(k) - '0';
            }
            for (int j = 0; j < len - 1; j++) {
                array[j] = digits[j] * 10 + digits[j + 1]; // 앞뒤로 두자리씩 선언
            }
            for (int l = 0; l < len - 1; l++) {
                if (array[l] == 36) { // 배열에 36이있으면
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Test1 test1 = new Test1();
        int a = test1.find(0, 100);
        int b = test1.find(0, 136);
        int c = test1.find(12000, 15721);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}