/*
 *  Programming Challenge 6 from Chapter 5: 
 *                                        Population class that predicts the 
 *                                        size of a population of organisms.
 */

/** Modified Population Class:
 *                 1. Store initial number of organisms
 *                 2. Store average daily population increase as a percentage
 *                 3. Store number of days they will multiple
 *                 4. Write a method that uses a recursive to calculate the 
 *                    population size each day
 * 
 */

/**
 *
 * @author Ngan
 */
public class Population {
    
    //Initial variable to hold number of organisms
    public int initialPopSize;
    public double percentIncre;
    public int numOfDays;
    public final int PERCENT = 100;
    
    /** Constructor that accepts initial population size, average daily 
    //population increase as a percentage, and number of days they will multiply.
    */
    public Population(int initialPopSize, 
                      double percentIncre, 
                      int numOfDays)
    {
        if(initialPopSize <=2 || percentIncre < 0 || numOfDays <= 1)
            {
                System.out.println("ERROR: Please enter a number greater than 2"
                                    + " for initial population size, a number"
                                    + " greater than 0 for percent increase, and"
                                    + " number greater than 1 for number of days.");
            }
        else
            {
                this.initialPopSize = initialPopSize;
                this.percentIncre = percentIncre;
                this.numOfDays = numOfDays;
            }
    }
    
    //Method that uses recursive to display the size of population for each day
    public int getPopSize(int startDay, int initialPopSize,double percentIncre, int numOfDays)
    {   
       /** int startDay = 0; Error: this statement causes day to be reset to 0,
        *                       which was why day in the printout statement 
        *                       could not be updated even with the day++ 
        *                       statement on line 65
        * 
        */
       if(startDay <= numOfDays && percentIncre != 0 && numOfDays > 1)
         //All these conditions must be true to calculate population size each day
       
            {
                int popSizeToday = initialPopSize + (initialPopSize * 
                                                    (int)(percentIncre)/PERCENT);
                System.out.println("Day " + startDay + "'s population size: " 
                                   + popSizeToday);
                //numOfDays++; ERROR: numOfDays must remain constant because 
                //it is the condition we check for the if statement  

                startDay++;
                int popSizeNextDay = getPopSize(startDay,popSizeToday, 
                                                percentIncre, numOfDays);
            }
       else if (percentIncre==0) //Base Case: no increment in population size
       {
           System.out.println("\nPopulation's size: " + initialPopSize 
                              + "\nNo change in population's size because average"
                              + " daily increase in population size is " 
                              + percentIncre);
           return initialPopSize;
       }
        return 0;
    }
}
