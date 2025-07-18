package week6.day4.utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestDataLibrary {

	public  static String[][] readData(String filePath,String sheetName) throws IOException {
		XSSFWorkbook wb = new XSSFWorkbook("./data/"+filePath+".xlsx");
		XSSFSheet sheet = wb.getSheet(sheetName);
		XSSFRow row = sheet.getRow(1);
		int lastRowNum = sheet.getLastRowNum();
		short lastCellNum = row.getLastCellNum();
		String [][] data ;
		data = new String[lastRowNum][lastCellNum]; 
		for (int i = 1; i <= lastRowNum; i++) {
			for (int j = 0; j < lastCellNum; j++) {
				String cellValue = sheet.getRow(i).getCell(j).getStringCellValue();
				data[i-1][j]=cellValue;
			}
		}
		wb.close();
		return data;
	}
}
