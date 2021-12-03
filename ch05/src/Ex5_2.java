import java.util.Arrays;

public class Ex5_2 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int[] iArr2 = new int[10];

        System.out.println("arr.length: " + arr.length);

//        for (int i = 0; i <10; i++){ //배열의 인덱스 범위 넘어나서 에러 남.
//            System.out.println(arr[i]);
//        }

        for (int i = 0; i <arr.length; i++){
            System.out.println(arr[i]);
        }

        for (int i = 0; i < iArr2.length; i++){
            iArr2[i] = (int)(Math.random()*10) + 1;
        }

        System.out.println(Arrays.toString(iArr2));
        System.out.println(iArr2);
    }
}
