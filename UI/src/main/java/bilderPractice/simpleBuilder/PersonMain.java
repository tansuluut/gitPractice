package bilderPractice.simpleBuilder;


public class PersonMain {
    public static void main(String[] args) {
        Person tanos = Person.builder()
                .name("tanos")
                .age(23)
                .hobbies("run")
                .build();
    }


}
