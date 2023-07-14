package com.testData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class TestDataRead {

	@Test
	public void readExcel() throws Exception {
		File file = new File("D:\\MyWorkspace\\Selenium_Training_8_30\\TestData\\TestData.xlsx");
		FileInputStream fis = new FileInputStream(file);

		XSSFWorkbook book = new XSSFWorkbook(fis);

		// XSSFSheet sheet=book.getSheet("Login_sheet");
		XSSFSheet sheet = book.getSheetAt(0);
//		String val = sheet.getRow(0).getCell(0).getStringCellValue();
//		System.out.println(val);
//		val = sheet.getRow(0).getCell(1).getStringCellValue();
//		System.out.println(val);
//		val = sheet.getRow(0).getCell(2).getStringCellValue();
//		System.out.println(val);
//
//		val = sheet.getRow(1).getCell(0).getStringCellValue();
//		System.out.println(val);
//		val = sheet.getRow(1).getCell(1).getStringCellValue();
//		System.out.println(val);
//		val = sheet.getRow(1).getCell(2).getStringCellValue();
//		System.out.println(val);

		// get the last row number
		int rcount = sheet.getLastRowNum();
		for (int i = 0; i <= rcount; i++) {
			String data = sheet.getRow(i).getCell(2).getStringCellValue();
			System.out.println("Values is : " + data);
			
			// get the last cell number in a each row.
			int cCount = sheet.getRow(i).getLastCellNum();
//			for (int j = 0; j < cCount; j++) {
//
//				String data = sheet.getRow(i).getCell(j).getStringCellValue();
//				System.out.println("Values is : " + data);
//			}

		}

	}

}
