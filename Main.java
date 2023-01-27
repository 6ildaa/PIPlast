package main;

public class Main {

    public static void main(String[] args) {

        // Zadanie 1

        Student student1 = new Student();
        Student student2 = new Student();
        student1.name = "Bartlomiej Bilda";

        System.out.println(student1.name);
        System.out.println(student2.name);

        student1.id = 3;
        student2.id = 5;

        System.out.println(student1.id);
        System.out.println(student2.id);

        // Zadanie 2

        System.out.println();
        SecretStudent secretStudent = new SecretStudent();

        System.out.println(secretStudent.getName());
        System.out.println(secretStudent.getLastName());
        System.out.println(secretStudent.getId());

        // Zadanie 3
        secretStudent.setName("");
        System.out.println(secretStudent.getName());

        secretStudent.setName("Dariusz");
        System.out.println(secretStudent.getName());

    }
}