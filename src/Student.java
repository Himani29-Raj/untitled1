public class Student {
    private String name;
    private String Address;
    private int rollNo;
    public Student(String name,String Addr,int rn){
        this.name=name;
        this.Address=Addr;
        this.rollNo=rn;
    }
    public College getCollege(){
        College c=new College();
        c.setcName("RHL");
        c.setcAddress("West London");
        return c;
    }
    public Student getStudent(){
        return new Student("Anushka","London",301);
    }
    public String getName(){
        return name;
    }
    public String getAddress(){
        return Address;
    }
    public int getRollNumber(){
        return rollNo;
    }
    public void preForExam(){
        System.out.println("preparing for exam");
    }
}
class College{
  private String cName;
  private String cAddress;

  public void setcName(String cName){
      this.cName=cName;
  }
  public void setcAddress(String cAddress){
      this.cAddress=cAddress;
  }
  public String getcName(){
      return cName;
  }
  public String getcAddress(){
      return cAddress;
  }
}
class Tests{
    public static void main(String[] args) {
        Student st = new Student("Himani","India",102);

        College c = st.getCollege();
    }
}