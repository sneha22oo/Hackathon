package pageObjects;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.excelutiles;

public class CarService extends BasePage{
	
	String file=System.getProperty("user.dir")+"\\testData\\Outputdata.xlsx";
	excelutiles ex;
	
	 public CarService(WebDriver driver) {
		super(driver);
		ex=new excelutiles(file);
	}
	 
		String name;
		String p;
	    
		//Locating web elements
		@FindBy(xpath="//div[@class='statics']//h2")
		public WebElement Title;
		
	    @FindBy(xpath="//div[@class='caption']/b[1]")
		public List<WebElement> servicename;
	    
	    @FindBy(xpath="//div[@class='caption']/b[2]")
	    public List<WebElement> price;
	    
	    //Validating page
	    public boolean ServiceDetailPage() {
	    	try {
				return (Title.isDisplayed());
			} catch (Exception e) {
				return (false);
			}
	    }
	    
	    //Capturing car service name
	    public void Service() {
	    	System.out.println("Car Service Names : ");
	    	for(int i=0;i<servicename.size();i++) {
	    		name=servicename.get(i).getText();
	    		System.out.println(name);
	    		try {
					ex.write_Data("ServiceAndAmount", name, i, 0);
				} catch (Exception e) {
					e.printStackTrace();
				}
	    	}
	    }    	
        
	    //capturing service amount
	    public void Price(){
	    	System.out.println("Car Service Amount : ");
	    	for(int i=0;i<price.size();i++) {
	    		p=price.get(i).getText();
	    		System.out.println(p);
	    		try {
					ex.write_Data("ServiceAndAmount", p, i, 1);
				} catch (IOException e) {
					e.printStackTrace();
				}
	    	}
	    }
}

	    	