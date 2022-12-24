class overloading {
    public static void main(String[] args) {
        System.out.println(overload(5, 6));
        System.out.println(overload(5, 6.2));
        System.out.println(overload(5.5f, 6.1f));
    }

    static int overload(int a, int b) { // Static means this method common for all, used by all
        return a + b;
    }

    static Float overload(Float x, Float y) {
        return x + y;
    }

    static double overload(int x, Double y) {
        return x + y;
    }
}

// Ovevrloading means func name same, but func signature is
// and different,Overloading works in single class