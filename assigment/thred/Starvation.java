Thread t1 = new Thread(() -> {
    while (true) {
        System.out.println("Low priority thread running...");
    }
});
t1.setPriority(Thread.MIN_PRIORITY);

Thread t2 = new Thread(() -> {
    while (true) {
        System.out.println("High priority thread running...");
    }
});
t2.setPriority(Thread.MAX_PRIORITY);

t1.start();
t2.start();

