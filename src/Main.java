import java.time.LocalDate;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[10];
        students[0] = new Student("Айдан", "Абдрахманова", Gender.FEMALE, LocalDate.of(2022, 9, 1), new School("Ош №5", "Кыргызстан", LocalDate.of(1980, 1, 1)));displayStudentInfo(students);
    }

    public static void displayStudentInfo(Student[] students) {
        for (Student student : students) {
            System.out.println("Аты-жөнү: " + student.getName() + " " + student.getSurname());
            System.out.println("Жынысы: " + student.getGender());
            System.out.println("Окуган мекемеси: " + student.getEducationCenter().name);
            System.out.println("Окуган күнү: " + student.getDateOfStart());
            System.out.println();
        }
    }

    }
