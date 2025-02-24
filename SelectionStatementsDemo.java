public class Main {
    public static void main(String[] args) {
        // Declare student score inside the main method
        int studentScore = 82;

        // Check if the student passed the exam
        if (studentScore >= 60) {
            System.out.println("You passed the exam!");
        }

        // Check if the student performed excellently
        if (studentScore >= 90) {
            System.out.println("Excellent performance!");
        } else {
            System.out.println("Keep improving!");
        }

        // Determine the grade based on the score
        if (studentScore >= 60) {
            if (studentScore >= 90) {
                System.out.println("Grade: A");
            } else if (studentScore >= 75) {
                System.out.println("Grade: B");
            } else {
                System.out.println("Grade: C");
            }
        } else {
            System.out.println("Grade: F");
        }

        // Multi-way grade determination
        if (studentScore >= 90) {
            System.out.println("Multi-way Grade: A");
        } else if (studentScore >= 80) {
            System.out.println("Multi-way Grade: B");
        } else if (studentScore >= 70) {
            System.out.println("Multi-way Grade: C");
        } else if (studentScore >= 60) {
            System.out.println("Multi-way Grade: D");
        } else {
            System.out.println("Multi-way Grade: F");
        }
    }
}
