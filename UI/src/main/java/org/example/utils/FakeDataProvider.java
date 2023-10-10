package org.example.utils;

import com.github.javafaker.Faker;
import modals.Student;

public class FakeDataProvider {
    Faker faker = new Faker();
    public String generateFakeFullName() {
        return faker.name().fullName();
    }
    public String generateFakeFirstName(){
        return  faker.name().firstName();
    }

    public String generateFakeLastName() {
        return faker.name().lastName();
    }

    public String generateFakeEmail() {
        return faker.internet().emailAddress();
    }

    public String generationPhoneNumber() {
        return faker.number().digits(10);
    }

    public String generationFakeCurrentAddress() {
        return faker.address().fullAddress();
    }

    public String generationFakePermanentAddress() {
        return faker.address().streetName() + " " + faker.address().streetAddressNumber();
    }
    public Student createFakeStudent(){
        Student  student = new Student();
        student.setFirstName(generateFakeFirstName());
        student.setLastName(generateFakeLastName());
        student.setEmail(generateFakeEmail());
        student.setPhoneNumber(generationPhoneNumber());
        student.setCurrentAddress(generationFakeCurrentAddress());
      return student;

    }
}
