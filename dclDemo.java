public class dclDemo {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                SingletonDcl s1 = SingletonDcl.getInstance();
                System.out.println(s1);
            }
        });

        Thread t2 = new Thread(new Runnable() {
            public void run() {
                SingletonDcl s2 = SingletonDcl.getInstance();
                System.out.println(s2);
            }
        });

        t1.start();
        t2.start();
    }
}

class SingletonDcl {
    private static SingletonDcl uniqueInstance;
    int i;

    // private consructor
    private SingletonDcl() {
        System.out.println("Instance is created");
    }

    // get instance of obj
    public static SingletonDcl getInstance() {
        if (uniqueInstance == null) {
            synchronized(SingletonDcl.class) {
                if(uniqueInstance == null) {
                    uniqueInstance = new SingletonDcl();
                }
            }
        }
        return uniqueInstance;
    }
}