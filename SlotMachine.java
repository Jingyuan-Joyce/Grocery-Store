import java.util.Scanner;
import java.io.*;
import java.util.Random;
public class SlotMachine {

	public static void main(String[] args) throws IOException{
		Scanner keyboard = new Scanner(System.in);
		Random randomnumber = new Random();
		File myfile=new File("SlotMachineMoney.txt");
		Scanner inputFile = new Scanner(myfile);
		double amount = inputFile.nextDouble();
		while (amount>=1000){
			System.out.println("Enter the amount of money to insert:");
			int bets = keyboard.nextInt();
			if(!(checkbetsamount(bets))){
				System.out.println("Not allowed!!");
				break;	
			}
			else
				System.out.println("The amount is allowed!");
		    for(int i=0;i<=3;i++){
		    	int number = randomnumber.nextInt(6);
		        String fruit=displayimage(number);
		        System.out.print(fruit+" ");
		    }
		}
	}
    public static boolean checkbetsamount(int bet){
    	boolean value;
    	if (bet>=0 && bet<=100){
    		value=true;
            return value;
    	}
    	else{
    		value=false;
    		return value;
    	}
    }
	
    public static String displayimage(int nb){
    	String fruit="null";   	
    	switch(nb)
    	{
    	   case 0:
    		   fruit="Cherry";
    		   break;
    	   case 1:
    		   fruit="Lemon";
    		   break;
    	   case 2:
    		   fruit="Orange";
    		   break;
    	   case 3:
    		   fruit="Apple";
    		   break;
    	   case 4:
    		   fruit="Grape";
    		   break;
    	   case 5:
    		   fruit="Banana";
    		   break;
    	}
    	return fruit;
    		   
    	
    }

}
