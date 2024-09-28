package creational.builder;

public class Director {

    private final StudentBuilder studentBuilder;

    public Director(final StudentBuilder studentBuilder) {
        this.studentBuilder = studentBuilder;
    }

    public Student createStudent() {
        if (studentBuilder instanceof EngineeringStudentBuilder) {
            return cretaeEngineeringStudent();
        } else if (studentBuilder instanceof MBAStudentBuilder) {
            return createMBAStudent();
        }
        return null;
    }

    private Student createMBAStudent() {
        return studentBuilder
            .setRollNumber(2)
            .setAge(24)
            .setName("Test")
            .setFatherName("MyFatherName")
            .setMotherName("MyMotherName")
            .setSubjects()
            .build();
    }

    private Student cretaeEngineeringStudent() {
        return studentBuilder
            .setRollNumber(1)
            .setAge(22)
            .setName("sj")
            .setSubjects()
            .build();
    }
}
