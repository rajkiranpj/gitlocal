package PageObjectModel;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;


public class RegisterPage 
{
	WebDriver driver;
	By RegLink=By.linkText("REGISTER");
	By FirstName=By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input");
	By LastName=By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input");
	By Address=By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea");
	By Email=By.xpath("//*[@id=\"eid\"]/input");
	By Phone=By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input");
	By Check=By.id("checkbox1");
	By Skills=By.id("Skills");
	By Country=By.id("countries");
	By Password=By.id("firstpassword");
	By Spassword=By.id("secondpassword");
	By Submit=By.id("submitbtn");
}
RegisterPage(WebDriver d)
{
	driver=d;
}
public void clickRegLink()
{
	driver.findElement(RegLink).click();
}
public void setFirstName(String fname)
{
	driver.findElement(FirstName).sendKeys(fname);
}
public void setLastName(String lname)
{
	driver.findElement(LastName).sendKeys(lname);
}
public void setAddress(String addr)
{
	driver.findElement(Address).sendKeys(addr);
}
public void setEmail(String email)
{
	driver.findElement(Email).sendKeys(email);
}
public void setPhone(String ph)
{
	driver.findElement(Phone).sendKeys(ph);
}
public void setCheck()
{
	driver.findElement(Check).click();
}
public void setSkills(String c)
{
	WebElement ski=driver.findElement(Skills);
	Select drop=new Select(ski);
	drop.selectByVisibleText(c);
}
public void setCountry(String in)
{
	WebElement con=driver.findElement(Country);
	Select drop=new Select(con);
	drop.selectByVisibleText(in);
}
public void setPassword(String pw)
{
	driver.findElement(Password).sendKeys(pw);
}
public void setSPassword(String pwt)
{
	driver.findElement(Spassword).sendKeys(pwt);
}
public void clickSubmit()
{
	driver.findElement(Submit).click();
}