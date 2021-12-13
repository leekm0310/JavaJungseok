import java.util.Arrays;

public class Ex5_tmp {
    public static void main(String[] args) {
        int[] arr = {2,1,0,3,4}; //1차원 배열
        int[][] arr2D = {{11,12},{21,22}}; //2차원 배열

        System.out.println(Arrays.toString(arr));
       
        Arrays.sort(arr); //오름차순으로 배열 정렬

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.deepToString(arr2D));

        String[][] str2D = {{"aaa","bbb"}, {"AAA", "BBB"}};
        String[][] str2D2 = {{"aaa","bbb"}, {"AAA", "BBB"}};

        System.out.println(str2D==str2D2); //이렇게 비교하면 참조변수 값 비교
        System.out.println(Arrays.deepEquals(str2D,str2D2));

        int[] arr2 = Arrays.copyOf(arr, arr.length);
        System.out.println(arr2);

        //Arrays.copyOfRange(arr, from, to)

    }
}
