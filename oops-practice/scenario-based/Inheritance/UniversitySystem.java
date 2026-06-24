import java.util.Scanner;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}

class Student extends Person {
    final int id;
    double gpa;

    Student(String name, int age, int id, double gpa) {
        super(name, age);
        this.id = id;
        this.gpa = gpa;
    }

    public String toString() {
        return super.toString() + ", Id: " + id + ", GPA: " + gpa;
    }
}

class GradStudent extends Student {
    String thesis;

    GradStudent(String name, int age, int id, double gpa, String thesis) {
        super(name, age, id, gpa);
        this.thesis = thesis;
    }

    public String toString() {
        return super.toString() + ", Thesis: " + thesis;
    }
}

public class UniversitySystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        int age = sc.nextInt();
        int id = sc.nextInt();
        double gpa = sc.nextDouble();
        sc.nextLine();
        String thesis = sc.nextLine();

        GradStudent g = new GradStudent(name, age, id, gpa, thesis);

        System.out.println(g);

        Student s = g;
        Person p = g;

        System.out.println(s);
        System.out.println(p);

        sc.close();
    }
}