package com;

import java.util.Scanner;

public class Test {
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of drivers: ");
		int numberOfDrivers=sc.nextInt();
		Driver[] drivers=new Driver[numberOfDrivers];
		for(int i=0;i<numberOfDrivers;i++)
		{
			System.out.println("Enter driver id:");
		    int driverId = sc.nextInt();
		    sc.nextLine();

		    System.out.println("Enter driver name:");
		    String driverName = sc.nextLine();

		    System.out.println("Enter driver category:");
		    String category = sc.nextLine();

		    System.out.println("Enter total distance traveled:");
		    double totalDistance = sc.nextDouble();

		    drivers[i] = new Driver(driverId, driverName, category, totalDistance);
		}
		boolean condition=true;
		Travel t=new Travel();
		while(condition)
		{
			 printMenu();
		int choice=sc.nextInt();
		
		
		switch(choice)
		{
		case 1:
			System.out.println("Enter driver ID to check:");
		    int toSearchDriverId = sc.nextInt();
		    Driver selectedDriver = null;
		    for (int i = 0; i < drivers.length; i++)
		    {
		        if (drivers[i].getDriverId() == toSearchDriverId)
		        {
		            selectedDriver = drivers[i];
		            break;
		        }
		    }
		    if (selectedDriver != null)
		    {
		        boolean isCar = t.isCarDriver(selectedDriver);
		        System.out.println("Is Car Driver? " + isCar);
		    } 
		    else 
		    {
		        System.out.println("Driver ID not found!");
		    }
		    break;
			
		case 2:
		    System.out.println("Enter driver ID to retrieve:");
		    int inputDriverId = sc.nextInt();                       
		    String result = t.retriveByDriverId(drivers, inputDriverId); 
		    System.out.println(result);                          
		    break;

			
		case 3:
		    System.out.println("Enter category to count:");
		    String categoryCount = sc.next();                                
		    int count = t.retriveCountOfDriver(drivers, categoryCount);      
		    System.out.println("Number of drivers in " + categoryCount + ": " + count);
		    break;

		case 4:
		    System.out.println("Enter category to list drivers:");
		    String catList = sc.next();
		    Driver[] result2 = t.retriveDriver(drivers, catList);

		    boolean found = false;
		    for (int i = 0; i < result2.length; i++) 
		    {
		        if (result2[i] != null)
		        {
		            System.out.println(result2[i].toString());
		            found = true;
		        }
		    }

		    if (!found)
		    {
		        System.out.println("No drivers found in category: " + catList);
		    }
		    break;

		case 5:
		    Driver maxDriver = t.retriveMaximumDistanceTravelledDriver(drivers);
		    if (maxDriver != null) 
		    {
		        System.out.println("Driver with maximum distance traveled:");
		        System.out.println(maxDriver.toString());
		    } else {
		        System.out.println("No drivers found.");
		    }
		    break;
		    
		case 6:
			System.out.print("Exiting program.....");
			condition=false;
			break;

			default:
				System.out.println("Invalid choice");
		}
		}
	}
	
	private static void printMenu() {
	    System.out.println("\nMenu:");
	    System.out.println("1. Check if driver is Car driver");
	    System.out.println("2. Retrieve driver by ID");
	    System.out.println("3. Count drivers by category");
	    System.out.println("4. List drivers by category");
	    System.out.println("5. Driver with maximum distance");
	    System.out.println("6. Exit");
	    System.out.print("Enter your choice: ");
	}

}
