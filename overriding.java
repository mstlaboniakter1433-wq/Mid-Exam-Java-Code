class Animal{
    void sound(){
        System.out.println("Animal Sounds");
    }
}

@override
class Dog extends Animal{
    void sound(){
        System.out.println("Bark");
    }
}

@Override
class Cat extends Animal{
    void sound(){
        System.out.println("Meow");
    }
}


public class overriding {
    public static void main(String[] args) {
        Animal a=new Dog();
        a.sound();

        a=new Cat();
        a.sound();
    }
}
