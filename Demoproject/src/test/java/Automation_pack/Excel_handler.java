package Automation_pack;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.WebDriver;

public class Excel_handler {
	WebDriver driver;
	public Excel_handler(WebDriver driver)
	{
		this.driver=driver;
	}
	
	 static HSSFSheet sh;
		
	 public   void Reading_data(String location,String sheet) throws Exception {
			
			FileInputStream fi=new FileInputStream(location);
			HSSFWorkbook  wb=new HSSFWorkbook(fi);
			 sh=wb.getSheet(sheet);
	 }
		
		public  String read_Excel(int r,int c) {
			
			return sh.getRow(r).getCell(c).getStringCellValue();
		}
		
		}



