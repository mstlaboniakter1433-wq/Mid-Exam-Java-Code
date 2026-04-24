class Vehicile{
    //boolean a = true;
    public void gotBackward(double speed , double accel){

    }
    public void gotForward(double speed , double accel){

    }
    public boolean star(){
        return true;
    }
    public void stop(){

    }
}
class Car extends Vehicile{
    private int numWheels;
    private double weight;
}
class Pickup extends Vehicile{
    private double loadCapacity;
    private int numWheels;
    private double weight;
}
class Dunptruck extends Vehicile{
     private double loadCapacity;
    private int numWheels;
    private double weight;
    public void lowerLoad(){

    }
    public void raiselLoad(){
        System.out.println("Load is raise");
    }
}
class Convertible extends Car{
    public boolean lowerRoof(){
        return true;
    }
    public boolean raiseRoof(){
        return true;
    } 
}
public class Uml2 {
    public static void main(String[] args) {
      Dunptruck d1 = new Dunptruck();
      d1.raiselLoad();  
    }
    
}
