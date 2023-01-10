import java.util.Scanner;

public class Prog2_MarkSheet {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //Create scanner class object

        //Input student information
        System.out.println("Enter student name: ");
        String name = sc.nextLine();

        System.out.println("Enter roll number: ");
        String rollNo = sc.nextLine();

        System.out.println("Enter Student Marks for Math, Science, and English (0-100): ");
        int math = sc.nextInt();
        int science = sc.nextInt();
        int english = sc.nextInt();


        //While loop to validate inputs
        while (math < 0 || math > 100 || science < 0 || science > 100 || english < 0 || english > 100 ) {
            System.out.println("Invalid Input, Marks should be between 0 and 100"); //validate correct input
            System.out.println("Enter Marks for Math, Science, English"); // tell user to enter inputs per subject

            //store data per input
            math = sc.nextInt();
            science = sc.nextInt();
            english = sc.nextInt();
        }

        // Calculate total and percentage
        int totalMarks = math + science + english;
        double percentage = (totalMarks / 300.0) * 100;

        // Determine if the student passed or failed
        String result;
        if (percentage >= 35) {
            result = "Pass";
        } else {
            result = "Fail";
        }

        // Determine the grade
        String grade;
        if (percentage >= 80) {
            grade = "A+";
        } else if (percentage >= 60) {
            grade = "A";
        } else if (percentage >= 50) {
            grade = "B";
        } else if (percentage >= 35) {
            grade = "C";
        } else {
            grade = "";
        }

        // Print the mark sheet
        System.out.println("--- Mark Sheet ---");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Math: " + math);
        System.out.println("Science: " + science);
        System.out.println("English: " + english);
        System.out.println("Total: " + totalMarks);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Result: " + result);
        if (grade.length() > 0) {
            System.out.println("Grade: " + grade);
        }
    }


}
