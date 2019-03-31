package assignment;

import java.util.Scanner;

public class Employees {
	
	public String name;
	public int id;
	public String type;
	public double salary;
	public double tax;
	public int hour;
	public double gross;
	public double rssb;
	public double net;
	

	public static class Month extends Employees {
		public void emp1() {
		
			@SuppressWarnings("resource")
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
			@SuppressWarnings("resource")
			Scanner in=new Scanner(System.in);
			salary=in.nextInt();
			net=salary;
			
		}
	}

	public static class Hour extends Employees{
		public double emp3() {
			System.out.println("Enter the number of hours worked");
			@SuppressWarnings("resource")
			Scanner in=new Scanner(System.in);
			hour=in.nextInt();
			System.out.println("Enter salary per hour");
			salary=in.nextInt();
			
			if(hour<=40) {
				return(net=hour*salary);
				
			}
			else {
				return(net=(hour*salary)+((40-hour)*salary));
			}
		}
	}
	
}
