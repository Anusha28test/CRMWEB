package Excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.google.common.collect.Table.Cell;

public class readingdata
{
public static void main(String[] args) throws IOException 
{
	FileInputStream file = new FileInputStream("C:\\Users\\AnushaM\\eclipse-workspace\\selenium\\CRMWEB\\testdata\\testdata2.xlsx");
	XSSFWorkbook Workbook = new XSSFWorkbook(file);
	XSSFSheet sheet = Workbook.getSheet("Sheet1");
	int totalrows = sheet.getLastRowNum();
	int totalCells=sheet.getRow(1).getLastCellNum();
	
	System.out.println("number of rows:"+ totalrows);
	System.out.println("number of cells:"+ totalCells);
	for(int r=0;r<=totalrows;r++) // reading particular row 
	{
		 XSSFRow currentRow=sheet.getRow(r);
		for(int c=0;c<totalCells;c++) //reading the cell for particular cell
		{
			XSSFCell cell=currentRow.getCell(c);
			System.out.println(cell.toString()+"\t");
		}
		System.out.println();
	}
	Workbook.close();
	file.close();
}
}
