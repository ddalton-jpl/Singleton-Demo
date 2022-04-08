class lazyDemo {

    public static void main(String[] args) {
        SingletonLazy s1 = SingletonLazy.getInstance();
        System.out.println(s1);
        
        SingletonLazy s2 = SingletonLazy.getInstance();
        System.out.println(s2);
    }
}

class SingletonLazy {
    private static SingletonLazy uniqueInstance;
    int i;
    // private consructor
    private SingletonLazy() {
        System.out.println("Instance is created");
    }

    // get instance of obj
    public static SingletonLazy getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new SingletonLazy();
        }
        return uniqueInstance;
    }
}