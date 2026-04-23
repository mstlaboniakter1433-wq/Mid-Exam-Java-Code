import java.util.jar.Attributes.Name;

class Preson{
    String name;
    int age;

    Preson(String n , int a ){
        name = n;
        age = a;
    }
    void show(){
        System.out.println("Name : " + name + " " + "Age : " + age);
    }
}
public class ParameterConst {
    public static void main(String[] args) {
        Preson p1 = new Preson("Laboni", 21);
        p1.show();

    }
    
}
