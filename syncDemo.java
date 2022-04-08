public class syncDemo {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                SingletonSync s1 = SingletonSync.getInstance();
                System.out.println(s1);
            }
        });

        Thread t2 = new Thread(new Runnable() {
            public void run() {
                SingletonSync s2 = SingletonSync.getInstance();
                System.out.println(s2);
            }
        });

        t1.start();
        t2.start();
    }
}

class SingletonSync {
    private static SingletonSync uniqueInstance;
    int i;

    // private consructor
    private SingletonSync() {
        System.out.println("Instance is created");
    }

    // get instance of obj
    public static synchronized SingletonSync getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new SingletonSync();
        }
        return uniqueInstance;
    }
}