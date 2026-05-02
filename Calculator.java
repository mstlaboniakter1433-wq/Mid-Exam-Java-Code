package Polymorphism;
public class Calculator {

    int add(int a, int b){
        return a+b;
    }

    double add(double a,double b){
        return a+b;
    }

    int add(int a,int b,int c){
        return a+b+c;
    }

    void display(int a){
        System.out.println(a);
    }

    public static void main(String[] args) {
        a=13;
        b=14;
        
        int sum=add(a,b);
        display(sum);


    }
}
