package week1;
import java.util.Scanner;

public class StudentManagement {

    // TODO: khai báo thuộc tính students là array chứa các đối tượng thuộc lớp Student (max. 100)
    Student[] students = new Student[100];

    public boolean sameGroup(Student s1, Student s2) {
        // TODO:
        if(s1.getGroup()== s2.getGroup()) return true;
        else return false;
    }

    void studentsByGroup() {
        // TODO:
      }


    void removeStudent(String id) {
        // TODO:
    }

    public static void main(String[] args) {
        // TODO:
        Student me = new Student();
        me.setName("huy");
        me.setId("17020805");
        me.setGroup("1");
        me.setEmail("meepawn2018");
        String ten;
        ten = me.getName();
        System.out.println(ten);
        me.getInfo();
        Student t1 = new Student();
        t1.getInfo();
        Student t2 = new Student("kael", "123", "cucshit@gmail.com");
        t2.getInfo();
        Student t3 = new Student(t2);
        t3.getInfo();
        Student t4 = new Student();
        t4.setGroup("INT22042");
        StudentManagement a = new StudentManagement();
        if(a.sameGroup(t4, t1) == true) System.out.println("YES");
        else System.out.println("NO");
        if(a.sameGroup(t2, t1) == true) System.out.println("YES");
        else System.out.println("NO");
        a.students[0] = t1;
        a.students[1] = t2;
        a.students[2] = t3;
        a.studentsByGroup();

    }
}
