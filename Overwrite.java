class Overwrite {
    public static void main(String[] args) {
//        OverwriteParent tom = new OverwriteParent();
//        tom.overwritefunc();
	OverwriteChild pop = new OverwriteChild();
        pop.overwritefunc();
    }
}

// Overwrite only happens when obj use child class, and func name of parent and
// child is same,
// Use case is if you want to customize update func of parent then method
// overwriting will happens.

class OverwriteParent {
    private int age;
    private int phone;

    void overwritefunc() {
        System.out.println("I am incompleted");
    }

}

class OverwriteChild extends OverwriteParent {
    void overwritefunc() {
        System.out.println("I am completed Now");
    }
}
