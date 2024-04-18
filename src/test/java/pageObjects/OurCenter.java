package pageObjects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import utilities.excelutiles;

public class OurCenter extends BasePage {
        
	String file=System.getProperty("user.dir")+"\\testData\\Inputdata.xlsx";
	excelutiles ex;
	
	String file1=System.getProperty("user.dir")+"\\testData\\Outputdata.xlsx";
	excelutiles exc;
	
	JavascriptExecutor js;
	int c=0;
	
	public OurCenter(WebDriver driver) {
		super(driver);
		js=(JavascriptExecutor)driver;
		ex=new excelutiles(file);
		exc=new excelutiles(file1);
	}	
	
	//locating web elements for the scenario
	    @FindBy(xpath="//div[@class='logo']/a/img")
	    public WebElement Logo;
		
		@FindBy(xpath="//*[@id='header']/div/div/div[2]/div/nav/div[2]/ul/li[3]/a")
		public WebElement ourcenter;
		
		@FindBy(xpath="//select[@id='typeeeee']")
		public WebElement selectstate;
		
		@FindBy(xpath="//select[@class='form-control CityId']")
		public WebElement selectcity;
		
		@FindBy(xpath="//button[text()='Search']")
		public WebElement search;
		
		@FindBy(xpath="//div[@id='search-list-container']//div[@class='store-heading']")
		public List<WebElement> state_city;
		
		//Navigating back to home page
		public void Navigate() {
			js.executeScript("arguments[0].click()",Logo);
		}
		
		//Clicking on our center option
		public void OCclick() {
			js.executeScript("arguments[0].click()",ourcenter);
		}
		
		//Selecting state and city combinations
		public void Select_State1_City1(){
			
			String State=ex.getCellData("StateCityData",1,0);
			String City=ex.getCellData("StateCityData", 1, 1);
					
			Select state_name=new Select(selectstate);
			state_name.selectByVisibleText(State);
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
					
			Select city_name=new Select(selectcity);
			city_name.selectByVisibleText(City);
					
			js.executeScript("arguments[0].click()",search);
			
			System.out.println("Service Address Results For Karnataka - Mysuru : ");
					
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
					
			js.executeScript("window.scrollBy(0,700)");
					
		}
		
		public void Select_State2_City2(){
			
			String State=ex.getCellData("StateCityData",2,0);
			String City=ex.getCellData("StateCityData", 2, 1);
			
			Select state_name=new Select(selectstate);
			state_name.selectByVisibleText(State);
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			Select city_name=new Select(selectcity);
			city_name.selectByVisibleText(City);
			
			//search.click();
			js.executeScript("arguments[0].click()",search);
			
			System.out.println("Service Address Results For Delhi - Delhi : ");
			
			try {
				Thread.sleep(3000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			js.executeScript("window.scrollBy(0,700)");
			
		}
		
      public void Select_State3_City3(){
			
			String State=ex.getCellData("StateCityData",3,0);
			String City=ex.getCellData("StateCityData", 3, 1);
			
			Select state_name=new Select(selectstate);
			state_name.selectByVisibleText(State);
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			Select city_name=new Select(selectcity);
			city_name.selectByVisibleText(City);
			
			js.executeScript("arguments[0].click()",search);
			
			System.out.println("Service Address Results For Telangana - Hyderabad : ");
			
			try {
				Thread.sleep(3000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			js.executeScript("window.scrollBy(0,700)");
			
		}

		//Displaying addresses		
		public void Display(){
			List<String> lst=new ArrayList<String>();
			for(int r=0;r<state_city.size();r++) {
				String s=state_city.get(r).getText(); 
				lst.add(s);
				System.out.println(s);
			    try {
					exc.write_Data("ServiceAddressResults", s, r, c);
				} catch (Exception e) {
					e.printStackTrace();
				}
			    
				}
			c++;
	}
}

