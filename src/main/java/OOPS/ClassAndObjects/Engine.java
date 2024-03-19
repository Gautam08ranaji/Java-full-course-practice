package OOPS.ClassAndObjects;

public class Engine {
    int hp;
    int stroke;
    String type;

    Engine(){

    }
    Engine(int hp,int stroke,String type){
        this.hp=hp;
        this.stroke=stroke;
        this.type=type;
    }
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
    public  void displayEngine(){
        System.out.println("HP IS : "+hp);
        System.out.println("STROKE IS : "+stroke);
        System.out.println("TYPE IS : "+type);
    }
}
