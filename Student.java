package Devops;
 
public class Student {
    String name;
    String usn;
    String dept;
    int age;

    void show() {
        System.out.println("Student Name: " + name);
        System.out.println("USN: " + usn);
        System.out.println("Department: " + dept);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Student s2 = new Student();
        s2.name = "Jack";
        s2.usn = "01fe23bca078";
        s2.dept = "Computer Science";
        s2.age = 20;

        s2.show();
    }
}
