package DDT;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataConfig 
{
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
	
	public String getData(int sheetNum,int row,int col)
	{
		sh=wb.getSheetAt(sheetNum);
		String data =sh.getRow(row).getCell(col).getStringCellValue();
		return data;
	}
	
	public int getRowCount(int sheetIndex)
	{
		int row=wb.getSheetAt(sheetIndex).getLastRowNum();
		row = row+1;
		return row;
	}
}
