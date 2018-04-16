package parameter;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelSheet {

	public Object[][] excelSheet() throws IOException {
		XSSFWorkbook wBook=new XSSFWorkbook("./data/TC001.xlsx");
		XSSFSheet sheet = wBook.getSheet("createlead");
		int lastRowNum = sheet.getLastRowNum();
		System.out.println("Row Count: "+lastRowNum);
		XSSFRow headerRow = sheet.getRow(0);
		int lastCellNum = headerRow.getLastCellNum();
		Object[][] data=new Object[lastRowNum][lastCellNum];
		for (int i = 1; i <= lastRowNum; i++) {
			XSSFRow row = sheet.getRow(i);
	
			for (int j = 0; j < lastCellNum; j++) {
				XSSFCell cell = row.getCell(j);
				String stringCellValue = cell.getStringCellValue();
				data[i-1][j]=stringCellValue;
				System.out.println(stringCellValue);
			}
		}
		return data;

	}

}
