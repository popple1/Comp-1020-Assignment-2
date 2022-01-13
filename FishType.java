/*
 *COMP 1020		SECTION A03
 *INSTRUCTOR:	Dr. Andrea Bunt
 *NAME:			Raj Rathod
 *ASSIGNMENT:	Assignment 3
 *QUESTION:		Phase 3
 *PURPOSE:		This program creates a hierarchy of classes to create a suitable output
 */
public class FishType {

    //instance variable
    String name;
    String rarity;
    double price;
    int restriction;

    //constructor
    public FishType(String name, String rarity, double pricePerPound, int restriction)
    {
        this.name = name;
        this.rarity = rarity;
        this.price = pricePerPound;
        this.restriction = restriction;
    }
    //This method is an accessor method for the rarity variable
    public String getRarity()
    {
        return rarity;
    }

    //This method is an accessor method for the price variable
    public double getPrice()
    {
        return price;
    }

    //THis method is an accessor method for the restriction variable
    public int getRestriction() {
        return restriction;
    }

    //This method is an mutator method for the variable price
    public void changePrice(double change)
    {
        price = change;
    }

    //This method return the specific String
    public String getDescription() {
        String temp = name + " (" + rarity + ") ";
        return temp;
    }

    //This method returns a string as it is a ToString method
    public String toString() {
        String decimal = String.format("%.02f", price);
        return name + " (" + rarity + ") $" + decimal + " (" + restriction +")";
    }

    //  *This function checks many condition in order to check if two object are equal or not
    //  *This function uses boolean operators
    //  *This function checks if boolean operation produces false or true
    //  *this return a boolean variable
    public boolean equals(FishType temp)
    {
        return this.name.equals(temp.name) && this.rarity.equals(temp.rarity) && this.restriction == temp.restriction && (temp.price - this.price ) < 0.005;
    }
}
