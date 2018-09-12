package week1;

public class Student {

    // TODO: khai báo các thuộc tính cho Student
    private String name;
    private String id;
    private String group;
    private String email;

    // TODO: khai báo các phương thức getter, setter cho Student
    public String getName() {return name;}

    public void setName(String s){name = s;}

    public String getId() { return id;}
    public void setId(String s) {id = s;}
    public String getGroup(){ return group;}
    public void setGroup (String s) {group = s;}
    public String getEmail(){return email;}
    public void setEmail(String s) {email = s;}

    /**
     * Constructor 1
     */
    Student() {
        // TODO:
        setName("Student");
        setId("000");
        setGroup("INT22041");
        setEmail("uet@vnu.edu.vn");

    }

    /**
     * Constructor 2
     * @param n
     * @param sid
     * @param em
     */
    Student(String n, String sid, String em) {
        // TODO:
        setName(n);
        setId(sid);
        setEmail(em);
        setGroup("INT22041");
    }

    /**
     * Constructor 3
     * @param s
     */
    Student(Student s) {
        // TODO:
        setName(s.getName());
        setId(s.getId());
        setGroup(s.getGroup());
        setEmail(s.getEmail());
    }

    String getInfo() {
        // TODO:
        System.out.println("Ten:" + name + "\n" + "MSSV: " + id + "\n" + "Nhom: "+ group + "\n" + "Email: " + email);
        return null; // xóa dòng này sau khi cài đặt
    }
}
