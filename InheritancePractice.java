// Parent class
class Parent {

    void showParent() {
        System.out.println("This is Parent class method");
    }
}

// Child class
class Child extends Parent {

    void showChild() {
        System.out.println("This is Child class method");
    }
}

// Main class
public class InheritancePractice {

    public static void main(String[] args) {

        Child obj = new Child();

        obj.showParent(); // inherited from Parent
        obj.showChild();  // Child's own method
    }
}
