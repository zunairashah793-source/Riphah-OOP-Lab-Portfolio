class A {
    A() { System.out.print("A "); }
}

class B extends A {
    B() { System.out.print("B "); }
}

class C extends B {
    C() { System.out.print("C "); }
}

public class ConstructorOrderDemo {
    public static void main(String[] args) {
        new C();
        System.out.println();
    }
}
