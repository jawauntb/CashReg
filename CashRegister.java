import java.util.Scanner; //

/*
J Brown 2016
Program to calculate the total expenses
*/

public class CashRegister
{
  static int  totalExpenses = 0; //Total expenses
  static int itemVal = 0; //Price of one item
  public static Scanner keyboard = new Scanner(System.in);
  static boolean done=false; //How long loop should go
  static int count=0;
  public static void main (String[] args)
  {
    //Welcome message
    System.out.println("Welcome to BuyMart!");


    do{
      System.out.print("Read item price from keyboard");

      itemVal = keyboard.nextInt();

      if(itemVal==1)
      done=true;
      else
      { //Read next item price and repeat till cashier enters "Done"
      totalExpenses= totalExpenses + itemVal;
      count+=1;
    }
  }while(!done);
  System.out.println("Total expenses for " + count + "items is $"+ totalExpenses);
  //Count number of items

}

}
