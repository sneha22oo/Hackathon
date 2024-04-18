package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.excelutiles;

public class RegistrationPage extends BasePage {
	String file=System.getProperty("user.dir")+"\\testData\\Inputdata.xlsx";
	excelutiles ex;
	
	String file1=System.getProperty("user.dir")+"\\testData\\Outputdata.xlsx";
	excelutiles exc;
	
	JavascriptExecutor js;
	
	public RegistrationPage(WebDriver driver) {
		super(driver);
		ex=new excelutiles(file);
		exc=new excelutiles(file1);
		js=(JavascriptExecutor)driver;
	}
		
	    //locating web elements for the scenario
		@FindBy(xpath="//*[@id=\"header\"]/div/div/div[2]/div/nav/div[2]/ul/li[7]/a")
		public WebElement reg;
		
		@FindBy(xpath="//input[@id='signupname']")
		public WebElement name;
		
		@FindBy(xpath="//input[@id='signupemail']")
		public WebElement email;
		
		@FindBy(xpath="//input[@id='signuppass']")
		public WebElement password;
		
		@FindBy(xpath="//input[@id='signuppassconfirm']")
		public WebElement confpassword;
		
		@FindBy(xpath="//a[@class='button primary register-button']")
		public WebElement signupbutton;
		
		@FindBy(xpath="//div[@class='alert alert-danger error-message']")
		public WebElement errormsg;
		
		//Clicking on register option
		public void register() {
			js.executeScript("arguments[0].click()",reg);
		}
		
		//Entering data to sign up form
		public void Entry(){
        	String User_name = ex.getCellData("RegisterData",0,0);
			String Email_id =ex.getCellData("RegisterData",1,0);
			String Entered_password =ex.getCellData("RegisterData",2,0);
			String Confirmed_password = ex.getCellData("RegisterData",3,0);
			
            name.sendKeys(User_name);
			email.sendKeys(Email_id);
			password.sendKeys(Entered_password);
			confpassword.sendKeys(Confirmed_password);
		}
		
		//Clicking on sign up button
		public void Signup() {
			js.executeScript("arguments[0].click()",signupbutton);
		}
		
		//Capturing error message
		public void ErrorMsg(){
			String msg=errormsg.getText();
			System.out.println("Registration Error Message For Invalid Email Input : ");
			System.out.println(msg);
			try {
				exc.write_Data("ErrorMessage", msg, 0, 1);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
}
