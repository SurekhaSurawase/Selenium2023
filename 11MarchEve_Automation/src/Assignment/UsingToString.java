package Assignment;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class UsingToString {

	public static void main(String[] args) throws IOException {
		String path = "D:\\AutomationNotes\\TopisWiseNotes&Programs\\Employee.xlsx";
		FileInputStream file = new FileInputStream(path);
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		//Printing the HR Manger value from excel sheet.
		String Data = workbook.getSheet("Sheet1").getRow(3).getCell(3).getStringCellValue();
		System.out.println(Data);
		
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		
		int rows=sheet.getLastRowNum();
		System.out.println("Last row number in file--->"+rows);
		
		int column=sheet.getRow(0).getLastCellNum();
		System.out.println("Last column number in file--->"+column);
		
		for(int i=0; i<=rows; i++) {
			XSSFRow r =sheet.getRow(i);
			
			for(int j=0;j<column;j++) {
				XSSFCell cell=r.getCell(j);
		
				String cellvalue=cell.toString();  //java method returns string representation of the object
				System.out.print(cellvalue+"||");
			}
			System.out.println();
		}
	}
}