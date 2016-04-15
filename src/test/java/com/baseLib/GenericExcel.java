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
	public static String filepath = "../../TestCaseReport.xlsx";
	public static String sheetName = "TestData";
	ArrayList<String> dataSheetList= new ArrayList<String>();
	
	public ArrayList<String> readDataFromExcel (String testCaseName) throws Exception
	{
		FileInputStream inputStream=new FileInputStream(new File(filepath));
		Workbook Excel=WorkbookFactory.create(inputStream);
		Sheet sheet = Excel.getSheet(sheetName);
		int rowCount=sheet.getLastRowNum();
		for(int i=1;i<=rowCount;i++)
		{
			Row row=sheet.getRow(i);
			String testId=row.getCell(0).toString();
			int cellCount = row.getLastCellNum();
			
			if (testId.equals(testCaseName))
			{
				for(int j=0;j<cellCount;j++)
				{
					dataSheetList.add(row.getCell(j).toString());
				}	
			}
		}
			return dataSheetList;
	}
	
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

