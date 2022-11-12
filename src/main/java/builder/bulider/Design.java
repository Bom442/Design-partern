package builder.bulider;

public class Design {

    public static void main(String[] args) {
        Student student = Student.builder()
            .id(1)
            .age(22)
            .collage("CMU")
            .profession("cs")
            .name("frank")
            .build();

        System.out.println(student);
    }

}
