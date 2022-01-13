/*
 *COMP 1020		SECTION A03
 *INSTRUCTOR:	Dr. Andrea Bunt
 *NAME:			Raj Rathod
 *ASSIGNMENT:	Assignment 3
 *QUESTION:		Phase 3
 *PURPOSE:		This program creates a hierarchy of classes to create a suitable output
 */
public class SportFisher extends RecreationalFisher{            //This is a child class of the parent class RecreationalFisher

    double totalWeight;

    //constructor
    public SportFisher(String name, int limit)
    {
        super(name,limit);
        totalWeight = 0;
    }

    public void fishCaught(Fish obj)
    {

        totalWeight += obj.weight;
        super.fishCaught(obj);                  //super class object is called
    }

    public double getTotalWeight()
    {
        return totalWeight;
    }

    public String toString()
    {
        return super.toString() + "\nthis Fisher has caught: " + totalWeight +" pounds of fish";
    }

    public String describeLatestTrip()
    {
        return super.trip.toString() + "\nThat's " + String.format("%.02f", super.trip.getTotalWeight()) + " pounds of fish!";      //FishingTrip method is called here by using super
    }
}
