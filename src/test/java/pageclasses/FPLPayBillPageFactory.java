package pageclasses;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class FPLPayBillPageFactory {
	
	WebDriver driver;
	
	@FindBy(id="core_view_form_ValidationTextBox_2")
	WebElement usernameTextBox;
	
	@FindBy(id="core_view_form_ValidationTextBox_3")
	WebElement passwordTextBox;
	
	@FindBy(id="core_view_form_Button_1_label")
	WebElement logInBtn;
	
	@FindBy(xpath="//div[@id='accountmgmt_view_AccountBalance_0']//a[@href='#payBill']")
	WebElement payBillBtn;
	
	public FPLPayBillPageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void enterUserName() {
		usernameTextBox.sendKeys("trestian.stewart@gmail.com");
	}
	public void enterPassword() {
		passwordTextBox.sendKeys("Trini22dbone");
	}
	public void clickLogIn() {
		logInBtn.click();
	}
	public void clickPayBill() {
		payBillBtn.click();
		
	}
	


	
}
