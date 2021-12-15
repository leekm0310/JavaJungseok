import java.util.*;

public class Ex11_10 {
    public static void main(String[] args) {
        Set set = new HashSet();

        for (int i = 0; set.size() < 6; i++){
            int num = (int)(Math.random()*45)+1;
            set.add(new Integer(num));
        }

        //set은 정렬불가 그래서 list로 옮겨서 리스트를 정렬!
        List list = new LinkedList(set);
        Collections.sort(list);
        System.out.println(list);
    }
}
