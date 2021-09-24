package com.DataDriven_Sep;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_Data {

	public static void write_Data() throws Throwable {
		
	File f=new File("C:\\Users\\WELCOME\\Desktop\\selenium\\Test_Info.xlsx");
	FileInputStream fis=new FileInputStream(f);
	Workbook w=new XSSFWorkbook(fis);
	Sheet createSheet = w.createSheet("Bikes");
	Row createRow = createSheet.createRow(0);
	Cell createCell = createRow.createCell(0);
	createCell.setCellValue("Bike Company");
	w.getSheet("Bikes").getRow(0).createCell(1).setCellValue("Bike Model");
	w.getSheet("Bikes").createRow(1).createCell(0).setCellValue("Yamaha");
	w.getSheet("Bikes").getRow(1).createCell(1).setCellValue("Fzs v2");
	w.getSheet("Bikes").createRow(2).createCell(0).setCellValue("Bajaj");
	w.getSheet("Bikes").getRow(2).createCell(1).setCellValue("Pulsar ns200");
	FileOutputStream fos= new FileOutputStream(f);
	w.write(fos);
	w.close();
	System.out.println("write done");
	}
	
	
	public static void main(String[] args) throws Throwable {
		write_Data();
	}

}
