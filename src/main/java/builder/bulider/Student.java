package builder.bulider;

import java.util.List;

public class Student {

    int id;
    int age;
    int grade;
    String name;
    String college;
    String profession;
    List<String> awards;

    //不对外开放，通过构造者创建
    private Student(int id, int age, int grade, String name, String college, String profession,
        List<String> awards) {
        this.id = id;
        this.age = age;
        this.grade = grade;
        this.name = name;
        this.college = college;
        this.profession = profession;
        this.awards = awards;
    }

    //获取建造者
    public static StudentBuilder builder() {
        return new StudentBuilder();
    }

    public static class StudentBuilder {

        int id;
        int age;
        int grade;
        String name;
        String college;
        String profession;
        List<String> awards;

        public StudentBuilder id(int id) {
            this.id = id;
            return this;    //返回this,支持链式编程
        }

        public StudentBuilder age(int age) {
            this.age = age;
            return this;
        }

        public StudentBuilder grade(int grade) {
            this.grade = grade;
            return this;
        }

        public StudentBuilder name(String name) {
            this.name = name;
            return this;
        }

        public StudentBuilder collage(String college) {
            this.college = college;
            return this;
        }

        public StudentBuilder profession(String profession) {
            this.profession = profession;
            return this;
        }

        public StudentBuilder awards(List<String> awards) {
            this.awards = awards;
            return this;
        }

        //调用建造者提供的build方法根据配置返回一个Student对象
        public Student build() {
            return new Student(id, age, grade, name, college, profession,
                awards);
        }


    }
}
