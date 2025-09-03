public class College {
    String cname;
    int nos,nof;
    
    
    College(String cname,int nos,int nof)
    {
        this.cname=cname;
        this.nos=nos;
        this.nof=nof;
    }
    void GetCollege()
    {
        System.out.println("Name Of The College "+cname);
        System.out.println("No. Of Student "+nos);
        System.out.println("No. of Faculties"+nof);
    }
    
}
