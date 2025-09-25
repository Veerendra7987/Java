
package pkg6pmjava;

import java.util.Scanner;

class Add {
    int a;
    int b;
    int c;

    void getInput() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        a = sc.nextInt();

        System.out.print("Enter second number: ");
        b = sc.nextInt();

        System.out.print("Enter third number: ");
        c = sc.nextInt();
    }

    int sum() {
        return a + b + c;
    }

    public static void main(String[] args) {
        Add obj = new Add();
        obj.getInput();  
        System.out.println("Sum = " + obj.sum());
    }
}

