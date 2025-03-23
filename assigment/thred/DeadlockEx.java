class A {
    synchronized void methodA(B b) {
        System.out.println("Thread 1: Locked A");
        try { Thread.sleep(1000); } catch (Exception e) {}
        b.methodB();
    }
}

class B {
    synchronized void methodB() {
        System.out.println("Thread 2: Locked B");
    }
}

class DeadlockExample {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        Thread t1 = new Thread(() -> a.methodA(b));
        Thread t2 = new Thread(() -> b.methodB());

        t1.start();
        t2.start();
    }
}

