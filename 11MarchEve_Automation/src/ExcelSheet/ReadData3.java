package ExcelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData3 {

	private static final XSSFCell STRING = null;

	public static void main(String[] args) throws IOException {
		String Path = "./TestData//StudentInfo.xlsx";
		
		FileInputStream file= new FileInputStream(Path);

		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		XSSFSheet sheet =workbook.getSheet("Sheet4");
		int Rows= sheet.getLastRowNum();
		System.out.println("No of rows= "+Rows);
		int columns= sheet.getRow(0).getLastCellNum();
		
		for(int i=0; i<=Rows; i++) {
			XSSFRow row = sheet.getRow(i);
			
			for(int j=0; j<columns; j++) {
				XSSFCell cell= row.getCell(j);
				
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
				System.out.println("||");			
			}
			System.out.println();
		}
	}

}
