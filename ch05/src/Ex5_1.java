public class Ex5_1 {
    public static void main(String[] args) {
        int[] score; //배열 score를 선언
        score = new int[5]; // 배열의 생성

        int[] score2 = new int[5];

        score[3] = 100;

        System.out.println("score[3]: " + score[3]);

        int value = score[3];
        System.out.println(value);

    }
}
