package creational.builderPattern;

import java.util.List;

public class Student {
    private final int rollNumber;
    private final int age;
    private final String name;
    private final String fatherName;
    private final String motherName;
    private final List<String> subjects;

    public Student(final StudentBuilder studentBuilder) {
        this.rollNumber = studentBuilder.rollNumber;
        this.age = studentBuilder.age;
        this.name = studentBuilder.name;
        this.fatherName = studentBuilder.fatherName;
        this.motherName = studentBuilder.motherName;
        this.subjects = studentBuilder.subjects;
    }

    public String toString(){
        return ""+ " roll number: " + this.rollNumber +
            " age: " + this.age +
            " name: " + this.name +
            " father name: " + this.fatherName +
            " mother name: " + this.motherName +
            " subjects: " + subjects.get(0) + "," + subjects.get(1) + "," + subjects.get(2);
    }
}
