public class eagerDemo {
    public static void main(String[] args) {
        SingletonEager s1 = SingletonEager.getInstance();
        System.out.println(s1);

        SingletonEager s2 = SingletonEager.getInstance();
        System.out.println(s2);
    }
}

class SingletonEager {
    private static SingletonEager uniqueInstance = new SingletonEager();
    int i;
    // private consructor
    private SingletonEager() {
        System.out.println("Instance is created");
    }

    // get instance of obj
    public static SingletonEager getInstance() {
        return uniqueInstance;
    }
}
