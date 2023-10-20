public class Main {
    public static void main(String[] args) {
        System.out.println("inside the main thread");

        //woth lambda expression
        Runnable runner = () -> System.out.println("hello");
        Thread t3 = new Thread (runner);
        t3.start();
        //code below will go on forever, but slowly
        Runnable r = new Runnable() {
            public void run() {
                while (true) {
                    System.out.println("inside other thread");
                    try {
                        Thread.sleep(500); //threads can ask scheduler put them to sleep (for a specified amount of time
                    }

                    catch (Exception e) {}
                }
            }
        };

        Thread t2 = new Thread(r); //pass the runnable which has the run method



        //bad method
        MyThread t1 = new MyThread(); //when you launch the thread, start method is called (NOT RUN)
        //start method is inherited from Thread class
        t1.start();
        while (true)
        {
            System.out.println("Inside main thread");
            try {
                Thread.sleep(500);
            }

            catch (Exception e) {}
        }

    }
    /*
    within this, one thread may run twice or more before the other has a chance to because the scheduler is unpredictable
    this is the downside of threads
    so, if you need it to be precise in a certain order, do NOT use multiple threads
     */
}