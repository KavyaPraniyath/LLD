package creational.builderPattern;

import java.util.ArrayList;
import java.util.List;

public class MBAStudentBuilder extends StudentBuilder {
    @Override
    public StudentBuilder setSubjects() {
        final List<String> subjectList = new ArrayList<>();
        subjectList.add("Micro Economics");
        subjectList.add("Business Studies");
        subjectList.add("Operations Management");
        this.subjects = subjectList;
        return this;
    }
}
