interface Shape {
    void draw();
}

class Circle implements Shape {
    @Override
    public void draw() { System.out.println("Drawing a circle."); }
}

class Square implements Shape {
    @Override
    public void draw() { System.out.println("Drawing a square."); }
}

public class ShapeInterfaceDemo {
    public static void main(String[] args) {
        Shape[] shapes = { new Circle(), new Square() };
        for (Shape shape : shapes) shape.draw();
    }
}
