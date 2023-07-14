package com.testData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Write_Excel {

	@Test
	public void readExcel() throws Exception {
		File f = new File("D:\\MyWorkspace\\Selenium_Training_8_30\\TestData\\Read_Excel.xlsx");
		FileInputStream fis = new FileInputStream(f);
		XSSFWorkbook book = new XSSFWorkbook(fis);
		//book.createSheet("Read_Excel");
		XSSFSheet sheet = book.getSheet("Read_Excel");

		sheet.createRow(0).createCell(0).setCellValue("Testing");
		sheet.getRow(0).createCell(1).setCellValue("Selenium");

		sheet.createRow(1).createCell(0).setCellValue('T');
		sheet.getRow(1).createCell(1).setCellValue("Test");

		FileOutputStream fos = new FileOutputStream(f);
		book.write(fos);
		book.close();
		System.out.println("Writing data");

	}

}
