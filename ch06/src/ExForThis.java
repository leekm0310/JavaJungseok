class ExForThis {
    long a, b; // 여기서 a,b는 this.a, this.b가 진짜이름

    ExForThis(int a , int b){ //생성자
        this.a = a;
        this.b = b;
        //lv와 iv 구별하려고 this를 사용한다.
    }//this 사용가능능

   long add(){
        return a + b; //return this.a + this.b;
    } //this 사용가능


    static long add(long a, long b){ //클래스 메서드. this 사용불가
        return a + b;
    }
}
