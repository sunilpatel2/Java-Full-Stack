public class Main {
    public static void main(String[] args) {
        // System.out.println("Hello, World!");

        student s1 = new student();
        s1.display();

        IdentifierDemo.show();

        car c1 = new car();
        System.out.println(c1.model);

        new animal();

        VariableDemo vd = new VariableDemo();
        vd.method();

        Employee emp = new Employee();
        System.out.println("Employee ID: " + emp.getId());
        System.out.println("Employee Name: " + emp.getName());

        AccessDemo ad = new AccessDemo();
        ad.display();

        new Counter();
        new Counter();
        System.out.println("Total objects created: " + Counter.count);

        FinalDemo fd = new FinalDemo();
        fd.show();

        System.out.println("Day: " + Day.MONDAY);

        // Dog dog = new Dog();
        // dog.sound();
        Animal animal = new Dog();
        animal.sound();
    }
}

// 1. Create a class Student with variables id and name. Print their values.
class student{
    int id = 1;
    String name = "Sunil";
    void display(){
        System.out.println("My id is " + id + " and name is " + name);
    }
}

// 2. Write a program showing valid identifiers. (Comment invalid ones)
class IdentifierDemo {
    static void show() {
        int age = 20;
        int _num = 10;
        int $price = 50;

        // int 1num = 5;     // invalid
        // int class = 10;   // invalid

        System.out.println(age + " " + _num + " " + $price);
    }
}

// 3. Create a class Car with variable model. Create an object and print it.
class car {
    String model = "Toyota";
}

// 4. Create a class with a constructor that prints: `"Object Created"
class animal {
    animal() {
        System.out.println("Object Created");
    }
}

// 5. Write a program showing: instance variable, static variable, local variable
class VariableDemo {
    int var1 = 10; // instance variable
    static int var2 = 20; // static variable
    void method() {
        int var3 = 30; // local variable
        System.out.println("Instance variable: " + var1);
        System.out.println("Static variable: " + var2);
        System.out.println("Local variable: " + var3);
    }
}

// 6. Create a JavaBean class Employee with:private variables id, name | getter and setter methods
class Employee {
    private int id = 1;
    private String name = "Sunil Patel";

    // Getter methods
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    // Setter methods
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }

}

// 7. Create a class with: one private variable , one public variable Print values using methods.
class AccessDemo {
    private int privateVar = 10;
    public int publicVar = 20;

    void display() {
        System.out.println("Private Variable: " + privateVar);
        System.out.println("Public Variable: " + publicVar);
    }
}

// 8. Create a class with a static variable count. Increment it using multiple objects.
class Counter {
    static int count = 0;
    Counter() {
        count++;
    }
}

// 9. eate a class with a final variable and try changing it. Observe error.
class FinalDemo {
    final int finalVar = 100;
    void show() {
        // finalVar = 200; // This will cause a compile-time error
        System.out.println("Final Variable: " + finalVar);
    }
}

// 10. Create an enum Day and print any one value.
enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

// 11. Create an abstract class Animal with method sound(). Create subclass Dog and implement it.
abstract class Animal { //Parent class
    abstract void sound();
}
class Dog extends Animal { //Child class
    void sound() {
        System.out.println("Woof");
    }
}

// 12. Create an interface Shape with method draw().Implement it in class Circle.
interface Shape {
    void draw();
}
class Circle implements Shape {
    public void draw() {
        System.out.println("Drawing a circle");
    }
}
