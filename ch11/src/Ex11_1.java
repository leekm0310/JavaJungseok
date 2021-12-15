import java.util.ArrayList;
import java.util.Collections;

public class Ex11_1 {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList(10);
        //ArrayList에는 객체만 저장가능
        //원래는 어레이리스트에는 기본형을 넣을 수 없음
        //autoboxing에 의해 기본형이 참조형으로 자동 변환
        list1.add(5);
        list1.add(4);
        list1.add(2);
        list1.add(0);
        list1.add(1);
        list1.add(3);

        ArrayList list2 = new ArrayList(list1.subList(1,4));
        print(list1, list2);
        //정렬하고 싶으면 collections 클래스 사용
        //Collection은 인터페이스, Collections는 클래스
        Collections.sort(list1);
        Collections.sort(list2);
        print(list1, list2);

        System.out.println("list1.containsAll(list2): " + list1.containsAll(list2));

        list2.add("B");
        list2.add("C");
        list2.add(3, "A");
        print(list1, list2);

        //변경 set
        list2.set(3, "AA");
        print(list1,list2);

        list1.add(0,"1");
        // indexOf()는 지정된 객체의 위치(인덱스)를 알려준다
        System.out.println("index="+list1.indexOf("1"));
        list1.remove(0); //인덱스 0에 있는 객체 삭제
        list1.remove(new Integer(1)); //숫자 1을 삭제
        print(list1, list2);

        //겹치는 부분만 남기고 나머지 삭제
        System.out.println("list1.retainAll(list2):" + list1.retainAll(list2));
        print(list1, list2);





    }

    static void print(ArrayList list1, ArrayList list2){
        System.out.println("list1: "+list1);
        System.out.println("list2: "+list2);
        System.out.println();
    }
}
