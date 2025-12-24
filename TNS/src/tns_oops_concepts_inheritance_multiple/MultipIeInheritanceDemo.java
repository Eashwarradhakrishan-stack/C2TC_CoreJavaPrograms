package tns_oops_concepts_inheritance_multiple;

// Interface 1
interface abc {
    void show();
}

// Interface 2
interface bcd {
    void display();
}

// Class implementing multiple interfaces
class Demo implements abc, bcd {

    public void show() {
        System.out.println("He is showing");
    }

    public void display() {
        System.out.println("He is displaying");
    }
}

// Main class
public class MultipIeInheritanceDemo {

    public static void main(String[] args) {
        Demo obj = new Demo();
        obj.show();
        obj.display();
    }
}
