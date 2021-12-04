public class ScopeEx {
    static int globalScope = 10; //인스턴스 변수

    public static void scopeTest(int value){
        int localScope = 100;
        System.out.println("globalScope:" + globalScope);
        System.out.println("localScope: " + localScope);
        System.out.println("value: " + value);
    }


    public static void main(String[] args) {
        scopeTest(7);
    }
}
