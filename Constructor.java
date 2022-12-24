class Visitorform {
    String name;
    int age;
    int phone;

    // Visitorform() {} // Default/Non Parameterizexd constructor bcz no parater
    // they take, auto remove when paraterized constructor created

    // paraterized constructor
    Visitorform(String n, int a, int p) {
        name = n;
        age = a;
        phone = p;
    }

}

class Constructor {
    public static void main(String[] args) {
        Visitorform tom = new Visitorform("tom k", 10, 1111);
        // tom.age = 10;
        // tom.name = "tom k";
        // tom.phone = 1111;

        System.out.println(tom.age);
        System.out.println(tom.name);
        System.out.println(tom.phone);
    }
}
