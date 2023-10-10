package bilderPractice.simpleBuilder;

import lombok.Builder;
import lombok.ToString;

@Builder//создает статичный методы. метод билдер возвращает.
@ToString
public class Person {// данный подход называется fluent builder
    private String name;
    private int age;
    private String hobbies;


//    public static Person builder() {
//
//    }

//    @Override
//    public String toString() {
//        return "Person{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                ", hobbies='" + hobbies + '\'' +
//                '}';
//    }
//
//    public Person(String name, int age, String hobbies) {
//        this.name = name;
//        this.age = age;
//        this.hobbies = hobbies;
//    }
//
//    public static class   Builder{
//        private String name;
//        private int age;
//        private String hobbies;
//
//        public Builder setName(String txt){
//            this.name= txt;
//            return this;
//        }
//        public Builder setAge(int txt){
//            this.age= txt;
//            return this;
//        }
//        public Builder setHobbies(String txt){
//            this.hobbies= txt;
//            return this;
//        }
//        public Builder builder(){
//            return new Builder();
//        }
//        public Person build(){
//            return new Person(name,age,hobbies);
//        }
//    }
}
