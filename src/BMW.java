public class BMW extends Car implements Runnable{
    private Thread thread;
    @Override
    public synchronized void run() {
        super.maxSpeed = 200;
        for(int i = 0; i < 10; i++) {
            System.out.println("Max speed of car is " +maxSpeed);
            try{
                Thread.sleep(400);
            }catch(Exception e){System.out.println(maxSpeed);}
        }

    }

    BMW(String car) {
        threadCar = car;
    }

    BMW() {
        super();
    }

    public void start(){
//        System.out.println("Thread of " + threadCar);
        if(thread == null) {
            thread = new Thread(this);

            thread.start();
        }
    }
}
