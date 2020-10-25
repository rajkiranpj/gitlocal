package DataDrivenTest;

import java.io.FileInputStream;

import java.io.*;

import org.apache.poi.xssf.usermodel.*;

public class ReadingDataFromExcel {

	public static void main(String[] args) throws IOException {
		
		FileInputStream file = new FileInputStream("C://Users//Rajkiran//Desktop//SDET//Selenium Java//Book1.xlsx");
		
		XSSFWorkbook workbook= new XSSFWorkbook(file);
		
		XSSFSheet sheet=workbook.getSheet("Sheet1"); // Sheet name , or Index getSheetAt(0,1)etc
		
		int rowcount= sheet.getLastRowNum(); // row count returns
		int colcount = sheet.getRow(0).getLastCellNum(); // returns coloumn
		
		for(int i=0;i<rowcount;i++)
		{
			XSSFRow currentrow=sheet.getRow(i);// focued on current row 
			for(int j=0;j<colcount;j++)
			{
				String value=currentrow.getCell(j).toString();//read value from string
				System.out.print("                             "+value);
			}
			System.out.println("  ");
		}
		
		}

}
