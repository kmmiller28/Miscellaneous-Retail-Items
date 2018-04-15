/*Kimberly White
*CS 2265-Advanced Programming 1
*Program #3-Java application to calculate the sum of different quantities 
            of miscellaneous retail items with user interaction.
*/

import java.util.Scanner;

class Sales
{
   public static void main(String[] args)
   {
   
      Scanner input = new Scanner(System.in);
       
      //variables     
      double Total = 0;
      double ProductOneTotal = 0;
      double ProductTwoTotal = 0;
      double ProductThreeTotal = 0;
      double ProductFourTotal = 0;
      double ProductFiveTotal = 0;
      double TotalSales = 0;
      double Sum = 0;
      double ProductOne = 2.98;
      double ProductTwo = 4.50;
      double ProductThree = 9.98;
      double ProductFour = 4.49;
      double ProductFive = 6.87;
      int ProductSelection = 0;
      double ProductLineTotal = 0;
      TotalSales = Total;
      
      System.out.println( "<<<RETAIL *** SALES>>>");  
      System.out.println( "***********************");   

                
      //while loop with sentinel-controlled loop to terminate out of range input     
      while(ProductSelection != -1)
		{
      
            System.out.println( "Please enter which product you would like to purchase (1-5): ");
            ProductSelection = input.nextInt();
            

         
          if(ProductSelection != -1)
         {

			   System.out.println( "Enter total number of units: ");
            Total = input.nextInt();
		      
            //begin switch statement                   
			   switch(ProductSelection)
			   {
				   case 1: 
                  ProductLineTotal = ProductOne;
					   ProductOneTotal = ProductOneTotal + (ProductOne * Total); 
					   break;
				   case 2: 
                  ProductLineTotal = ProductTwo;					
                  ProductTwoTotal = ProductTwoTotal + (ProductTwo * Total); 
					   break;
				   case 3: 
                  ProductLineTotal = ProductThree;
					   ProductThreeTotal = ProductThreeTotal + (ProductThree * Total); 
					   break;
				   case 4: 
                  ProductLineTotal = ProductFour;
					   ProductFourTotal = ProductFourTotal + (ProductFour * Total); 
					   break;
				   case 5: 
                  ProductLineTotal = ProductFive;
					   ProductFiveTotal = ProductFiveTotal + (ProductFive * Total); 
					   break;
              }//end switch statement
              
            //ask for user input and ouput total
            System.out.println("Retail unit cost of product entered is: $" + ProductLineTotal);
				System.out.println("Order cost is: $" + ProductLineTotal * Total);            
            }//end if statement
          }//end while loop
    
      
            //output results of product totals
				System.out.println("Individual cost of each product you purchased: " +
            "\nProduct 1: $" + ProductOneTotal  +
				"\nProduct 2: $" + ProductTwoTotal  + 
				"\nProduct 3: $" + ProductThreeTotal  +
				"\nProduct 4: $" + ProductFourTotal  +
				"\nProduct 5: $" + ProductFiveTotal);
            System.out.println("The total cost of the products you purchased is: $" + (ProductOneTotal + ProductTwoTotal + ProductThreeTotal + 
                                                                                 ProductFourTotal + ProductFiveTotal));

            
  	}//end main 		 
        
};//end class 
      	