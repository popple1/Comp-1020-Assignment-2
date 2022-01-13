/*
 *COMP 1020		SECTION A03
 *INSTRUCTOR:	Dr. Andrea Bunt
 *NAME:			Raj Rathod
 *ASSIGNMENT:	Assignment 3
 *QUESTION:		Phase 3
 *PURPOSE:		This program creates a hierarchy of classes to create a suitable output
 */
public class RecreationalFisher extends Fisher{         //this is a child class of the class Fisher
    int grandTotal;

    //constructor
    public RecreationalFisher(String name)
    {
        super(name,0);
        grandTotal = 0;
    }

    public RecreationalFisher(String name, int limit)
    {
        super(name,limit);              //calls the constructor of the parent class
    }

    public void fishCaught(Fish obj)
    {
        grandTotal++;
    }

    public int getGrandTotal()
    {
        return grandTotal;
    }

    public String toString()
    {
        return super.toString() + ".\nIn total, this fisher has caught: " + getGrandTotal() + " fish.";
    }

    //this function returns the toString method from FishingTrip class
    public String describeLatestTrip()
    {
        return super.trip.toString();
    }
}
