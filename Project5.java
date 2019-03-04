import java.util.Scanner;

/*
 * Project 5:
 *           #4. Month Class Exception page 735
 *           #10. Recursive Population Class page 1065
 */

/**
 *
 * @author Ngan
 */
public class Project5 {

    public static void main(String[] args) {
        
        
        System.out.println("Below are testing results for Error "
                            + "#1 from Month Class Exception");
        
        /**Testing Error #1: InvalidMonthInput Error is catch because a number 
        *                   greater than 12 is given for the month number.
        */
        try
        {
            Month m1 = new Month(20);
        }
        catch(InvalidMonthNumInput e)
        {
            System.out.println(e.getMessage());
        }
        
        
        
        /**Testing Error #1:InvalidMonthInput Error is catch because a number 
        *                   less than 1 is given for the month number.
        */
        try
        {
            Month m2 = new Month(0);
        }
        catch(InvalidMonthNumInput e)
        {
            System.out.println(e.getMessage());
        }
        
        /**Testing Error #1: This try-catch block will not
         * catch InvalidMonthNumInput Error
        */
        try
        {
            Month m3 = new Month(12);
        }
        catch(InvalidMonthNumInput e)
        {
            System.out.println(e.getMessage());
        }
       
        //To separate output for Error #1 & #2 from Month Class Exception
        System.out.println("\n\nBelow are testing results for Error "
                            + "#2 from Month Class Exception");
        
        /**Testing Error #2: This try-catch block will catch 
         *                   InvalidStringInPutForMonth
        */
        try
        {
            Month m4 = new Month("Ngan Hoang");
        }
        catch(InvalidStringInputForMonth e)
        {
            System.out.println(e.getMessage());
        }
        
        /**Testing Error #2: This try-catch block will NOT 
         *                  catch InvalidStringInputForMonth exception
        */
        try
        {
            Month m4 = new Month("june");
        }
        catch(InvalidStringInputForMonth e)
        {
            System.out.println(e.getMessage());
        }
        
        
       
        
        
        
       
       //To separate output between Month Class Exception & Recursive Population 
       System.out.println("\n\nBelow are testing results for "
                            + "Recursive Population Class");
        
        //Creating fields to hold user's input
        int initialPop;
        double percentIncrease;
        int totalDays;
        
        //Asking user for initial population's size
        System.out.print("Please enter the initial amount of organism: ");
        Scanner keyboard = new Scanner(System.in);
        initialPop = Integer.parseInt(keyboard.nextLine());
        
        
        //Asking user for percentIncrease each day
        System.out.print("Please enter the average daily population "
                                  + "increase as a percentage: ");
        Scanner keyboard2 = new Scanner(System.in);
        percentIncrease = Double.parseDouble(keyboard2.nextLine());

                    
        //Asking user for number of days they multiply
        System.out.print("Please enter the number of days: ");
        Scanner keyboard3 = new Scanner(System.in);
        totalDays = Integer.parseInt(keyboard3.nextLine());
        
        
        /**Testing Population's recursive method on Population object p1 based 
         * on userInput.
         */
        Population p1 = new Population(initialPop,percentIncrease,totalDays);
        p1.getPopSize(1,initialPop, percentIncrease, totalDays);    
    }
     
    }
