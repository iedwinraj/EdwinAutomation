package com.qa.verifyroleacess.utils;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelwithArray {
	static Object [] [] data;

	public static Object [][] readData (String dataSheetName) {
		// TODO Auto-generated method stub
		
//		XSSFWorkbook wb;
		
			OPCPackage pkg;
			try {
				pkg = OPCPackage.open("./Data/"+ dataSheetName+".xlsx");
				  XSSFWorkbook wb = new XSSFWorkbook(pkg);
			       // work with the wb object
			       
	//			wb = new XSSFWorkbook("./Data/"+ dataSheetName+".xlsx");
				XSSFSheet TC001 = wb.getSheet("Sheet1");
				int Rowcount = TC001.getLastRowNum();
				System.out.println("No.of Rows"+ Rowcount);
				 int columncount = TC001.getRow(0).getLastCellNum();
				 System.out.println("No. of Columns"+ columncount);
				 data = new Object [Rowcount] [columncount]; 
				 for (int i = 1; i <= Rowcount; i++) {
					 XSSFRow row=TC001.getRow(i);
					 for (int j = 0; j < columncount; j++) {
				//	 for (int j = 0; j < 5; j++) {
						XSSFCell cell=row.getCell(j);
						data [i-1] [j] = cell.getStringCellValue();
						
			}
				 }	 
				 	 }catch (InvalidFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			return data;
			
	}
	
	}	
	
