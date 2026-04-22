class Student {
    String name;

    Student() {
        name = "Laboni";
    }

    void display() {
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        Student s1 = new Student(); 
        s1.display();
    }
}