package ClassHW3;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class HW3XPathRules {
public static void main(String[] args) {

	System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	WebDriver driver;
	driver=new ChromeDriver ();
	driver.get("http://automationpractice.com/index.php");
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.className("login")).click();
	driver.findElement(By.id("email_create")).sendKeys("sam1000000000000000000@gmail.com");
	driver.findElement(By.xpath("//button[@id='SubmitCreate']")).click();
//X path rule 4 //tagname[starts-with(@attribute,'value')]
	driver.findElement(By.xpath("//input[starts-with(@id,'id_gender1')]")).click();
	System.out.println(driver.findElement(By.xpath("//input[starts-with(@id,'id_gender1')]")).isDisplayed()+">---Mr is Displayed");
	System.out.println(driver.findElement(By.xpath("//input[starts-with(@id,'id_gender1')]")).isSelected()+">---Mr is Selected");
	System.out.println("----------------");

//X path Rule 1	//tagname[@attribute='value']
	driver.findElement(By.xpath("//input[@id='customer_firstname']")).sendKeys("Sam");
	System.out.println(driver.findElement(By.xpath("//input[@id='customer_firstname']")).isDisplayed()+">---Sam Name is Displayed");
	System.out.println(driver.findElement(By.xpath("//input[@id='customer_firstname']")).isSelected()+">---Sam Name is Selected");
	System.out.println("----------------");
//x Path Rule 2	//tagname[@attribute='value'][@attribute='value']
	driver.findElement(By.xpath("//input[@id='customer_lastname'][@type='text']")).sendKeys("Smith");
	System.out.println(driver.findElement(By.xpath("//input[@id='customer_lastname'][@type='text']")).isDisplayed()+">---Smith Name is Displayed");
	System.out.println(driver.findElement(By.xpath("//input[@id='customer_firstname']")).isSelected()+">---Smith Name is Selected");
	System.out.println("----------------");

//x path Rule 3	//tagname[contains(@attribute,'value')]
	driver.findElement(By.xpath("//input[contains(@type,'password')]")).sendKeys("Abcd@1234");
	System.out.println(driver.findElement(By.xpath("//input[contains(@type,'password')]")).isDisplayed()+">---Password is Displayed");
	System.out.println(driver.findElement(By.xpath("//input[contains(@type,'password')]")).isSelected()+">---Password Name is Selected");
	System.out.println("----------------");
	
//x path Rule 4	//tagname[starts-with(@attribute,'value')]
WebElement drpDays= driver.findElement(By.xpath("//select[starts-with(@id,'days')]"));
drpDays.click();
Select day=new Select(drpDays);
day.selectByIndex(2);
//not sure about print dropdown elements
System.out.println(driver.findElement(By.xpath("//select[starts-with(@id,'days')]")).isDisplayed()+">---Day is Displayed");
System.out.println(driver.findElement(By.xpath("//select[starts-with(@id,'days')]")).isSelected()+">---Day is Selected");
System.out.println("----------------");
//Xpath Rule 5	//tagname[starts-with(@attribute,'value')and(@attribute='value')]
WebElement drpMonths=driver.findElement(By.xpath("//select[starts-with(@id,'months') and (@name='months')]"));
drpMonths.click();
Select months=new Select(drpMonths);
months.selectByIndex(3);
//Xpath Rule 6	//tagname[starts-with(@attribute,'value') or (@attribute='value')]
WebElement drpYear= driver.findElement(By.xpath("//select[starts-with(@id,'years') or (@name='years')]"));
drpYear.click();
Select year=new Select(drpYear);
year.selectByIndex(1);
//Rule 7	//*[@attribute='value']
driver.findElement(By.xpath("//*[@for='newsletter']")).click();
System.out.println(driver.findElement(By.xpath("//*[@for='newsletter']")).isDisplayed()+">---Sign up for our newsletter! Box is Displayed");
System.out.println(driver.findElement(By.xpath("//*[@for='newsletter']")).isSelected()+">---Sign up for our newsletter! Box is Selected");
System.out.println("----------------");

//Rule 10	//*[@attribute='value' and @attribute='value' or @attribute='value']
driver.findElement(By.xpath("//*[@type='checkbox' and @name='optin' or @id='optin']")).click();
System.out.println(driver.findElement(By.xpath("//*[@type='checkbox' and @name='optin' or @id='optin']")).isDisplayed()+">---Receive special offers from our partners! Box is Displayed");
System.out.println(driver.findElement(By.xpath("//*[@type='checkbox' and @name='optin' or @id='optin']")).isSelected()+">---Receive special offers from our partners! Box is Selected");
System.out.println("----------------");
//Rule 9	//*[@attribute='value' and @attribute='value']
driver.findElement(By.xpath("//*[@id='company' and @name='company']")).sendKeys("ACBD Co");
System.out.println(driver.findElement(By.xpath("//*[@id='company' and @name='company']")).isDisplayed()+">---ABCD Co is Displayed");
System.out.println(driver.findElement(By.xpath("//*[@id='company' and @name='company']")).isSelected()+">---ABCD Co is Selected");
System.out.println("----------------");
//Rule 8	//*[@attribute='value' or @attribute='value']
driver.findElement(By.xpath("//*[@id='address1' or @name='address1']")).sendKeys("123 ABCD ST");
System.out.println(driver.findElement(By.xpath("//*[@id='address1' or @name='address1']")).isDisplayed()+">---123 ABCD ST is Displayed");
System.out.println(driver.findElement(By.xpath("//*[@id='address1' or @name='address1']")).isSelected()+">---123 ABCD ST is Selected");
System.out.println("----------------");
//Xpath Rule 1 //tagname[@attribute='value']
driver.findElement(By.xpath("//input[@id='city']")).sendKeys("ManLand");
System.out.println(driver.findElement(By.xpath("//input[@id='city']")).isDisplayed()+">---ManLand is Displayed");
System.out.println(driver.findElement(By.xpath("//input[@id='city']")).isSelected()+">---ManLand is Selected");
System.out.println("----------------");
//Xpath Rule 3	//tagname[contains(@attribute,'value')]
WebElement drpState=driver.findElement(By.xpath("//select[contains(@id,'id_state')]"));
drpState.click();
Select state=new Select(drpState);
state.selectByIndex(49);
//Xpath Rule 2	//tagname[@attribute='value'][@attribute='value']
driver.findElement(By.xpath("//input[@id='postcode'][@name='postcode']")).sendKeys("12345");
System.out.println(driver.findElement(By.xpath("//input[@id='postcode'][@name='postcode']")).isDisplayed()+">---Zipcode is Displayed");
System.out.println(driver.findElement(By.xpath("//input[@id='postcode'][@name='postcode']")).isSelected()+">---Zipcode is Selected");
System.out.println("----------------");
//Xpath Rule 5	//tagname[starts-with(@attribute,'value')and(@attribute='value')]
driver.findElement(By.xpath("//input[starts-with(@name,'phone')and(@id='phone')]")).sendKeys("1111111111");
System.out.println(driver.findElement(By.xpath("//input[starts-with(@name,'phone')and(@id='phone')]")).isDisplayed()+">---Home Phone Number is Displayed");
System.out.println(driver.findElement(By.xpath("//input[starts-with(@name,'phone')and(@id='phone')]")).isSelected()+">---Home Phone Number is Selected");
System.out.println("----------------");
//Xpath Rule 6	//tagname[starts-with(@attribute,'value') or (@attribute='value')]
driver.findElement(By.xpath("//input[starts-with(@name,'phone_mobile') or (@id='phone_mobile')]")).sendKeys("2222222222");
System.out.println(driver.findElement(By.xpath("//input[starts-with(@name,'phone')and(@id='phone')]")).isDisplayed()+">---Mobile Phone Number is Displayed");
System.out.println(driver.findElement(By.xpath("//input[starts-with(@name,'phone')and(@id='phone')]")).isSelected()+">---Mobile Phone Number is Selected");
System.out.println("----------------");


	}

}
