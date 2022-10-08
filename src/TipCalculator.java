public class TipCalculator {

    //instance variables
    private int numPeople;
    private int tipPercentage;
    private double totalBillBeforeTip;

    //constructor method for the TipCalculator class
    public TipCalculator(int numPeople, int tipPercentage){
        this.numPeople = numPeople;
        this.tipPercentage = tipPercentage;
        this.totalBillBeforeTip = 0;
    }

    //getter method that returns the totalBillBeforeTip instance variable
    public double getTotalBillBeforeTip(){
        return totalBillBeforeTip;
    }

    //getter method that returns the tipPercentage instance variable
    public int getTipPercentage(){
        return tipPercentage;
    }

    //method that increments totalBillBeforeTip by cost and returns no value
    public void addMeal(double cost){
        totalBillBeforeTip += cost;
    }

    //method that calculates and returns a double representing the total tip amount added to the bill
    public double tipAmount(){
        return (tipPercentage / 100.0) * totalBillBeforeTip;
    }

    //method that calculates and returns a double representing the group’s total bill including tip
    public double totalBill(){
        return totalBillBeforeTip + tipAmount();
    }

    //method that calculates and returns a double representing the per-person cost before tip
    public double perPersonCostBeforeTip(){
        return totalBillBeforeTip / numPeople;
    }

    //method that calculates and returns a double representing the per-person tip amount
    public double perPersonTipAmount(){
        return tipAmount()/numPeople;
    }

    //method that calculates and returns a double representing the total cost per person
    public double perPersonTotalCost(){
        return totalBill()/numPeople;
    }


}
