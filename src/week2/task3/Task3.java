package week2.task3;

public class Task3 {
  public class Human{
    private String name;
    private int age;
    private String gender;

    public void setName(String id){name = id;}
    public String getName(){return name;}

    public void setAge(int a){age = a;}
    public int getAge(){return age;}

    public void setGender(String id){gender = id;}
    public String getGender(){return gender;}

    public void areAdult(){
      if(this.age > 18) System.out.println("Toi la nguoi lon");
      else System.out.println("Toi chua du 18 tuoi");
    }

    public void areABoy(){
      if(this.gender.equals("Male") || this.gender.equals("male")) System.out.println("Toi la con trai");
      else System.out.println("Toi khong phai con trai");
    }

    public void hoiTen(){
      System.out.println("Ten toi la: " + this.name);
    }
  }

  public class Bike{
    private String name;
    private int speed;
    private boolean status;

    public void setName(String id){this.name = id;}
    public String getName(){return this.name;}
    public void setSpeed(int a){this.speed = a;}
    public int getSpeed(){return this.speed;}
    public void setStatus(boolean a){this.status = a;}
    public boolean getStatus(){return status;}

    public boolean isUseable(){
      return this.status;
    }

    public void speedUp(int tocDo){
      this.speed+=tocDo;
    }

    public void slowDown(int tocDo){
      this.speed-=tocDo;
    }

  }

  public class Book{
    private String title;
    private int pages;
    private int currentPage = 0;

    public void setTitle(String id){title = id;}
    public String getTitle(){return title;}
    public void setPages(int a){pages = a;}
    public int getPages(){return pages;}
    public void setCurrentPage(int a){currentPage = a;}
    public int getCurrentPage(){return currentPage;}

    public boolean isEnd(){
      if(currentPage == pages) return true;
      else return false;
    }
    public void nextPage(){
      this.currentPage++;
    }
    public void whatTitle(){
      System.out.println("The book title is: " + this.title);
    }
  }

  public static void main(String[] args){
    Human a = new Task3().new Human();
    a.setName("Huy");
    a.setAge(19);
    a.setGender("Male");
    a.hoiTen();
    a.areABoy();
    a.areAdult();
    Book b = new Task3().new Book();
    b.setTitle("The ABC Murderer");
    b.setPages(200);
    b.whatTitle();
    b.setCurrentPage(102);
    b.nextPage();
    if(b.isEnd()) System.out.println("Da Het");
    else System.out.println("Chua het");
    System.out.println(b.getCurrentPage());
    Bike c = new Task3().new Bike();
    c.setName("Honda");
    c.setSpeed(30);
    c.setStatus(true);
    if(c.isUseable()) System.out.println("Chua hong");
    else System.out.println("Da Hong");
    c.speedUp(10);
    System.out.println(c.getSpeed());
    c.slowDown(10);
    System.out.println(c.getSpeed());
  }
}

//TODO: khai báo 3 class tương ứng với 3 đối tượng thực tế ở dưới
