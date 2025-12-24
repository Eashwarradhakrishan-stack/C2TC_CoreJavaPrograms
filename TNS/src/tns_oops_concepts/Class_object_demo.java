package tns_oops_concepts;

	class Student { //class creation
	    int id;
	    String name;
	}

	public class Class_object_demo {
	    public static void main(String[] args) {
	        Student s = new Student ();  // Object creation
	        s.id = 101;
	        s.name = "Eashwar";

	        System.out.println(s.id + " " + s.name);
	    }
	}



