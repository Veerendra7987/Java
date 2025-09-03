
package pkg6pmjava;

public class person {
    String name,address;
    int age;

    public person(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }

    public person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    person(person p)
    {
        this.name=p.name;
        this.address=p.address;
        this.age=p.age;
    }
    void show()
    {
        System.out.println("Name "+name);
        System.out.println("Address "+address);
        System.out.println("AGE "+age);
    }
   
    
}
