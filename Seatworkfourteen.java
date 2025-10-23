import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Motorcycle m = new Motorcycle();

        System.out.print("Enter the make of the motorcycle: ");
        m.make = input.nextLine();

        System.out.print("Enter the color of the motorcycle: ");
        m.color = input.nextLine();

        System.out.println();
        System.out.println("Calling showAtts...");
        m.showAtts();
        System.out.println("-----");

        System.out.print("Do you want to start the engine? (yes/no): ");
        String answer = input.nextLine();

        if (answer.equalsIgnoreCase("yes")) {
            System.out.println("Starting engine...");
            m.startEngine();
        } else {
            System.out.println("Engine remains off.");
        }

        System.out.println("-----");
        System.out.println("Final motorcycle status:");
        m.showAtts();

        input.close();
    }
}

class Motorcycle {
    String make;
    String color;
    boolean engineState = false;

    void showAtts() {
        System.out.println("This motorcycle is a " + color + " " + make + ".");
        if (engineState) {
            System.out.println("The engine is on.");
        } else {
            System.out.println("The engine is off.");
        }
    }

    void startEngine() {
        if (engineState) {
            System.out.println("The engine is already on.");
        } else {
            engineState = true;
            System.out.println("The engine is now on.");
        }
    }
}
