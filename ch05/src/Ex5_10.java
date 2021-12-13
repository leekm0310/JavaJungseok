import java.util.Scanner;

public class Ex5_10 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String[][] words = {
                {"integer","정수"},
                {"apple", "사과"},
                {"monkey","원숭이"}
        };

        for (int i = 0; i < words.length; i++){
            System.out.printf("Q%d. %s의 뜻은?", i+1, words[i][0]);
            String answer = scn.nextLine();

            if (answer.equals(words[i][1])){
                System.out.println("정답입니다");
            } else {
                System.out.printf("오답입니다. 정답은 %s 입니다. %n", words[i][1]);
            }
        }
    }
}
