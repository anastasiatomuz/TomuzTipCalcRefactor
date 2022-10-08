import java.util.Scanner;
import java.text.DecimalFormat;

public class TipCalculatorRunner {
    public static void main(String[] args){
        //set ups
        Scanner scan = new Scanner(System.in);
        DecimalFormat formatter = new DecimalFormat("#.##");

        //intro stuff
        System.out.println("Welcome to the tip calculator");
        System.out.print("How many people are in your group? ");
        int numPeople = scan.nextInt();
        scan.nextLine();
        System.out.print("What's the tip percentage? (0-100): ");
        int tipPercentage = scan.nextInt();
        scan.nextLine();
        //creates an instance of the TipCalculator class
        TipCalculator calc = new TipCalculator(numPeople, tipPercentage);


        //prompts user to enter one item cost
        System.out.print("Enter a cost in dollar and cent, e.g. 12.50 (-1 to end): ");
        double newItem = scan.nextDouble();
        scan.nextLine();
        calc.addMeal(newItem); //adds cost of item to total cost

        //loop for user to put in item costs
        while (newItem != -1){
            System.out.print("Enter a cost in dollar and cent, e.g. 12.50 (-1 to end): ");
            newItem = scan.nextDouble();
            scan.nextLine();
            //if the user doesn't indicate that they're done, add the cost of the new item
            if (newItem != -1){
                calc.addMeal(newItem);
            }
        }


        //formatting
        String formatBillNoTip = formatter.format(calc.getTotalBillBeforeTip());
        String formatTipAmount = formatter.format(calc.tipAmount());
        String formatBillWithTip = formatter.format(calc.totalBill());
        String formatPerPersonNoTip = formatter.format(calc.perPersonCostBeforeTip());
        String formatTipPerPerson = formatter.format(calc.perPersonTipAmount());
        String formatPersonWithTip = formatter.format(calc.perPersonTotalCost());


        //printing information
        System.out.println("Total Bill Before Tip: " + formatBillNoTip);
        System.out.println("Tip Percentage: " + calc.getTipPercentage());
        System.out.println("Total Tip: " + formatTipAmount);
        System.out.println("Total Bill with Tip: " + formatBillWithTip);
        System.out.println("Per Person Cost Before Tip: " + formatPerPersonNoTip);
        System.out.println("Tip Per Person: " + formatTipPerPerson);
        System.out.println("Total Cost Per Person: " + formatPersonWithTip);


    }
}
