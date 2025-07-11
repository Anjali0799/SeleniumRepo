package MarathonSession3;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestLibraryData {
	/*
	 * Step1-> Set path for workbook step2-> Get into the sheet Step3-> Get into Row
	 * * values Step4-> Get into cell values Step5-> Read Data from workbook and
	 * store it in 2D array Step6-> close the workbook and return 2D array
	 */
	
	public  static String[][] readData(String filePath,String sheetName) throws IOException {
		XSSFWorkbook wb = new XSSFWorkbook("./data/" + filePath +".xlsx");
		XSSFSheet sheet = wb.getSheet(sheetName);
		XSSFRow row = sheet.getRow(0);
		int lastRowNum = sheet.getLastRowNum();
		short lastCellNum = row.getLastCellNum();
		String [][] data ;
		data = new String[lastRowNum][lastCellNum]; //initialization of 2D ARRAY
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