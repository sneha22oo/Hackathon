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
	    @FindBy(xpath="//*[@id='j-slider']/div/div/div/div/div/div/div/div[1]/form/div[1]/select")
		WebElement clickoption;
		
		@FindBy(xpath="//div[@class='service-search col-md-4 col-sm-12 no-padding']//select[@name='phone']")
		WebElement carselect;
		
		@FindBy(xpath="//a[@class='btn']")
		WebElement button;
		
		//selecting Car from drop down
		public void selecttype() {
			clickoption.click();
			Select car=new Select(clickoption);
			car.selectByVisibleText("Car");
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		//selecting sub category from drop down
		public void selectcar() {
			carselect.click();
			Select cartype=new Select(carselect);
			cartype.selectByVisibleText("SUV");
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		//clicking on button
		public void Go_for_it_Button() {
			button.click();
		}	
	}
		