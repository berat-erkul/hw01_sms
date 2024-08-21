import java.util.ArrayList;

public class StudentManagement {

    ArrayList<Student> students;

    StudentManagement() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public void addAllStudent(ArrayList<Student> students){
        students.addAll(students);
    }

    public void deleteStudentWithId(int studentId){
        students.remove(studentId);
    }

    public ArrayList<Student> searchStudentWithName(String firstName){
        ArrayList<Student> result=new ArrayList<>();

        for(Student student: this.students){
            if (student.firstName.equalsIgnoreCase(firstName)){
                result.add(student);
            }
        }

        return result;
    }

    public Student getStudentWithId(int studentId) {

        for(Student student: this.students){
            if (student.id == studentId){
                return student;
            }
        }
        System.out.println("Student not found");
        return null;
    }

    public ArrayList<Student> getAllStudents(){
        return this.students;
    }


    }
