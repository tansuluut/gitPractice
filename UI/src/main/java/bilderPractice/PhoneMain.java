package bilderPractice;

public class PhoneMain {
    public static void main(String[] args) {
        Director director = new Director();
        director.setBuilder(new SamsungBuilder());
        Phone samsung = director.build();
        System.out.println(samsung);
    }


}
