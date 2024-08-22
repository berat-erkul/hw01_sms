[TR]

Görev 1:

- Student adlı bir class oluşturun ağaşıdaki fieldları ekleyin:

  id        :int
  firstName :String
  lastName  :String
  age       :int
  gender    :char (M/F)

- constructor: Bütün alanları dolduracak bir constructor oluşturun.

- toString(): methodu oluşturun




Görev 2:

- StudentManagement adlı bir class oluşturun ve aşağıdaki fieldı ekleyin:

        students:ArrayList<Student>

- constructor: Yukarıdaki field kısmını non-argument constructor ile initialize edin.


- Aşağıdaki methodları ekleyin.

  * addStudent(Student student) : methdod listeye student ekler.

  * addAllStudent(ArrayList<Student> students):method listeye çoklu student ekler

  * deleteStudentWithId(int studentId) : student id si verilen student listeden silinir.

  * searchStudentWithName(String firstName) : belirtilen isimdeki öğrencilerin bilgilerini döndüren method.

  * getStudentWithId(int studentId) : belirtilen studentı döndüren method.

  * getAllStudents() listedeki tüm studentları döndüren methoddur.





Görev 3:

- StudentManagementTest adlı bir sınıf oluşturun ve main method ekleyin.


- 10 tane Student objesi oluşturun ve id yazarken unique olsun.

        Student student1 = new Student(1, "John", "Doe", 20, 'M');
        Student student2 = new Student(2, "Jane", "Doe", 22, 'F');
        Student student3 = new Student(3, "Alice", "Smith", 19, 'F');
        Student student4 = new Student(4, "Bob", "Brown", 21, 'M');
        Student student5 = new Student(5, "Charlie", "White", 23, 'M');
        Student student6 = new Student(6, "Diana", "Green", 20, 'F');
        Student student7 = new Student(7, "Eve", "Black", 22, 'F');
        Student student8 = new Student(8, "Frank", "Blue", 19, 'M');
        Student student9 = new Student(9, "Grace", "Yellow", 21, 'F');
        Student student10 = new Student(10, "Hank", "Pink", 23, 'M');


- StudentManagement objesi oluşturun ve sisteme student ekleyin, silin, arayın, istenilen student bilgilerini yazdırın.


---
---
-
---
-
---
---


[EN]

Task 1:

	•	Create a class named Student with the following fields:
	•	id : int
	•	firstName : String
	•	lastName : String
	•	age : int
	•	gender : char (M/F)
	•	Constructor: Create a constructor that initializes all fields.
	•	toString(): Implement the toString() method.

Task 2:

	•	Create a class named StudentManagement with the following field:
	•	students : ArrayList<Student>
	•	Constructor: Initialize the above field with a non-argument constructor.

public StudentManagement() {
    students = new ArrayList<>();
}

	•	Add the following methods:
	•	addStudent(Student student): Method to add a student to the list.
	•	addAllStudent(ArrayList<Student> students): Method to add multiple students to the list.
	•	deleteStudentWithId(int studentId): Method to remove the student with the given studentId from the list.
	•	searchStudentWithName(String firstName): Method to return the details of students with the specified firstName.
	•	getStudentWithId(int studentId): Method to return the student with the specified studentId.
	•	getAllStudents(): Method to return all students in the list.

Task 3:

	•	Create a class named StudentManagementTest with a main method.
	•	Create 10 Student objects with unique ids.

		Student student1 = new Student(1, "John", "Doe", 20, 'M');
		Student student2 = new Student(2, "Jane", "Doe", 22, 'F');
		Student student3 = new Student(3, "Alice", "Smith", 19, 'F');
		Student student4 = new Student(4, "Bob", "Brown", 21, 'M');
		Student student5 = new Student(5, "Charlie", "White", 23, 'M');
		Student student6 = new Student(6, "Diana", "Green", 20, 'F');
		Student student7 = new Student(7, "Eve", "Black", 22, 'F');
		Student student8 = new Student(8, "Frank", "Blue", 19, 'M');
		Student student9 = new Student(9, "Grace", "Yellow", 21, 'F');
		Student student10 = new Student(10, "Hank", "Pink", 23, 'M');

	•	Create a StudentManagement object and use it to add, remove, search for students, and print the details of specific students.
