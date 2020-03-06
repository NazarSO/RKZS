package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Student p1 = new Student(1, "Fomin", "Nazar", "Ivanovich", "2000", "Address1", "098556345","Department 1", 4, "PK-4");
        Student p2 = new Student(2, "Fomka", "Ivan", "Ivanovich", "2000", "Address2", "098436345","Department 2", 2, "CV-2");
        Student p3 = new Student(3, "Forch", "Iurii", "Ivanovich", "2000", "Address3", "098256345","Department 3", 3, "KK-3");

        Student s[]= new Student[3];
        s[0]=p1;
        s[1]=p2;
        s[2]=p3;

        String UserDepartment, Group;
        int Year;

        System.out.print("Department - ");
        UserDepartment = in.nextLine();

        System.out.print("Year - ");
        Year = in.nextInt();

        System.out.print("Group - ");
        Group = in.nextLine();

        System.out.println("Students:\n");

        for(int i=0; i<3; i++) {
            if (s[i].Department == UserDepartment) {
                System.out.println(s[i].Surname + " "+ s[i].FirstName + " " + s[i].MiddleName);
            }
        }

        for(int i=0; i<3; i++){
            System.out.println(s[i].Surname + " " + s[i].FirstName + " " + s[i].MiddleName + " " + s[i].BirthdayYear
                    + " " + s[i].Address + " " + s[i].Phone + " " + s[i].Department + " " + s[i].Course + " " + s[i].Group);
        }

        for(int i=0; i<3; i++) {
            if (s[i].BirthdayYear >= Year) {
                System.out.println(s[i].Surname + " "+ s[i].FirstName + " " + s[i].MiddleName);
            }
        }

        for(int i=0; i<3; i++) {
            if (s[i].Group == Group) {
                System.out.println(s[i].Surname + " "+ s[i].FirstName + " " + s[i].MiddleName);
            }
        }
    }

    static class Student{
        int Id;
        String Surname, FirstName, MiddleName, Address,  Phone, Department, Group;
        int BirthdayYear, Course;

        protected Student(int id, String Surname, String FirstName, String MiddleName, String BirthdayYear, String Address,
                          String Phone, String Department, int Course, String Group) {
            Id=id;
            Surname = Surname;
            FirstName = FirstName;
            MiddleName = MiddleName;
            BirthdayYear = BirthdayYear;
            Address = Address;
            Phone = Phone;
            Department = Department;
            Course = Course;
            Group = Group;
        }

        protected Student() {}

    }

}
