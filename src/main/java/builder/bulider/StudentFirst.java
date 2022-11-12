package builder.bulider;

import java.util.List;

public class StudentFirst {
    int id;
    int age;
    int grade;
    String name;
    String college;
    String profession;
    List<String> awards;

    //属性非常多
    public StudentFirst(int id, int age, int grade, String name, String college, String profession,
        List<String> awards) {
        this.id = id;
        this.age = age;
        this.grade = grade;
        this.name = name;
        this.college = college;
        this.profession = profession;
        this.awards = awards;
    }
}
