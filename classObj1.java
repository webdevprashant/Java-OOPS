class classObj1 {
    public static void main(String[] args) { 
	int x = 5;
        // System.out.println(x);
        VisitorForm1 tom = new VisitorForm1();
        tom.setAge(20);
        System.out.println(tom.getAge());
    }
}
