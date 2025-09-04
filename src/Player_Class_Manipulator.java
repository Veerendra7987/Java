package pkg6pmjava;

public class Player {
    
    int jerseyno,matches,runs;
    String name;
    
    void SetPlayer(int jerseyno,int matches,int runs,String name)
    {
        this.jerseyno=jerseyno;
        this.matches=matches;
        this.runs=runs;
        this.name=name;
    }
    void GetPlayer()
    {
        System.out.println("Jerse No. "+jerseyno);
        System.out.println("Player Of Matches "+matches);
        System.out.println("Runs "+runs);
        System.out.println("Name of Player "+name);
    }
    
   void avg()
   {
       int avg=runs/matches;
       if (avg<40)
           System.out.println("High Average");
       else
           System.out.println("Low Average");
   }
    
}
