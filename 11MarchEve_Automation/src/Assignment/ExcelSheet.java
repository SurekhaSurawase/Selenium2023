package Assignment;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelSheet {

	public static void main(String[] args) throws IOException {
		
		String path = "D:\\AutomationNotes\\TopisWiseNotes&Programs\\Employee.xlsx";
		FileInputStream file = new FileInputStream(path);
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		//Printing the HR Manger value from excel sheet.
		String Data = workbook.getSheet("Sheet1").getRow(3).getCell(3).getStringCellValue();
		System.out.println(Data);
		
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		int row = sheet.getLastRowNum();
		System.out.println("No of rows are"+row);
		int columns = sheet.getRow(0).getLastCellNum();
		System.out.println(columns);
		System.out.println("No of columns are"+columns);
	
		for(int i=0; i<=row;i++) {
		
			XSSFRow rowvalues = sheet.getRow(i);
			
			for(int j = 0; j<columns; j++) {
				XSSFCell cell = rowvalues.getCell(j)	;	
				switch(cell.getCellType()) {
				case STRING: 
					System.out.print(cell.getStringCellValue());
					break;
				case NUMERIC:
					System.out.print(cell.getNumericCellValue());
					break;
				case BOOLEAN:
					System.out.print(cell.getBooleanCellValue());
					break;
				}
				System.out.println(" ");
			}
			System.out.println();
		}		
	}

}
