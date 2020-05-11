package com.amazon.excel;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelData {

	public static String read(int row, int cell) throws IOException {

		/*
		 * create an object of Workbook and pass the FileInputStream object into it to
		 * create a pipeline between the sheet and eclipse
		 */
		FileInputStream fis = new FileInputStream("./src/test/resources/data.xlsx");
		Workbook wb = new XSSFWorkbook(fis);

		// call the getSheet() method of Workbook and pass the Sheet Name here.
		Sheet sheet = wb.getSheet("Sheet1");

		String data = sheet.getRow(row).getCell(cell).getStringCellValue();
		return data;
	}

}
