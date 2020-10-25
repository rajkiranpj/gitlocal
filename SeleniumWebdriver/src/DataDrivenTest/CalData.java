package DataDrivenTest;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class CalData {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-sbi-bsb001.html");
		driver.manage().window().maximize();
		
		FileInputStream file=new FileInputStream("C://Users//Rajkiran//Desktop//SDET//Selenium Java//CalData.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		int rowcount= sheet.getLastRowNum();
		
		for(int i=1;i<=rowcount;i++)
		{
			XSSFRow row=sheet.getRow(i);
			
			// int princ =(int) row.getCell(0).getNumericCellValue();
			
			XSSFCell princell= row.getCell(0);
			int princ= (int)princell.getNumericCellValue();
			
			XSSFCell roi = row.getCell(1);
			int rateofinterest = (int)roi.getNumericCellValue();
			
			XSSFCell period=row.getCell(2);
			int per =(int) period.getNumericCellValue();
			
			XSSFCell frequency =row.getCell(3);
			String freq=(String) frequency.getStringCellValue();
			
			XSSFCell maturity = row.getCell(4);
			int expvalue = (int) maturity.getNumericCellValue();
			
			driver.findElement(By.id("principal")).sendKeys(String.valueOf(princ));
			driver.findElement(By.id("interest")).sendKeys(String.valueOf(rateofinterest));
			driver.findElement(By.id("tenure")).sendKeys(String.valueOf(per));
			
			Select periodcombo= new Select(driver.findElement(By.id("tenurePeriod")));
			periodcombo.selectByVisibleText("year(s)");
			
			Select fqcy= new Select(driver.findElement(By.id("frequency")));
			fqcy.selectByVisibleText("Simple Interest");
			
			
			driver.findElement(By.xpath("//*[@id=\"fdMatVal\"]/div[2]/a[1]/img")).click();
			
			String actual=driver.findElement(By.xpath("//*[@id=\"resp_matval\"]/strong")).getText();
			if(Double.parseDouble(actual)==expvalue)
			{
				System.out.print("Test Successful");
				
			}else
			{
				System.out.print("Test Failed");
			}
			driver.findElement(By.xpath("//*[@id=\"fdMatVal\"]/div[2]/a[2]/img")).click();
			
			
		}
		
		
		

	}

}
