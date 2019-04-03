package assignment;

import java.util.Scanner;

public class Employees {
	private static final String a = null;
	public String name;
	public int id;
	public int type;
	public double salary;
	public double tax;
	public int hour;
	public double gross;
	public double rssb;
	public double net;
	
	

	public static class Month extends Employees {
		public void emp1() {
		
			
			Scanner in=new Scanner(System.in);
			System.out.println("Enter salary gained monthly");
			salary=in.nextInt();
			
			tax=(salary*30)/100;
			rssb=(salary*3)/100;
			net=salary-(tax+rssb);
		}


	}
	public static class Week extends Employees{
		
		public void emp2() {
			System.out.println("Enter salary gained in a week");
			
			Scanner in=new Scanner(System.in);
			salary=in.nextInt();
			net=salary;
			
		}
	}

	public static class Hour extends Employees{
		public double emp3() {
			System.out.println("Enter the number of hours worked");
			
			Scanner in=new Scanner(System.in);
			hour=in.nextInt();
			System.out.println("Enter salary per hour");
			salary=in.nextInt();
			
			if(hour<=24) {
				return(net=hour*salary);
				
			}
			else {
				return(net=(hour*salary)+((24-hour)*salary));
			}
		}
	}
	public  static void main(String[] args) {
		
		
		Hour num = new Hour();
		Week num1 = new Week();
		Month num2 = new Month();
		
		//num.emp3();
		
		System.out.println("Please enter the name of an employee:");
		
		
		Scanner in = new Scanner(System.in);
		
        num.name=in.nextLine();
        System.out.println("Please enter the id of an employee:");
        num.id=in.nextInt();
       
        System.out.println("name is "+num.name);
        System.out.println("id is "+num.id);
        System.out.println("Please choose the type of employee:");
        num.type=in.nextInt();
		if(num.type==1)
		{
			num2.emp1();
			System.out.println("The result is"+num2.net);
			
		}
		else if(num.type==2){
			num1.emp2();
			System.out.println("The result is"+num1.net);
		}
		else if(num.type==3){
			num.emp3();
			System.out.println("The result is"+num.net);
		
			}
		else {

		System.out.println("Error");
			
		}
		
		}
	
}
	

