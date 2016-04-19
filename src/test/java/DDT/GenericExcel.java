package DDT;

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
	public static String filepath = "C:\\Manjunath_Rajeev\\Project_WorkSpace\\CbtCrowdEmail\\TestData\\Result.xlsx";
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
	
	public static void WriteData(String Status, String Data, String exception) throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		
		FileInputStream file=new FileInputStream(filepath);
		Workbook Excel=WorkbookFactory.create(file);
		Sheet sheet = Excel.getSheet("Sheet1");
		int lastrow=sheet.getLastRowNum();
		Row row=sheet.createRow(lastrow+1);
		Cell celldata=row.createCell(0);
		celldata.setCellValue(Data);
//		String value=sheet.getRow(lastrow).getCell(0).toString();
//		double d= Double.parseDouble(value);
//		int valueofcell= (int)d;
//		cellSlno.setCellValue(++valueofcell);
		Cell cellStatus=row.createCell(1);
		cellStatus.setCellValue(Status);
		Cell cellcount=row.createCell(2);
		cellcount.setCellValue(exception);
		FileOutputStream out=new FileOutputStream(filepath);
		Excel.write(out);
		out.close();
	}

	
}

