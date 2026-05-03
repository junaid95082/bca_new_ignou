abstract class MyClass {
    String name;
    int age;

    abstract void show();
}

class Test extends MyClass {
    String semester;

    Test(String name, int age, String semester) {
        this.name = name;
        this.age = age;
        this.semester = semester;
    }

    void show() {
        System.out.println("N :" + name);
        System.out.println("A :" + age);
        System.out.println("S :" + semester);
    }
}

public class April23_Abstraction {
    public static void main(String[] args) {
        Test t = new Test("krish", 20, "4");
        t.show();
    }
}