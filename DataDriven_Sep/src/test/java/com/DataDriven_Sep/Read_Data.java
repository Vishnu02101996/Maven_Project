package com.DataDriven_Sep;

import java.io.File; 
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Data {
	public static Workbook w;
	public static Sheet sheetName;
	
	public static void particular_Data() throws IOException {
		
		Row row = sheetName.getRow(0);
		Cell cell = row.getCell(0);
		CellType Type = cell.getCellType();
		if (Type.equals(CellType.STRING)) {
			String stringCellValue = cell.getStringCellValue();
			System.out.println(stringCellValue);
		} else if (Type.equals(CellType.NUMERIC)) {
			double numericCellValue = cell.getNumericCellValue();
			int value = (int) numericCellValue;
			System.out.println(value);
		}

	}
	
	public static void allData() throws IOException {
		int NumberOfRows = sheetName.getPhysicalNumberOfRows();
		for (int i = 0; i < NumberOfRows; i++) {
			Row row = sheetName.getRow(i);
			int numberOfCells = row.getPhysicalNumberOfCells();
			for (int j = 0; j < numberOfCells; j++) {
				Cell cell = row.getCell(j);
				CellType Type = cell.getCellType();
				if (Type.equals(CellType.STRING)) {
					String stringCellValue = cell.getStringCellValue();
					System.out.println(stringCellValue);
				} else if (Type.equals(CellType.NUMERIC)) {
					double numericCellValue = cell.getNumericCellValue();
					int value = (int) numericCellValue;
					System.out.println(value);

				}
			}
		}
	}

	public static void particular_Row_Data() throws IOException {

		Row row = sheetName.getRow(1);
		int numberOfCells = row.getPhysicalNumberOfCells();
		for (int i = 0; i < numberOfCells; i++) {
			Cell cell = row.getCell(i);
			CellType Type = cell.getCellType();
			if (Type.equals(CellType.STRING)) {
				String stringCellValue = cell.getStringCellValue();
				System.out.println(stringCellValue);
			} else if (Type.equals(CellType.NUMERIC)) {
				double numericCellValue = cell.getNumericCellValue();
				int value = (int) numericCellValue;
				System.out.println(value);
			}
		}
	}

	public static void particular_Cell_Data() throws IOException {

		int numberOfRows = sheetName.getPhysicalNumberOfRows();
		for (int i = 0; i < numberOfRows; i++) {
			Row row = sheetName.getRow(i);
			Cell cell = row.getCell(1);
			CellType Type = cell.getCellType();
			if (Type.equals(CellType.STRING)) {
				String stringCellValue = cell.getStringCellValue();
				System.out.println(stringCellValue);
			} else if (Type.equals(CellType.NUMERIC)) {
				double numericCellValue = cell.getNumericCellValue();
				int value = (int) numericCellValue;
				System.out.println(value);
			}
		}
	}

	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\Users\\WELCOME\\eclipse-workspace\\DataDriven_Sep\\TestData\\Test_Data_Bikes.xlsx");
		FileInputStream fis = new FileInputStream(f);
		w = new XSSFWorkbook(fis);
		sheetName = w.getSheetAt(0);
		System.out.println("1.Getting Particular Data");
		particular_Data();
		System.out.println("2.Getting All Data");
		allData();
		System.out.println("3.Getting Particular Row Data");
		particular_Row_Data();
		System.out.println("4.Getting Particular Cell Data");
		particular_Cell_Data();

	}

}
