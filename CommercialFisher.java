/*
 *COMP 1020		SECTION A03
 *INSTRUCTOR:	Dr. Andrea Bunt
 *NAME:			Raj Rathod
 *ASSIGNMENT:	Assignment 3
 *QUESTION:		Phase 3
 *PURPOSE:		This program creates a hierarchy of classes to create a suitable output
 */
public class CommercialFisher extends Fisher{
    double totalValue;

    //constructor
    public CommercialFisher(String name, int limit)
    {
        super(name,limit);              //parent class constructor is called
        totalValue = 0;
    }

    public double getTotalValue()
    {
        return totalValue;
    }

    public void fishCaught(Fish obj) {
        totalValue += obj.getValue();
    }

    public String toString()
    {
        return super.toString() + "\nIn total, this Fisher has caught: $" + String.format("%.02f", getTotalValue()) + " worth of fish.";    //super class toString is used
    }

    public String describeLatestTrip()
    {
        return "The latest Fishing Expedition resulted in $" + String.format("%.02f", super.trip.getTotalValue())+ " in profits";   //super class method is used.
    }
}
