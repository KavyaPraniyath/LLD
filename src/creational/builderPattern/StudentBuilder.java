package creational.builderPattern;

import java.util.List;

public abstract class StudentBuilder {

    protected int rollNumber;
    protected int age;
    protected String name;
    protected String fatherName;
    protected String motherName;
    protected List<String> subjects;

    public StudentBuilder setRollNumber(final int rollNumber) {
        this.rollNumber = rollNumber;
        return this;
    }

    public StudentBuilder setAge(final int age) {
        this.age = age;
        return this;
    }

    public StudentBuilder setName(final String name) {
        this.name = name;
        return this;
    }

    public StudentBuilder setFatherName(final String fatherName) {
        this.fatherName = fatherName;
        return this;
    }

    public StudentBuilder setMotherName(final String motherName) {
        this.motherName = motherName;
        return this;
    }

    abstract public StudentBuilder setSubjects();

    public Student build() {
        return new Student(this);
    }
}
