package OOPS.ClassAndObjects;

public class Car {
    String car_name,car_type,engine_type;
    double car_price;
    public void start(){
        System.out.println("Started");
    }
    public void running(){
        System.out.println("car is running");
    }
    public void brake(){
        System.out.println("applying brakes");
    }
    public void stop(){
        System.out.println("car  stopped");
    }
    public static void main(String[] args) {
        Car c1 = new Car();


        System.out.println(c1.car_name = "SCORPIO");
        System.out.println(c1.car_type = "SUV");
        System.out.println(c1.engine_type = "DIESEL");
        System.out.println(c1.car_price = 3000000d);
        c1.start();
        c1.running();
        c1.brake();
        c1.stop();





    }
}
