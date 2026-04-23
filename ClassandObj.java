class Student {
    String name;
    int age;
    int id;

    void Display() {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("ID : " + id);
    }
}

public class ClassandObj {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Laboni";
        s1.age = 33;
        s1.id = 777;

        s1.Display(); 
    }
}