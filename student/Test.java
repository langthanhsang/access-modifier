package accessmodifier.student;

public class Test {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setName("trung cho");
        student1.setClasses("C1021H1");
        System.out.println(student1.getName());
        System.out.println(student1.getClasses());
    }
}
