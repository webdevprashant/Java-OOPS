class Abstract {
    public static void main(String[] args) {
        child jack = new child();
        jack.hello();
        jack.missioncritical();
    }
}

// Data Hiding - obj can't see and can't use
// Data Hiding/secure data members and methods (by access modifier -
// Private(Means only current class can use data members and methods))

abstract class parent {
    private int age;
    private int phone;

    abstract void missioncritical();

    void hello() {
        System.out.println("Hello parent");
    }
}


class child extends parent {
    void missioncritical() {
        System.out.println("Complete abstracted method of parent class");

    }
}





// Abstraction - Obj can't see, but can use
// Abstraction means just declare only complete methods in other class, Moto -
// 1. Don't want to show code complexity, 2. Nobody can use abstracted class
// till complete This is use case of abstraction
// Data Hiding(Access modifier - Private) + Abstraction = Encapsulation(Don't
// want to expose details to client)