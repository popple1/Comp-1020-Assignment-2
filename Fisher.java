/*
 *COMP 1020		SECTION A03
 *INSTRUCTOR:	Dr. Andrea Bunt
 *NAME:			Raj Rathod
 *ASSIGNMENT:	Assignment 3
 *QUESTION:		Phase 3
 *PURPOSE:		This program creates a hierarchy of classes to create a suitable output
 */
public abstract class Fisher {      //abstract class
    String name;
    int limit;
    FishingTrip trip;


    //constructor
    public Fisher(String name, int limit)
    {
        this.name = name;
        this.limit = limit;
        this.trip = null;
    }

    //This method is an accessor method for the name variable
    public String getName()
    {
        return name;
    }

    //This method is an accessor method for the limit variable
    public int getLimit()
    {
        return limit;
    }

    //This method is an accessor method for the trip Object
    public FishingTrip getTrip()
    {
        return trip;
    }


    public void setTrip(FishingTrip set)
    {
        trip = set;
    }

    //abstract methof
    abstract public void fishCaught(Fish obj);

    public String toString()
    {
        return name + " limited to "+ limit + " fish \nLatest Trip: " + trip;
    }

    //abstact method
    abstract String describeLatestTrip();

    //  *This function checks many condition in order to check if two object are equal or not
    //  *This function uses boolean operators
    //  *This function checks if boolean operation produces false or true
    //  *this return a boolean variable
    public boolean equals(Fisher obj)
    {
        return name.equals(obj.name) && limit == obj.limit;
    }

}
