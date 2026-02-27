class Student{
    String name;
    int id;

    Student(String name,int id){
        this.name=name;
        this.id=id;
    }

    void display(){
        this.show();
    }

    void show(){
        System.out.println("Name: "+this.name);
        System.out.println("ID: "+this.id);
    }

}
public class main2 {
    public static void main(String[] args) {

        Student s1=new Student("Laboni",12);

        s1.display();
    }
}
