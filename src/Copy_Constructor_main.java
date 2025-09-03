
package pkg6pmjava;

public class personMain {

    public static void main(String[] args) {
        
       person p1=new person("Mr. A","Sagar",20);
       person p2=new person(p1);
       p1.show();
       p2.show();
        
    }
    
}
