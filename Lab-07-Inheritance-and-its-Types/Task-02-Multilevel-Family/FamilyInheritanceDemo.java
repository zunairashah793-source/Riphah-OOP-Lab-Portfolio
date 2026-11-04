class Grandfather {
    public void showGrandfather() { System.out.println("Grandfather: Ahmad"); }
}

class Father extends Grandfather {
    public void showFather() { System.out.println("Father: Imran"); }
}

class Son extends Father {
    public void showSon() { System.out.println("Son: Hamza"); }
}

public class FamilyInheritanceDemo {
    public static void main(String[] args) {
        Son son = new Son();
        son.showGrandfather();
        son.showFather();
        son.showSon();
    }
}
