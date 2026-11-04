class Person {
    public void introduce() {
        System.out.println("Hello, I am a person.");
    }
}

class Student extends Person {
    public void study() {
        System.out.println("I am studying.");
    }
}

public class PersonStudentDemo {
    public static void main(String[] args) {
        Student student = new Student();
        student.introduce();
        student.study();
    }
}
