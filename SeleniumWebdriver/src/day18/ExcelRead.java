package day18;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		FileInputStream f=new FileInputStream("c:\\users\\sai\\desktop\\Book1.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(f);
		XSSFSheet ws=wb.getSheet("Sheet1");
		Iterator<Row> row=ws.iterator();
		while(row.hasNext())
		{
			Row r=row.next();
			Iterator<Cell> cell=r.iterator();
			while(cell.hasNext())
			{
				Cell c=cell.next();
				if(c.getCellType()==c.CELL_TYPE_STRING)
				    System.out.print(c.getStringCellValue()+"   ");
				else if(c.getCellType()==c.CELL_TYPE_NUMERIC)
					System.out.print(c.getNumericCellValue()+"  ");
		
			}
			System.out.println();
		}
		
		
		
		
		
	}

}
