package com;

public class Travel {
	
	boolean isCarDriver(Driver driver)
	{
		if(driver.getCategory().equalsIgnoreCase("car"))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	String retriveByDriverId(Driver[] drivers,int driverId)
	{
		for(int i=0;i<drivers.length;i++)
		{
			Driver d=drivers[i];
			if(d.getDriverId()==driverId)
			{
				return d.toString();
			}
		}
		return "Driver ID not found";
	}
	
	int retriveCountOfDriver(Driver[] drivers,String category)
	{
		int countOfDrivers=0;
		for(int i=0;i<drivers.length;i++)
		{
			Driver d=drivers[i];
			if(d.getCategory().equalsIgnoreCase(category))
			{
				countOfDrivers++;
			}
		}
		return countOfDrivers;
	}
	
	Driver[] retriveDriver(Driver[] drivers, String category) {
	    Driver[] result = new Driver[drivers.length];
	    int index = 0;

	    for (int i = 0; i < drivers.length; i++) {
	        Driver d = drivers[i];
	        if (d.getCategory().equalsIgnoreCase(category)) {
	            result[index] = drivers[i];
	            index++;
	        }
	    }

	    return result;
	}

	Driver retriveMaximumDistanceTravelledDriver(Driver[] drivers)
	{
		Driver maximumDistanceTravelledDriver=drivers[0];		
		for(int i=1;i<drivers.length;i++)
		{
			Driver d=drivers[i];
			if(d.getTotalDistance()>maximumDistanceTravelledDriver.getTotalDistance())
			{
				maximumDistanceTravelledDriver=drivers[i];
			}
		}
		
		return maximumDistanceTravelledDriver;
	}
	
	

}







