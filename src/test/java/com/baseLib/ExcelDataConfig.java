package com.baseLib;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataConfig 
{
	public static String filepath = BaseTestPage.sDirPath+"\\ExcelFile\\InputData.xlsx";
	public static String sheetName = "Sheet1";
	XSSFWorkbook wb;
	XSSFSheet sh;
	
	public ExcelDataConfig(String excelPath)
	{
		try
		{
			File src = new File(excelPath);
			FileInputStream fis=new FileInputStream(src);
			wb=new XSSFWorkbook(fis);
		}
		catch(Exception e)
		{	
			System.out.println(e.getMessage());
		}
	}
	
	public String getData(int sheetNum,int row,int column)
	{
		sh=wb.getSheetAt(sheetNum);
		String data =sh.getRow(row).getCell(column).getStringCellValue();
		return data;
	}
	
	public int getRowCount(int sheetIndex)
	{
		int row=wb.getSheetAt(sheetIndex).getLastRowNum();
		row = row+1;
		return row;
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
