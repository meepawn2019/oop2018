package week2.task3;

public class Task3 {
  class Human{
    private String name;
    private int age;
    private String gender;

    void setName(String id){name = id;}
    String getName(){return name;}

    void setAge(int a){age = a;}
    int getAge(){return age;}

    void setGender(String id){gender = id;}
    String getGender(){return gender;}

    void areAdult(){
      if(this.age > 18) System.out.println("Toi la nguoi lon");
      else System.out.println("Toi chua du 18 tuoi");
    }

    void areABoy(){
      if(this.genger.equals("Male") || this.gender.equals("male")) System.out.println("Toi la con trai");
      else System.out.println("Toi khong phai con trai");
    }

    void hoiTen(){
      System.out.println("Ten toi la: " + this.name);
    }
  }

  class Dog{
    private String name;
    private int age;
    private int weight;

    void setName(String id){name = id;}
    String getName(){return name;}
    void setAge(int a){age = a;}
    int getAge(){return age;}
    void setWeight(int a){weight = a;}
    int getWeight(){return weight;}

    void sua(){
      System.out.println("Woof Woof");
    }

    

  }


}

//TODO: khai báo 3 class tương ứng với 3 đối tượng thực tế ở dưới
