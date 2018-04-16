package parameter;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;
import org.testng.annotations.Test;

public class GetRowColumnFromExcelSheet {

	@Test
	public void excelSheet() throws IOException {
		XSSFWorkbook wBook=new XSSFWorkbook("./data/TC001.xlsx");
		XSSFSheet sheet = wBook.getSheet("createlead");
		int lastRowNum = sheet.getLastRowNum();
		System.out.println("Row Count: "+lastRowNum);
		XSSFRow firstRow = sheet.getRow(0);
		int lastCellNum = firstRow.getLastCellNum();
		System.out.println("Column Count: "+lastCellNum);
		XSSFRow secondRow = sheet.getRow(1);
		System.out.println("Second Row Value Is: "+secondRow);
		XSSFCell cell = secondRow.getCell(2);
		String stringCellValue = cell.getStringCellValue();
		System.out.println("Third Column Value is: "+stringCellValue);
		wBook.close();
	}

}
