import java.util.Scanner;
import java.text.DecimalFormat;

public class TipCalculator {
   /*

    Your TipCalculator class should have the following methods that calculate and return the values described below; you should RETURN all values
    -- do not add print statements in your TipCalculator class, all printing should be handled by the code in your main method (as we will learn later,
    it's best practice to have your program's "logic" in one class, and input/output in another):

getTotalBillBeforeTip():  getter method that returns the totalBillBeforeTip instance variable
getTipPercentage():  getter method that returns the tipPercentage instance variable
addMeal(double cost): method that increments totalBillBeforeTip by cost and returns no value
tipAmount(): method that calculates and returns a double representing the total tip amount added to the bill
totalBill(): method that calculates and returns a double representing the group’s total bill including tip
perPersonCostBeforeTip(): method that calculates and returns a double representing the per person cost before tip
perPersonTipAmount(): method that calculates and returns a double representing the per person tip amount
perPersonTotalCost(): method that calculates and returns a double representing the total cost per person

    */
    private int numPeople;
    private int tipPercentage;
    //new comment
    private double totalBillBeforeTip;

    public TipCalculator(int numPeople, int tipPercentage){
        this.numPeople = numPeople;
        this.tipPercentage = tipPercentage;
        totalBillBeforeTip = 0;
    }

    //getter method for totalBillBeforeTip
    public double getTotalBillBeforeTip(){
        return totalBillBeforeTip;
    }

}
