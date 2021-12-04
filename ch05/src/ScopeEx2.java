public class ScopeEx2 {
    int globalScope = 10;
    static int staticVal = 7;

    public void scopeTest(int value){
        int localScope = 20;
    }

    public static void main(String[] args) {
        System.out.println("staticVal: " + staticVal); // 사용가능

        ScopeEx2 s1 = new ScopeEx2();
        ScopeEx2 s2 = new ScopeEx2();
        s1.globalScope = 20;
        s2.globalScope = 30;

        System.out.println("s1.globalScope: " + s1.globalScope);
        System.out.println("s1.globalScope: " + s2.globalScope);

        s1.staticVal = 10;
        s2.staticVal = 20;

        System.out.println(s1.staticVal);
        System.out.println(s2.staticVal);
    }
}
