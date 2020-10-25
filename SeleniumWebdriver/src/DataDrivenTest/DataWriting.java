package DataDrivenTest;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;

public class DataWriting {

	public static void main(String[] args) throws IOException {
		FileOutputStream file = new FileOutputStream("C://Users//Rajkiran//Desktop//SDET//Selenium Java//WriteData1.xlsx");
		
		XSSFWorkbook workbook= new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("Sheet1");
		
		for(int i=0;i<=5;i++)
		{
			XSSFRow row =sheet.createRow(i);
			for(int j=0;j<=3;j++)
			{
				row.createCell(j).setCellValue("xyz");
			}
		}
		
		workbook.write(file);
		file.close();
		System.out.println("File Created ");
		

	}

}
