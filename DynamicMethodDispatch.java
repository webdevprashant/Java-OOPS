class DynamicMethodDispatch {
    public static void main(String[] args) {

        parent tom = new child();
        parent pop = new child();
        tom.func1();
        pop.func2();
    }
}

// Dynamic method dispatch works only when parent, child has fn name same(Like
// overwriting) - But it diff, here obj is ref of parent class(Use all methods
// of parent only) but methods not completed
// in parent class, so tom, pop is obj of child class, so can use updated fn of
// child class, while runtime,
// parent class dynamically fatch updated fn from child class this is called
// dynamic method dispatch.
class parent {
    void func1() {
        System.out.println("fn1 not completed");
    }

    void func2() {
        System.out.println("fn2 not completed");
    }
}

// 1 single fn name, type multiple times call poly, but have diff code in every
// fn called morphism,
// this concept called polymorphism

class child extends parent {
    void func1() {
        System.out.println("fn1 completed");
    }

    void func2() {
        System.out.println("fn2 completed");
    }

}

// Method Overloading give u facility of compile time polymorphism.(We give func
// behaviour in compile time)
// method overwriting give u facility of run time polymorphism.(At run time
// decide which func run)
