public class Main extends Object {
    public static void main(String[] args) {
        Student student = new Student("Mark", 21);
        System.out.println(student.toString());

        PrimarySchoolStudent psStudent = new PrimarySchoolStudent("Jim", 21, "Carol");
        System.out.println(psStudent.toString());
    }
}
class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


}

class PrimarySchoolStudent extends Student{
    private String parentName;

    public PrimarySchoolStudent(String name, int age, String parentName) {
        super(name, age);
        this.parentName = parentName;
    }

    @Override
    public String toString() {
        return "PrimarySchoolStudent{" +
                "parentName='" + parentName + '\'' +
                "} " + super.toString();
    }
}
