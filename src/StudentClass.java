package pkg6pmjava;

public class New1 {
    String sname,gender;
    int mobileno;
    
    void New(String sname,String gender,int mobileno)
    {
        this.sname=sname;
        this.gender=gender;
        this.mobileno=mobileno;
    }
    
    void getnew()
    {
        System.out.println("Student Name "+sname);
        System.out.println("Student Gender "+gender);
        System.out.println("Student  Mobile "+mobileno);
    }
    
}
