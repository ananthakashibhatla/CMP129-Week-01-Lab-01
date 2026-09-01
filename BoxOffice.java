import java.util.Scanner;

public class BoxOffice {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        
        System.out.println("What is the name of the movie? ");
        String movieInput =  userInput.nextLine(); 

        System.out.println("How many adult tickets were sold? ");
        int adultTickets = userInput.nextInt(); 

        System.out.println("How many child tickets were sold? ");
        int childTickets = userInput.nextInt(); 

        double adultProfits = 10.00 * adultTickets;
        double childProfits = 6.00 * childTickets;

        double totalProfits = adultProfits + childProfits;

        double theaterProfits = 0.20 * totalProfits;

        double distributorProfits = totalProfits - theaterProfits;

        System.out.println("Movie Name: " + movieInput);
        System.out.println("Adult Tickets Sold: " + adultTickets);
        System.out.println("Child Tickets Sold: " + childTickets);
        System.out.println("Gross Box Office Profit: " + totalProfits);
        System.out.println("Net Box Office Profit: " + theaterProfits);
        System.out.println("Amount Paid to Distributor: " + distributorProfits);

    }
    
}
