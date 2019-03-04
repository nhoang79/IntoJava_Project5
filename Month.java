/*
 * Programming Challenge 5 from chapter 6:
 *                      Month Class holds information about the month
 *                     & modifications made to Month class to catch two
 *                      exceptions, which are InvalidInput for month's number and 
 *                      InvalidStringInput for month's name
 */

/**
 *
 * @author Ngan
 */
public class Month {
    
    //Declaring fields for Month class
    int monthNumber;

    //No-arg Constructor that set monthNumber to 1
    public Month()
    {
        monthNumber = 1;
    }
    
    public Month(int monthNumber) throws InvalidMonthNumInput
    {
        this.monthNumber = monthNumber;
        if(monthNumber < 1 || monthNumber > 12) 
        {//Error: INVALID INPUT: month cannot be greater than 12 or less than 1
            throw new InvalidMonthNumInput("ERROR: " + monthNumber 
                                + " is an invalid month number."
                                + " Month's number cannot be less "
                                + "than 1 or greater than 12.");
        }
        else 
        {
            this.monthNumber = monthNumber;
            System.out.println("Valid input for month number: Month's number is "
                                + this.monthNumber + ".");
        }
    }
    
    
    
    /** Constructor that accepts name of the month such as "January"
     *  or "February" as argument & set monthNumber to its responding value.
     */
    public Month(String nameOfMonth) throws InvalidStringInputForMonth
    {  
       switch (nameOfMonth.toLowerCase())
       {
           case "january":
               monthNumber = 1;
               System.out.println("Valid string input for nameOfMonth: " + nameOfMonth);
               break;
           case "february":
               monthNumber = 2;
               System.out.println("Valid string input for nameOfMonth: " + nameOfMonth);
               break;
           case "march":
               monthNumber = 3;
               System.out.println("Valid string input for nameOfMonth: " + nameOfMonth);
               break;
           case "april":
               monthNumber = 4;
               System.out.println("Valid string input for nameOfMonth: " + nameOfMonth);
               break;
           case "may":
               monthNumber = 5;
               System.out.println("Valid string input for nameOfMonth: " + nameOfMonth);
               break;
           case "june":
               monthNumber = 6;
               System.out.println("Valid string input for nameOfMonth: " + nameOfMonth);
               break;
           case "july":
               monthNumber = 7;
               System.out.println("Valid string input for nameOfMonth: " + nameOfMonth);
               break;
           case "august":
               monthNumber = 8;
               System.out.println("Valid string input for nameOfMonth: " + nameOfMonth);
               break;
           case "september":
               monthNumber = 9;
               System.out.println("Valid string input for nameOfMonth: " + nameOfMonth);
               break;
           case "october":
               monthNumber = 10;
               System.out.println("Valid string input for nameOfMonth: " + nameOfMonth);
               break;
           case "november":
               monthNumber = 11;
               System.out.println("Valid string input for nameOfMonth: " + nameOfMonth);
               break;
           case "december":
               monthNumber = 12;
               System.out.println("Valid string input for nameOfMonth: " + nameOfMonth);
               break;
           //Catching InvalidStringInputForMonth
           default:
              throw new InvalidStringInputForMonth("ERROR: " + nameOfMonth 
                                            + " is an invalid month's name");
       }
    }
    
    
    
    
}
