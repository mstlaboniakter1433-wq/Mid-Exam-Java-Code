class Animal{
    int a = 77;


    void sound(){
        System.out.println("Animal Sounds");
    }
}


class Dog extends Animal{
    int a = 88;
    void sound(){
        System.out.println(a);
        System.out.println(super.a);
    }
}

public class variable {
    public static void main(String[] args) {
        Animal a=new Dog();
        a.sound();

    }
}
