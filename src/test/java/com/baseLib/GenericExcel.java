package com.baseLib;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class GenericExcel 
{
	public static String filepath = "C:\\Manjunath_Rajeev\\Project_WorkSpace\\CbtCrowdEmail\\TestData\\InputData.xlsx";
	public static String sheetName = "Sheet1";
	
	public void writeResultToExcel(String result,String testCaseName,String exception) throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		FileInputStream inputStream=new FileInputStream(filepath);
		Workbook Excel=WorkbookFactory.create(inputStream);
		Sheet sheet=Excel.getSheet(sheetName);
		int rowCount=sheet.getLastRowNum();
		for(int i=0;i<=rowCount;i++)
		{
			if (sheet.getRow(i).getCell(0).toString().equals(testCaseName))
			{
				Row row=sheet.getRow(i);
				Cell cell=row.createCell(4);
				cell.setCellType(cell.CELL_TYPE_STRING);
				cell.setCellValue(result);
				Cell cellException=row.createCell(5);
				cellException.setCellType(cell.CELL_TYPE_STRING);
				cellException.setCellValue(exception);
				FileOutputStream fos=new FileOutputStream(filepath);
				Excel.write(fos);
				fos.close();
				System.out.println("Results are Writtened to Excel");
			}
		}
	}
}

