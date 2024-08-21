public class Student {

     int id;
     String firstName;
     String lastName;
     int age;
     char gender;

    public Student(int id, String firstName, String lastName, int age , char gender) {
        this.id = id;
        this.firstName = firstName;
        this.age = age;
        this.lastName = lastName;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
