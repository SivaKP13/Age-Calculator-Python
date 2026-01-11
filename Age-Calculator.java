import java.util.Scanner;
public class AgeCalculator {
  public static void main(String[] args)
{
    Scanner input = new
Scanner(System.in);
    System.out.println("Hello user, this is a code that can calculate the age of any person at any give month.");
    System.out.print("Alright, let's begin. What is the year of birth? (Please enter a number): ");
    int birthYear = input.nextInt();
    System.out.print("Awesome, now let's calculate the current age. What year is it as of today? (Please enter a number): ");
    int currentYear = input.nextInt();
    int currentAge = currentYear - birthYear;
    System.out.println("This year, this person will turn " + currentAge + ".");
    System.out.print("Would you like to know how many months will pass until or have passed since this person's birthday? (Y/N): ");
    String decisionM = input.next();
    if (decisionM.equalsIgnoreCase("Y")){
      System.out.print("Great! What is the month of birth? (Please enter a number, Jan. is 1 and Dec. is 12): ");
      int birthMonth = input.nextInt();
      System.out.print("Alright, what month is it as of today? (Please enter a number, Jan. is 1 and Dec. is 12): ");
      int monthN = input.nextInt();
      if (monthN == birthMonth){
        System.out.println("This individual is turning " + currentAge + " this month! Wish him/her a great birthday!");
    }
      else if (monthN <= birthMonth){
        int monthN2 = birthMonth - monthN;
        System.out.println("This individual is " + monthN2 + " months away from turning " + currentAge + ".");
      }
      else{
        int monthN2 = monthN - birthMonth;
        int monthN3 = 12 - monthN2;
        System.out.println("It has been " + monthN2 + " months since this individual has turned " + currentAge + " and his/her next birthday will be in " + monthN3 + " months.");
      }
    System.out.println("The age is now calculated. Have a good day!");
    }
    else if (decisionM.equalsIgnoreCase("N")){
  System.out.println("Alright then, have a good day!");
    }  
    }
}