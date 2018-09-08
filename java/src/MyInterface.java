interface InterfaceDemo {
    public int add(int a, int b);
    public int subtract(int a, int b);
}
public class MyInterface implements InterfaceDemo {

    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int subtract(int a, int b) {
        return a - b;
    }
}
