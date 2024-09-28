package creational.builderPattern;

public class Client {
    public static void main(String[] args) {
        final Director engineerDirector = new Director(new EngineeringStudentBuilder());
        final Director mbaDirector = new Director(new MBAStudentBuilder());

        final Student engineeringStudent = engineerDirector.createStudent();
        final Student mbaStudent = mbaDirector.createStudent();

        System.out.println("Engineering Student: " + engineeringStudent.toString());
        System.out.println("MBA Student: " + mbaStudent.toString());
    }
}
