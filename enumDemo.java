public class enumDemo {
    public static void main(String[] args) {
        SingletonEnum enum1 = SingletonEnum.INSTANCE;
        SingletonEnum enum2 = SingletonEnum.INSTANCE;
        enum1.i = 100;
        enum1.show();

        enum2.i = 200;
        enum1.show();
    }
}

enum SingletonEnum {
    // create an instance that counts as the private constructor
    INSTANCE;
    int i;
    public void show() {
        System.out.println(i);
    }
}