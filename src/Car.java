public class Car {

    private int wheels = 4;
    private int doors = 4;
    private int seats = 5;
    protected int maxSpeed;
    private Thread thread;
    protected String threadCar;

    Car(){
        super();
    }

    public void run() {
        for(int i = 0; i < 10; i++) {
            System.out.println("Max speed of car is " +maxSpeed);
        }

    }

    public void info() {
        System.out.println("Wheels " + wheels);
        System.out.println("Doors " + doors);
        System.out.println("Seats " + seats);
        System.out.println("Maxspeed " + maxSpeed);
    }


}
