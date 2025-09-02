package task3;
import java.io.*;

public class Main {
    private final static String FILENAME = "enrollment.dat";

    public static void main(String[] args) {
        File f = new File(FILENAME);
        // Create instances of Student, Course, and Enrollment
        Student student = new Student(1, "Nguyen Van A", 18);
        Course course = new Course("C101", "Java", "ABC");
        Enrollment enrollment = new Enrollment(student, course, "01.01.2025");

        // Serialize and save the Enrollment instance
        if (f.exists() && f.isFile()) {
            try (FileInputStream inputstream = new FileInputStream(FILENAME);
                 ObjectInputStream objects = new ObjectInputStream(inputstream);
            ) {
                enrollment = (Enrollment) objects.readObject();
            } catch (Exception e) {
                System.err.println("Reading enrollment: " + e);
            }
        } else {
            // there are no stored object state, let's create an object
            student = new Student(1, "Nguyen Van A", 18);
            course = new Course("C101", "Java", "ABC");
            enrollment = new Enrollment(student, course, "01.01.2025");
            try (
                    FileOutputStream outputstream = new FileOutputStream(FILENAME);
                    ObjectOutputStream objects = new ObjectOutputStream(outputstream);
            ) {
                objects.writeObject(enrollment);
            } catch (Exception e) {
                System.err.println("Writing enrollment: " + e);
            }
        }
        System.out.println("Enrollment: " + enrollment);

        // Deserialize and print the Enrollment instance
        try (FileInputStream inputstream = new FileInputStream(FILENAME);
             ObjectInputStream objects = new ObjectInputStream(inputstream);
        ) {
            Enrollment deserializedEnrollment = (Enrollment) objects.readObject();
            System.out.println("Deserialized Enrollment object:");
            System.out.println(deserializedEnrollment);
        } catch (Exception e) {
            System.err.println("Deserialization error:  " + e);
        }
    }
    }




