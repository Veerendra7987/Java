package pkg6pmjava;

public class Sportman { 
    String name, sport;
    
    void setsports(String name, String sport) {
        this.name = name;
        this.sport = sport;
    }        
    
    void getsports() {
        System.out.println("This is Name: " + name);
        System.out.println("He will play: " + sport);
    }
}
