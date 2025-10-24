import java.util.Scanner;

public class Seatwork15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Student info
        System.out.print("Enter Name: ");
        String name = input.nextLine();

        System.out.print("Enter Grade and Section: ");
        String gradeSection = input.nextLine();

        System.out.print("Enter Strand: ");
        String strand = input.nextLine();

        // Grades input
        System.out.print("Enter grade in Effective Communication: ");
        double comm = input.nextDouble();

        System.out.print("Enter grade in General Math: ");
        double math = input.nextDouble();

        System.out.print("Enter grade in Life Skills: ");
        double life = input.nextDouble();

        System.out.print("Enter grade in Pag-aaral sa Kasaysayan: ");
        double history = input.nextDouble();

        System.out.print("Enter grade in Programming: ");
        double prog = input.nextDouble();

        System.out.print("Enter grade in General Science: ");
        double science = input.nextDouble();

        // Compute average
        double average = (comm + math + life + history + prog + science) / 6;

        // Determine remarks
        String remarks;
        if (average >= 90) {
            remarks = "Excellent";
        } else if (average >= 85) {
            remarks = "Very Satisfactory";
        } else if (average >= 80) {
            remarks = "Satisfactory";
        } else if (average >= 75) {
            remarks = "Fairly Satisfactory";
        } else {
            remarks = "Did not meet expectations";
        }

        // Output
        System.out.println("\n=== STUDENT GRADE REPORT ===");
        System.out.println("Name: " + name);
        System.out.println("Grade & Section: " + gradeSection);
        System.out.println("Strand: " + strand);
        System.out.println("-----------------------------");
        System.out.println("Effective Communication: " + comm);
        System.out.println("General Math: " + math);
        System.out.println("Life Skills: " + life);
        System.out.println("Pag-aaral sa Kasaysayan: " + history);
        System.out.println("Programming: " + prog);
        System.out.println("General Science: " + science);
        System.out.println("-----------------------------");
        System.out.printf("Average: %.2f%n", average);
        System.out.println("Remarks: " + remarks);

        input.close();
    }
}
