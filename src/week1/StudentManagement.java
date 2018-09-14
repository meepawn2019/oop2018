package week1;

public class StudentManagement {

    // TODO: khai báo thuộc tính students là array chứa các đối tượng thuộc lớp Student (max. 100)
    Student[] students = new Student[100];

    public boolean sameGroup(Student s1, Student s2) {
        // TODO:
        return s1.getGroup().equals(s2.getGroup());
    }
    int countStudents(){
      int i;
      for(i=0 ;i<students.length ; i++)
      {
        if(students[i] == null) break;
      }
      return i;
    }
    void studentsByGroup() {
        // TODO:
        int demSoLop=1;
        String[] soLop = new String[100];
        soLop[0] = students[0].getGroup();
        for(int i=1; i<countStudents(); i++)
        {
          int j;
          for(j=0; j<demSoLop; j++)
          {
            if(students[i].getGroup().equals(soLop[j])) break;
          }
          if(j == demSoLop)
          {
            demSoLop++;
            soLop[demSoLop - 1] = students[i].getGroup();
          }
        }
        for(int i=0; i<demSoLop; i++)
        {
          System.out.println("Sinh vien lop " + soLop[i] + ":");
          for(int j=0; j<countStudents(); j++)
          {
            if(students[j].getGroup().equals(soLop[i])) students[j].getInfo();
          }
        }
    }
    void removeStudent(String id) {
        // TODO:
        for(int i=0; i<countStudents(); i++)
        {
            if(id.equals(students[i].getGroup()))
            {
              for(int j=i; j<countStudents(); j++)
              {
                students[j] = students[j + 1];
              }
            }
        }
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
        //me.getInfo();
        Student t1 = new Student();
        //t1.getInfo();
        Student t2 = new Student("kael", "123", "cucshit@gmail.com");
        //t2.getInfo();
        Student t3 = new Student(t2);
        //t3.getInfo();
        Student t4 = new Student("meepawn" , "456" , "test@gmail.com");
        t4.setGroup("INT22043");
        StudentManagement a = new StudentManagement();
        if(a.sameGroup(t4, t1) == true) System.out.println("YES");
        else System.out.println("NO");
        if(a.sameGroup(t2, t1) == true) System.out.println("YES");
        else System.out.println("NO");
        a.students[0] = t1;
        a.students[1] = t2;
        a.students[2] = t4;
        a.studentsByGroup();
<<<<<<< HEAD
        a.removeStudent("123");
        System.out.println(a.students[1]);
=======
        a.removeStudent("INT22042");
>>>>>>> d65016bd32d2a37ae6584d8687819a0abae39e49
    }
}
