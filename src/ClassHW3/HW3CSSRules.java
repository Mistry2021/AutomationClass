package ClassHW3;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HW3CSSRules {
public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","chromedriver.exe");
WebDriver driver;
driver=new ChromeDriver ();
driver.get("http://automationpractice.com/index.php");
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//CSS rule 1 "tagname[attribute='value']"
driver.findElement(By.cssSelector("a[class='login']")).click();
System.out.println(driver.findElement(By.cssSelector("a[class='login']")).isDisplayed()  + "--Signin Button Found");
System.out.println("---------------------");

//Css rule 2 "tagname#id-value"
driver.findElement(By.cssSelector("input#email_create")).sendKeys("Sam2019C@yahoo.com");
System.out.println(driver.findElement(By.cssSelector("input#email_create")).isSelected()+"-- Email address is Selected");
System.out.println("---------------------");

//Css rule 3 "tagname.class-value" (we used . for each space)
driver.findElement(By.cssSelector("button.btn.btn-default.button.button-medium.exclusive")).click();	
System.out.println("---------------------");

System.out.println(driver.findElement(By.cssSelector("button.btn.btn-default.button.button-medium.exclusive")).isEnabled()+"--Click Crerate An Account Button");
//Css rule 5 "#id-value"
driver.findElement(By.cssSelector("#id_gender1")).click();
System.out.println(driver.findElements(By.cssSelector("#id_gender1")).size()+ "--Count");
System.out.println("---------------------");

//Css rule - 6 "tagname[attribute*='sub_string_slashunder']"
driver.findElement(By.cssSelector("input[id*='_gender2']")).click();
System.out.println(driver.findElement(By.cssSelector("input[id*='_gender2']")).isDisplayed()+"--Mrs is Displayed");
System.out.println(driver.findElement(By.cssSelector("input[id*='_gender2']")).isSelected()+"--Mrs is Selected");
System.out.println(driver.findElement(By.cssSelector("input[id*='_gender2']")).isEnabled()+"--Mrs is Enabled");
System.out.println(driver.findElements(By.cssSelector("input[id*='_gender2']")).size()+ "--Count");
System.out.println("---------------------");

//Css rule - 7 "tagname[attribute^='start of String']"
driver.findElement(By.cssSelector("input[id^='custo']")).sendKeys("Julia");
System.out.println(driver.findElement(By.cssSelector("input[id^='custo']")).isEnabled()+"--First Name is Enabled");
System.out.println(driver.findElement(By.cssSelector("input[id^='custo']")).isSelected()+"--First Name is Selected");
System.out.println(driver.findElement(By.cssSelector("input[id^='custo']")).isDisplayed()+"--First Name is Displayed");
System.out.println("---------------------");

//Css rule - 8 tagname[attribute1='value'][attribute2='value']
driver.findElement(By.cssSelector("input[id='customer_lastname'][type='text']")).sendKeys("Smith");
System.out.println(driver.findElement(By.cssSelector("input[id='customer_lastname'][type='text']")).isEnabled()+"--Last Name is Enabled");
System.out.println(driver.findElement(By.cssSelector("input[id='customer_lastname'][type='text']")).isSelected()+"--Last Name is Selected");
System.out.println(driver.findElement(By.cssSelector("input[id='customer_lastname'][type='text']")).isDisplayed()+"--Last Name is Displayed");
System.out.println("---------------------");

//Css rule - 9 tag[attribute$='suffix of the string']
driver.findElement(By.cssSelector("input[type$='rd']")).sendKeys("A123$bc00");
System.out.println(driver.findElement(By.cssSelector("input[type$='rd']")).isSelected()+"--Password is Selected");
System.out.println(driver.findElement(By.cssSelector("input[type$='rd']")).isDisplayed()+"--Password is Displayed");
System.out.println("---------------------");

//Css rule 4 .class-value.class-value..... *if multiple value of class with spaces
//waiting 

//CSS rule 1 "tagname[attribute='value']"
WebElement drpDays= driver.findElement(By.cssSelector("select[id='days']"));
drpDays.click();
Select day=new Select(drpDays);
day.selectByIndex(29);
//Css rule 2 "tagname#id-value"
WebElement drpMonths=driver.findElement(By.cssSelector("select#months"));
drpMonths.click();
Select months=new Select(drpMonths);
months.selectByIndex(9);

//Css rule - 7 "tagname[attribute^='start of String']"
WebElement drpYear= driver.findElement(By.cssSelector("select[id^='yea']"));
drpYear.click();
Select year=new Select (drpYear);
year.selectByIndex(1);

//Css rule 5 "#id-value"
driver.findElement(By.cssSelector("#newsletter")).click();
System.out.println(driver.findElement(By.cssSelector("#newsletter")).isSelected()+"--Sign up for our newsletter Button is Selected");
System.out.println(driver.findElement(By.cssSelector("#newsletter")).isDisplayed()+"--Sign up for our newsletter Button is Displayed");
System.out.println("---------------------");

//Css rule - 6 "tagname[attribute*='sub_string_slashunder']"
driver.findElement(By.cssSelector("input[id*='optin']")).click();
System.out.println(driver.findElement(By.cssSelector("input[id*='optin']")).isSelected()+"--Receive special offers from our partners! Button is Selected");
System.out.println(driver.findElement(By.cssSelector("input[id*='optin']")).isDisplayed()+"--Receive special offers from our partners! Button is Displayed");
System.out.println("---------------------");

//Css rule - 7 "tagname[attribute^='start of String']"
driver.findElement(By.cssSelector("input[id^='comp']")).sendKeys("B&C Co");
System.out.println(driver.findElement(By.cssSelector("input[id^='comp']")).isSelected()+"--Company Name is Selected");
System.out.println(driver.findElement(By.cssSelector("input[id^='comp']")).isDisplayed()+"--Company Name is Displayed");
System.out.println("---------------------");

//Css rule - 8 "tagname[attribute1='value'][attribute2='value']"
driver.findElement(By.cssSelector("input[id='address1'][name='address1']")).sendKeys("1234 ABC ST");
System.out.println(driver.findElement(By.cssSelector("input[id='address1'][name='address1']")).isSelected()+"-- Address is Selected");
System.out.println(driver.findElement(By.cssSelector("input[id='address1'][name='address1']")).isDisplayed()+"--Address is Displayed");
System.out.println("---------------------");

//Css rule - 9 "tag[attribute$='suffix of the string']"
driver.findElement(By.cssSelector("input[name$='ty']")).sendKeys("Wood Land");
System.out.println(driver.findElement(By.cssSelector("input[name$='ty']")).isSelected()+"-- City is Selected");
System.out.println(driver.findElement(By.cssSelector("input[name$='ty']")).isDisplayed()+"--City is Displayed");
System.out.println("---------------------");

//CSS rule 1 "tagname[attribute='value']"
WebElement drpState=driver.findElement(By.cssSelector("select[id='id_state']"));
drpState.click();
Select state=new Select(drpState);
state.selectByIndex(49);

//Css rule 5 "#id-value"
driver.findElement(By.cssSelector("#postcode")).sendKeys("99999");
System.out.println(driver.findElement(By.cssSelector("#postcode")).isSelected()+"-- Postcode is Selected");
System.out.println(driver.findElement(By.cssSelector("#postcode")).isDisplayed()+"--Postcode is Displayed");
System.out.println("---------------------");

//Css rule - 7 "tagname[attribute^='start of String']"
driver.findElement(By.cssSelector("input[name^='pho']")).sendKeys("703-000-0000");
System.out.println(driver.findElement(By.cssSelector("input[name^='pho']")).isSelected()+"-- Home Phone Number is Selected");
System.out.println(driver.findElement(By.cssSelector("input[name^='pho']")).isDisplayed()+"--Home Phone Number is Displayed");
System.out.println("---------------------");

//Css rule - 8 "tagname[attribute1='value'][attribute2='value']"
driver.findElement(By.cssSelector("input[id='phone_mobile'][name='phone_mobile']")).sendKeys("571-000-0000");
System.out.println(driver.findElement(By.cssSelector("input[id='phone_mobile'][name='phone_mobile']")).isSelected()+"-- Mobile Phone Number is Selected");
System.out.println(driver.findElement(By.cssSelector("input[id='phone_mobile'][name='phone_mobile']")).isDisplayed()+"--Mobile Phone Number is Displayed");
System.out.println("---------------------");




	
	}

}
