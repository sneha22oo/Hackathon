package pageObjects;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Homepage extends BasePage{

	   public Homepage(WebDriver driver) {
		super(driver);
	}
        //Locating web elements for the scenario
	    @FindBy(xpath="//div[@class='logo']/a/img")
	    public WebElement logoimg;
	    
	    @FindBy(xpath="//*[@id='j-slider']/div/div/div/div/div/div/div/div[1]/form/div[1]/select")
		WebElement selecttype;
		
		@FindBy(xpath="//div[@class='service-search col-md-4 col-sm-12 no-padding']//select[@name='phone']")
		WebElement subcategory;
		
		@FindBy(xpath="//a[@class='btn']")
		WebElement goforitbutton;
		
		//Checking The Correct page is open or not 
		public boolean logoimage() {
			try {
				return (logoimg.isDisplayed());
			} catch (Exception e) {
				return (false);
			}
		}
		
		//selecting Car from drop down
		public void selecttype() {
			selecttype.click();
			Select car=new Select(selecttype);
			car.selectByVisibleText("Car");
		}
		
		//selecting sub category from drop down
		public void selectcar() {
			subcategory.click();
			Select cartype=new Select(subcategory);
			cartype.selectByVisibleText("SUV");
		}
		
		//clicking on button
		public void Go_for_it_Button() {
			goforitbutton.click();
		}	
	}
		