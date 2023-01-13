public class VariableScopeDemo {
    public int i; // globle Variable ภายนอก

    public void method1() {
        int j = 4; // Local Variable ภายใน
        int k = 2;
    }

    public void method2() {
        int j = 0;
        System.out.println(j);
    }

    public static void main(String[] args) {
        VariableScopeDemo v1 = new VariableScopeDemo();
        v1.method2();
    }
}
