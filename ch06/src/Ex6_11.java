import javax.xml.crypto.Data;

class Data_1 {
    int value;
}

class Data_2 {
    int value;

    Data_2(){} //기본생성자
    Data_2(int x) { // 매개변수가 있는 생성자
        value = x;
    }
}


class Ex6_11 {
    public static void main(String[] args) {
        Data_1 d1 = new Data_1();
        Data_2 d2 = new Data_2(); // 생성자 없을 때 컴파일 에러 발생
    }

}
