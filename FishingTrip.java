/*
 *COMP 1020		SECTION A03
 *INSTRUCTOR:	Dr. Andrea Bunt
 *NAME:			Raj Rathod
 *ASSIGNMENT:	Assignment 3
 *QUESTION:		Phase 3
 *PURPOSE:		This program creates a hierarchy of classes to create a suitable output
 */
public class FishingTrip {
    //instance variable
    Fish[] fish;
    int amount;
    int total;
    Fisher obj;

    //1st constructor
    public FishingTrip(int maxAmount)
    {
        fish = new Fish[maxAmount];
        amount = total = 0;
    }


    //2nd constructor
    public FishingTrip(Fisher obj)
    {
        this(obj.getLimit());           //sets the size of the array
        this.obj = obj;
        obj.setTrip(this);              //Fisher's object trip is set here
    }


    //This is an accessor method for the variable amount
    public int getAmount()
    {
        return amount;
    }

    //This is an accessor method for the variable total
    public int getTotal()
    {
        return total;
    }


    //  *This function sets the variable by adding the value of the element in the array
    //  *This function uses for loop
    //  *This function just adds all the value to the temp variable
    //  *this return a double
    public double getTotalValue()
    {
        double temp = 0.0;
        for(int i = 0; i < getAmount(); i++)
        {
            temp += fish[i].getValue();
        }
        return temp;
    }

    //  *This function sets the variable by adding the value of the element in the array
    //  *This function uses for loop
    //  *This function just adds all the value to the temp variable
    //  *this return a double
    public double getTotalWeight()
    {
        double temp = 0.0;
        for(int i = 0; i < amount; i++)
        {
            temp += fish[i].weight;
        }
        return temp;
    }

    //  *This function sets the boolean according to the if condition
    //  *This function uses if condition
    //  *This function just checks the size of the array and then accordingly sets the value of the boolean variable
    //  *this return a boolean
    public boolean catchFish(Fish newFish)
    {
        boolean temp = false;       //initial boolean value
        total++;        //increases the total value
        if(fish == null )           //checks if the array is null or not
        {
            return false;
        }
        if(amount < fish.length) {      //checks if the amount is less than the fish length
            fish[amount] = newFish;
            temp = true;
            amount++;                               //if so increases the amount s
        }
        return temp;
    }

    //  *This function deletes an element from the array
    //  *This function uses arraycopy method to do the deletion
    //  *This function deletes an element from the array and then shifts the element to left so that it does not creates a nullExceptionError
    //  *this return a boolFish objectean
    public Fish releaseFish(int index)
    {
        if (fish == null && index < 0 && index >= fish.length) {

            return null;
        }
        Fish temp = null;
        if(index >= 0 && index <= getAmount()) {// Create another array of size one less
            temp = fish[index];
            Fish[] arrDestination = new Fish[fish.length - 1];
            int remainingElements = fish.length - (index + 1);
            //arraycopy is used in order to delete the element
            System.arraycopy(fish, 0, arrDestination, 0, index);
            System.arraycopy(fish, index + 1, arrDestination, index, remainingElements);
            System.arraycopy(arrDestination,0,fish,0,arrDestination.length);
            amount--;               //amount is decreaseds
        }
        return temp;
    }

    //this method returns the String as it is a toString method
    public String toString()
    {
        String temp = "";
        if(getAmount()== 0 || getAmount()<0)            //saves a string specific to the if condition
        {
            temp = "\nSadly, the boat is empty ";
        }
        else
        {
            temp = " ,and " + getAmount()+"/"+fish.length + " were brought back";
            for(int i = 0; i < getAmount(); i++)
            {
                temp += "\n>"+ fish[i];
            }
        }
        return "During this FishingTrip, " + getTotal() + " total Fish were caught" + temp;
    }

    //  *This function checks many condition in order to check if two object are equal or not
    //  *This function uses boolean operators
    //  *This function checks if boolean operation produces false or true
    //  *this return a boolean variable
    public boolean equals(FishingTrip type)
    {
        return (this.getTotalValue() - type.getTotalValue()) < 0.1 && (this.getTotalWeight() - type.getTotalWeight()) < 0.1 && amount == type.amount && total == type.amount;
    }
}