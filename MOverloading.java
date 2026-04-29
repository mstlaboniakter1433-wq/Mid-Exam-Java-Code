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
public class MOverloading {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();

        //1st
        c1.num1 = 10;
        c1.num2 = 7;
        System.out.println(c1.add());

        //2nd
        int sum=c1.add(5,4);
        System.out.println(sum);

        //3rd
        double sum1=c1.add(5.00, 10.5);
        System.out.println(sum1);
    } 
}
