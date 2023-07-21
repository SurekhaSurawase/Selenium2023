package ExcelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData2 {

public static void main(String[] args) throws IOException {
		String Path = "D:\\Manual testing notes\\Data.xlsx";
		
		FileInputStream file= new FileInputStream(Path);

		XSSFWorkbook workbook = new XSSFWorkbook(file);
		String Data =workbook.getSheetAt(0).getRow(0).getCell(0).getStringCellValue();
		
		System.out.println(Data);
		
		FileInputStream file1= new FileInputStream(Path);

		XSSFWorkbook workbook1 = new XSSFWorkbook(file1);
		double Data1 =workbook.getSheetAt(1).getRow(0).getCell(1).getNumericCellValue();
		
		System.out.println(Data1);
		FileInputStream file2= new FileInputStream(Path);

		XSSFWorkbook workbook2 = new XSSFWorkbook(file2);
		boolean Data2 =workbook.getSheetAt(2).getRow(1).getCell(0).getBooleanCellValue();
		
		System.out.println(Data1);
		FileInputStream file3= new FileInputStream(Path);

		XSSFWorkbook workbook3 = new XSSFWorkbook(file3);
		String Data3 =workbook.getSheetAt(3).getRow(1).getCell(1).getStringCellValue();
		
		System.out.println(Data3);

	}

}
