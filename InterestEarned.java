import java.util.Scanner; 

public class InterestEarned {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Please enter the principal amount: ");
        double principalInput = userInput.nextDouble(); 

        System.out.println("Please enter the annual interest rate: ");
        double rateInput = userInput.nextDouble(); 

        System.out.println("Please enter the number of times interest is compounded during the year");
        int compoundTimesInput = userInput.nextInt(); 

        double halfSolution = (1 + rateInput/compoundTimesInput);

        double exponentialFragment = Math.pow(halfSolution, compoundTimesInput);

        double finalSolution = principalInput * exponentialFragment;

        System.out.println("Interest Rate: " + rateInput);
        System.out.println("Times Compounded: " + compoundTimesInput);
        System.out.println("Principal: " + principalInput);
        System.out.println("Interest Earned: " + exponentialFragment);
        System.out.println("Amount in Savings: " + finalSolution);
    }
}
