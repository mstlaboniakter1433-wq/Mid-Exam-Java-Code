class Student{
    String name;
    int id;
    int age;

    Student(String name, int id, int age){
        this.name = name;
        this.id = id;
        this.age = age;
    }
    void show(){
        System.out.println("Name is : " + name);
        System.out.println("ID is : " + id);
        System.out.println("Age is : " + age);   
    }
}
public class This {
    public static void main(String[] args) {
        Student s1 = new Student("Laboni", 10, 20);
        s1.show();
    }
    
}
