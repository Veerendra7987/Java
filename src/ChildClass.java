package pkg6pmjava;

public class cricketer extends Sportman {
    int wkts, runs;
    
    void setcricketer(int wkts, int runs) {
        this.wkts = wkts;
        this.runs = runs;
    }
    
    void getcricketer() {
        System.out.println("Wickets: " + wkts);
        System.out.println("Runs: " + runs);
    }
}
