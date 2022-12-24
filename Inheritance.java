class Visitorform {
    String name;
    int age;
    int phone;

    // Visitorform(String n, int a, int p) { // name = n; // age = a; // phone = p;
    // // }
    Visitorform() {
        System.out.println("I am parent class");
    }

    void pclass() {
        System.out.println("This is func of parent class");
    }
}

class JobForm extends Visitorform {
    int exp;
    String tech;

    JobForm() {
        System.out.println("I am Child Class");
    }
}

class Inheritance {
    public static void main(String[] args) {
        JobForm tom = new JobForm();
        tom.pclass();
	//tom.phone = 12222;
    }
}
