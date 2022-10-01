package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void sayHelloWorld(){
        // input your solution here
        System.out.println("Hello World!");
    }

    //todo Task 2
    public void helloRobot(){
        // input your solution here
        System.out.println("0123456789012345678901\n"+
                "         __\n"+
                " _(\\    |@@|\n"+
                "(__/\\__ \\--/ __\n"+
                "   \\___|----|  |   __\n"+
                "       \\ }{ /\\ )_ / _\\\n"+
                "       /\\__/\\ \\__O (__\n"+
                "      (--/\\--)    \\__/\n"+
                "      _)(  )(_\n"+
                "     `---''---`");
    }

    //todo Task 3
    public void sumOfLiterals(){
        // input your solution here
        char z = 'Z';
        int hexa = 0xface;
        int a = 012;
        long l = 80L;
        float f =  44e-1f;
        float f2 =  5.5f;
        double d = 8.88e1;
        double d2 = 99.9;

        int sum = z + hexa + a + (int)l + (int)f + (int)f2 + (int)d + (int)d2;

        System.out.println(sum);
    }

    //todo Task 4
    public void addTwoNumbers(){
        // input your solution here
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();

        int sum = a+b;

        System.out.println(sum);
    }

    //todo Task 5
    public void swapTwoNumbers(){
        // input your solution here

        Scanner input1 = new Scanner(System.in);
        System.out.print("Before Swap:\n" + "x: y: ");

        int x = input1.nextInt();
        int y = input1.nextInt();

        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println("After Swap:\n" + "x: " + x + "\n" + "y: " + y);
    }

    //todo Task 6
    public void compareTwoNumbers(){
        // input your solution here
        Scanner input = new Scanner(System.in);
        System.out.print("n1: n2: ");
        int n1 = input.nextInt();
        int n2 = input.nextInt();

        if(n1>n2){
            System.out.println("n1 > n2");
        }
        if(n2>n1){
            System.out.println("n2 > n1");
        }
        if(n1==n2){
            System.out.println("n1 == n2");
        }

    }

    //todo Task 7
    public void ratingSalesPerson(){
        // input your solution here
        Scanner input = new Scanner(System.in);

        System.out.print("Enter annual Revenue: ");
        int x = input.nextInt();

        if (x>= 100000 || x< 0 ){
            System.out.println("Invalid Revenue");
        }
        if (x>= 0 && x < 20000){
            System.out.println("Poor Sales Revenue");
        }
        if (x>= 20000 && x < 50000){
            System.out.println("Average Sales Revenue");
        }

        if (x>= 50000 && x < 80000){
            System.out.println("Good Sales Revenue");
        }

        if (x>= 80000 && x < 100000){
            System.out.println("Excellent Sales Revenue");
        }

    }

    //todo Task 8
    public void getCommissionRate(){
        // input your solution here
        Scanner input = new Scanner(System.in);

        System.out.print("Enter CommissionClass: ");
        int x = input.nextInt();

        switch(x){
            case 1:
                System.out.println("Your Commission Rate was set to 0.01");
                break;
            case 2:
                System.out.println("Your Commission Rate was set to 0.02");
                break;
            case 3:
                System.out.println("Your Commission Rate was set to 0.03");
                break;
            case 4:
                System.out.println("Your Commission Rate was set to 0.04");
                break;
            default:
                System.out.println("Your Commission Rate was set to 0.0");

        }


    }

    //todo Task 9
    public void leapyear(){
        // input your solution here
        Scanner input = new Scanner(System.in);
        System.out.print("Year: ");
        int x = input.nextInt();

        int y = x%4;
        int z = x%100;
        int w = x%400;
        int count = 0;

        if  (y == 0 && w == 0){
            count = +1;
            System.out.println("Leapyear");
        }
        if (z == 0 && w != 0){
            count = +1;
            System.out.println("Not a Leapyear");
        }
        if (count == 0){
            System.out.println("Not a Leapyear");
        }


    }

    //todo Task 10
    public void transposedNumbers(){
        // input your solution here
        Scanner input = new Scanner(System.in);
        System.out.print("Number: ");
        int zahl = input.nextInt();
        int xzahl = 0;
        xzahl = zahl;
        int count = 0;
        int fakt = 1;
        int ergebnis = 0;

        while(xzahl != 0){
            xzahl = xzahl/10;
            count++;
        }

        if (count > 0 && count <4){
            for (int i = 1; i < count; i++){
                fakt = fakt * 10;
            }

            xzahl = zahl;
            while (xzahl != 0){
                ergebnis = xzahl % 10 * fakt + ergebnis;
                xzahl = xzahl / 10;
                fakt = fakt / 10;
            }
            System.out.println(ergebnis);
        }


    }


    public static void main(String[] args){
        App exercise1 = new App();

        System.out.println("Task 1: Say Hello World");
        exercise1.sayHelloWorld();

        System.out.println("\nTask 2: Hello Robot");
        exercise1.helloRobot();

        System.out.println("\nTask 3: Literals");
        exercise1.sumOfLiterals();

        System.out.println("\nTask 4: Add two Numbers");
        exercise1.addTwoNumbers();

        System.out.println("\nTask 5: Swap two Numbers without using a helper variable");
        exercise1.swapTwoNumbers();

        System.out.println("\nTask 6: Compare two Numbers");
        exercise1.compareTwoNumbers();

        System.out.println("\nTask 7: Rating Sales Person");
        exercise1.ratingSalesPerson();

        System.out.println("\nTask 8: Commission Rate");
        exercise1.getCommissionRate();

        System.out.println("\nTask 9: Leapyear");
        exercise1.leapyear();

        System.out.println("\nTask 10: Transposed Numbers");
        exercise1.transposedNumbers();
    }
}