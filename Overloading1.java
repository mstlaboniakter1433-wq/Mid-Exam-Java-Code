class Calculator{

    public int num1;
    public int num2;

    public int add(){
        return num1 + num2;
    }
    public int add(int n1 , int n2){
        
        return n1 + n2;
    }
    public double add(double n1 , double n2){
        return n1 + n2;
    }
}
public class Overloading1 {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        c1.num1 = 10;
        c1.num2 = 7;
        c1.add();
        System.out.println(c1.add());
    } 
}
