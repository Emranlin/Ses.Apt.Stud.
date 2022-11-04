import java.sql.SQLOutput;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Apartment apartment1 = new Apartment();
        apartment1.setName("House");
        apartment1.setPrice(35000);
        apartment1.setAddress("Baba-Ata21");

        Apartment apartment2 = new Apartment();
        apartment2.setName("Flat");
        apartment2.setPrice(45000);
        apartment2.setAddress("Kalyk Akiev 46");


        Student student1 = new Student();
        student1.setFullName("Abdrazakova Aylin");
        student1.setPhoneNumber(124578);
        student1.setAddress("Kalyk Akiev 46");
        student1.setBankAccount(60000);

        Student student2 = new Student();
        student2.setFullName("Asanova Gulnur");
        student2.setPhoneNumber(80000);
        student2.setAddress("Baba-Ata21");
        student2.setBankAccount(60000);

        Student student3 = new Student();
        student3.setFullName("Atamkulova Aida");
        student3.setPhoneNumber(122475);
        student3.setAddress("Kalyk Akiev 46");
        student3.setBankAccount(120000);

        Student student4 = new Student();
        student4.setFullName("Jalilova Baktygul");
        student4.setPhoneNumber(116654665);
        student4.setAddress("Baba-Ata21");
        student4.setBankAccount(200000);

        Student student5 = new Student();
        student5.setFullName("Abdu kyzy Aigerim");
        student5.setPhoneNumber(1235640);
        student5.setAddress("Baba-Ata21");
        student5.setBankAccount(500000);

        Student student6 = new Student();
        student6.setFullName("Kutmanova Saikal");
        student6.setPhoneNumber(124578);
        student6.setAddress("Kalyk Akiev 46");
        student6.setBankAccount(700000);

        Student[] students = {student1, student2, student3, student4, student5, student6};
        Apartment[] apartments = {apartment1, apartment2};
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Choose your option: 1.Find by Address. 2. Pay/Month 3. Live In 4. Change Info. :: ");
            int input = new Scanner(System.in).nextInt();
            if (input == 1) {
                System.out.print("Enter a house type: ");
                separateStudent(scanner.nextLine(),students,apartments);
            }

            else if (input == 2) {
                System.out.print("Enter your house type : ");
                String title = new Scanner(System.in).nextLine();
                if (title.equals("House")) {
                    System.out.println(apartment1.payPerMonth(students));
                } else if (title.equals("Flat")) {
                    System.out.println(apartment2.payPerMonth(students));
                }
            }

            else if (input == 3) {
                String fullName = new Scanner(System.in).nextLine();
                for (Student st : students) {
                    if (st.getFullName().equals(fullName)) {
                        st.liveIn(students, apartments);
                        break;

                    }
                }
            }
            else if (input == 4) {
                System.out.print("Enter a student fullName : ");
                String fullName = new Scanner(System.in).nextLine();
                for (Student student : students) {
                    if (student.getFullName().equals(fullName)) {
                        student.changeInfo();
                        break;
                    }
                }
            } else {
                System.out.println("It's wrong!");
                break;
            }
        }
    }
        public static void separateStudent(String title , Student[] students, Apartment[] apartments){
            for (Apartment apartment : apartments) {
                if (Objects.equals(apartment.getName(), title)) {
                    apartment.getInfo();
                    System.out.println();
                }
            }
            for (Student student : students) {
                for (Apartment apartment : apartments) {
                    if ((Objects.equals(apartment.getName(), title) && Objects.equals(apartment.getAddress(), student.getAddress()))) {
                        student.getInfo();
                        System.out.println();
                    }


                }
            }
        }
    private static void separateStudent(Student[] students, Apartment[] apartments, String nextLine) {
    }
}

