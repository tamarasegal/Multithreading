public class MyThread extends Thread {
    //inheriting from thread allows you to create a separate thread

    public void run() {
        while (true) {
            System.out.println("inside other thread");
            try {
                Thread.sleep(500); //threads can ask scheduler put them to sleep (for a specified amount of time
            }

            catch (Exception e) {}
        }
    }


        // people don't like thus method because it means you can't inherit from another class, you've already inherited from Thread
    }

