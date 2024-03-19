package OOPS.ClassAndObjects;

public class Car {

        String car_name,car_type;
        double price;
        Engine e1 = new Engine(60,6,"PETROL");

        Car(){

        }
        Car(String car_name,String car_type,double price){
            this.car_name=car_name;
            this.car_type=car_type;
            this.price=price;
        }
        public void displayCar(){
            System.out.println("CAR NAME IS "+car_name);
            System.out.println("CAR TYPE IS "+car_type);
            System.out.println("CAR PRICE IS "+price+" \u20B9");
            e1.displayEngine();
        }


}
