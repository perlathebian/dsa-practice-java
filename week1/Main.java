import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // ex1
        ArrayList<Student> students = new ArrayList<>();
        Student student1 = new Student("John", 1, 3.0, "CS");
        Student student2 = new Student("Anne", 2, 3.5, "CSE");
        Student student3 = new Student("Rosa", 3, 4.0, "Med");
        Student student4 = new Student("Kai", 4, 1.3, "CS");
        Student student5 = new Student("Paul", 5, 2.0, "CS");

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        // ex2
        for(Student student: students){
            System.out.println(student);
        }

        // ex3
        Student topStudent = students.get(0);
        for (Student s : students) {
            if (s.getGpa() > topStudent.getGpa()) {
                topStudent = s;
            }
        }
        System.out.println("Top student: " + topStudent);

        // ex4
        try {
            student1.setGpa(5.0);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        // ex5
        for(Student s : students){
            if(s.isHonors()){
                System.out.println(s);
            }
        }

    }
}
