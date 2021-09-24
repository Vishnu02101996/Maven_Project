package com.DataDriven_Sep;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Demo_Read {
public static void main(String[] args) throws Throwable {
	File f=new File("C:\\Users\\WELCOME\\Desktop\\selenium\\TestCasesForMiniProject.xlsx");
	FileInputStream fis=new FileInputStream(f);
	Workbook w=new XSSFWorkbook(fis);
	Sheet sheetAt = w.getSheetAt(0);
	Row row = sheetAt.getRow(21);
	Cell cell = row.getCell(5);
	
	double numericCellValue = cell.getNumericCellValue();
	//String value = Double.toString(numericCellValue);
	int value=(int) numericCellValue;
	//String string = Integer.toString(value);
	System.out.println(value);
	
	 
	
	
}
}
