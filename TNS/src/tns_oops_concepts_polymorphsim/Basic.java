package tns_oops_concepts_polymorphsim;


	class Animal {
	    void sound() {
	        System.out.println("Animal sound");
	    }
	}

	class Dog extends Animal {
	    void sound() {
	        System.out.println("Dog barks");
	    }
	}

	public class Basic {
	    public static void main(String[] args) {
	        Animal a = new Dog();  // parent reference, child object
	        a.sound();
	    }
	}



