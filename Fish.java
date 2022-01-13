/*
 *COMP 1020		SECTION A03
 *INSTRUCTOR:	Dr. Andrea Bunt
 *NAME:			Raj Rathod
 *ASSIGNMENT:	Assignment 3
 *QUESTION:		Phase 3
 *PURPOSE:		This program creates a hierarchy of classes to create a suitable output
 */
public class Fish {
    FishType type;
    double weight;
    int age;

    //constructor
    public Fish(FishType type, double weight, int age)
    {
        this.type = type;
        this.weight = weight;
        this.age = age;
    }
    //This is an accessor method for the variable weight
    public double getWeight(){
        return weight;
    }

    //This is an accessor method for the Object type
    public FishType getType(){
        return type;
    }

    //This is an accessor method for the variable age
    public int getAge(){
        return age;
    }

    //This method return a double which is calculated by simple multiplication
    public double getValue(){
        return weight * type.price;
    }

    //  *This function checks if the age variable is lower than getRestriction
    //  *This function uses if condition
    //  *This function checks if condition operation produces false or true
    //  *this return a boolean variable
    public boolean isValid()
    {
        boolean temp = true;
        if(age < type.getRestriction())
        {
            temp = false;
        }
        return temp;
    }

    //This return a String as this is a toString method
    public String toString()
    {
        String decimal = String.format("%.02f", weight);        //this makes sure there are only two decimal places
        String value = String.format("%.02f", getValue());
        String restriction;
        if(!isValid())                                                              //checks the condition
        {
            restriction = "We should release this fish";
        }
        else
        {
            restriction = "This is a legal catch";
        }
        return type.getDescription() + decimal+ " pounds" + " ($" + value +"), " + restriction;
    }
    //  *This function checks many condition in order to check if two object are equal or not
    //  *This function uses boolean operators
    //  *This function checks if boolean operation produces false or true
    //  *this return a boolean variable
    public boolean equals(Fish obj) {
        return obj.type.equals(this.type) && (this.weight - obj.weight) < 0.01 && obj.isValid() == this.isValid();
    }
}
