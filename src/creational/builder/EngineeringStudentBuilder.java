package creational.builder;

import java.util.ArrayList;
import java.util.List;

public class EngineeringStudentBuilder extends StudentBuilder {
    @Override
    public StudentBuilder setSubjects() {
        final List<String> subjectList = new ArrayList<>();
        subjectList.add("DSA");
        subjectList.add("OS");
        subjectList.add("Computer Architecture");
        this.subjects = subjectList;
        return this;
    }
}
