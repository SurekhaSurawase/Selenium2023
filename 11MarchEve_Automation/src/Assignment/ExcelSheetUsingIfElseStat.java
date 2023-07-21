package Assignment;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelSheetUsingIfElseStat {

	public static void main(String[] args) throws IOException {
		
		//using if-else-if statement
		String path = "D:\\AutomationNotes\\TopisWiseNotes&Programs\\Employee.xlsx";
		FileInputStream file = new FileInputStream(path);
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
//		//Printing the HR Manger value from excel sheet.
//		String Data = workbook.getSheet("Sheet1").getRow(3).getCell(3).getStringCellValue();
//		System.out.println(Data);
//		
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		int row = sheet.getLastRowNum();
		System.out.println("No of rows are"+row);
		int columns = sheet.getRow(0).getLastCellNum();
		System.out.println(columns);
		System.out.println("No of columns are"+columns);
		
			for(int i=0; i<=row;i++) {
				XSSFRow rvalue= sheet.getRow(i);
				 for(int j=0; j<columns; j++) {
					 XSSFCell cvalue = rvalue.getCell(j);
					 
					 String cellvalue = "";
					 XSSFCell cell= rvalue.getCell(j);
					 CellType celltype = cell.getCellType();
					 //CellType celltype= cell.getCellType();   //CellType=class
				
				   if(celltype==CellType.STRING) {
					   cellvalue=cell.getStringCellValue();
					}
				
				else if (celltype == CellType.NUMERIC) {
					cellvalue = String.valueOf(cell.getNumericCellValue());
			    }
				
				else if (celltype == CellType.BOOLEAN) {
					cellvalue = String.valueOf(cell.getBooleanCellValue());

			}
		}	
	}

	}
}
