
import java.util.*;

interface Menu{
	void displayMenu();
//	void order();
	void generateBill();
}

public class foodMenu implements Menu{
	Scanner choice= new Scanner(System.in);
	  int frenchFries = 60;
	    int burger = 50;
	    int pastry = 150;
	    int pizza = 200;
	    int coldCoffee = 80;
	    int coldrink = 80;
	    int icedtea = 80;
	    int ch;
	    int quantity;
	    static int total;
	    String again;
	
	public void displayMenu()
	{

		 System.out.println("**************** Welcome To our Cafe ****************");
	        System.out.println("=====================================================");
	        System.out.println("           1.French Fries          60/-");
	        System.out.println("           2.Burger                50/-");
	        System.out.println("           3.Pastry                150/-");
	        System.out.println("           4.Cold Drinks           80/- ");
	        System.out.println("           5.Cold Coffee           80/-");
	        System.out.println("           6.Pizza                 200/-");
	        System.out.println("           7.Iced Tea              80/- ");
	        System.out.println("           8.Exit                       ");
	        System.out.println("======================================================");
	        System.out.println("          What Do you Want to Order Today??");

		
		 while (true) {
	            System.out.print("Enter Your Choice ");
	            ch = choice.nextInt();
	            switch (ch) {
	                case 1:// French Fries
	                    System.out.println("You have Selected French Fries");
	                    System.out.println();
	                    System.out.println("Enter the desiered Quantity : ");
	                    quantity = choice.nextInt();
	                    total += quantity * frenchFries;

	                    break;

	                case 2:// Burger
	                    System.out.println("You have Selected  Burger");
	                    System.out.println();
	                    System.out.println("Enter the desiered Quantity : ");
	                    quantity = choice.nextInt();
	                    total +=  quantity * burger;

	                    break;

	                case 3:// Pastry
	                    System.out.println("You have Selected Pastry");
	                    System.out.println();
	                    System.out.println("Enter the desiered Quantity : ");
	                    quantity = choice.nextInt();
	                    total +=  quantity * pastry;

	                    break;
	                case 4:// Cold Drinks
	                    System.out.println("You have Selected Cold Drinks");
	                    System.out.println();
	                    System.out.println("Enter the desiered Quantity : ");
	                    quantity = choice.nextInt();
	                    total +=  quantity * coldrink;

	                    break;
	                case 5:// Cold Coffee
	                    System.out.println("You have Selected Cold Coffee");
	                    System.out.println();
	                    System.out.println("Enter the desiered Quantity : ");
	                    quantity = choice.nextInt();
	                    total += quantity * coldCoffee;

	                    break;

	                case 6:// Pizza
	                    System.out.println("You have Selected Pizza");
	                    System.out.println();
	                    System.out.println("Enter the desiered Quantity : ");
	                    quantity = choice.nextInt();
	                    total += quantity * pizza;

	                    break;

	                case 7:// Iced Tea
	                    System.out.println("You have Selected Iced Tea");
	                    System.out.println();
	                    System.out.println("Enter the desiered Quantity");
	                    quantity = choice.nextInt();
	                    total += quantity * icedtea;

	                    break;

	                case 8:// exit
	                    System.exit(1);
	                    break;

	                default:
	                    break;
	            }
	            System.out.println();
	            System.out.print("Do you wish to order anything else (Y/N) : ");
	            again = choice.next();
	            if(again.equalsIgnoreCase("Y"))
	            {
	             
	            }
	            else if(again.equalsIgnoreCase("N"))
	            {
	            	generateBill();
	            System.exit(1);
	            }
	            else{System.out.println("Invalid Choice");}
	        }
	    }

	
	public void generateBill() {
		// TODO Auto-generated method stub
		 System.out.println();
    System.out.println("***************** Thankyou for ordering ******************");
     System.out.println("****************Your Bill is : " +total+"*****************");
	}
}