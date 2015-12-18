package day27.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LeftMenu {
	@FindBy(linkText="Home")
	WebElement Home;
	public void home()
	{
		Home.click();
	}
	@FindBy(linkText="Flights")
	WebElement Flights;
	public void flights()
	{
		Flights.click();
	}
	@FindBy(linkText="Hotels")
	WebElement Hotels;
	public void hotels()
	{
		Hotels.click();
	}
	@FindBy(linkText="Car Rentals")
	WebElement CarRentals;
	public void carRentals()
	{
		CarRentals.click();
	}
	@FindBy(linkText="Cruises")
	WebElement Cruises;
	public void cruises()
	{
		Cruises.click();
	}
	@FindBy(linkText="Destinations")
	WebElement Destinations;
	public void destinations()
	{
		Destinations.click();
	}
	@FindBy(linkText="Vacations")
	WebElement Vacations;
	public void vacations()
	{
		Vacations.click();
	}
	
	

}
