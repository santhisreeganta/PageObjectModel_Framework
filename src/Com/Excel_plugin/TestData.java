package Com.Excel_plugin;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

public class TestData {

	public static void main(String[] args) throws InvalidFormatException, IOException {
		// TODO Auto-generated method stub
		
				
	String testdata_path=System.getProperty("user.dir")+"\\Testdata\\TestData.xlsx";
				
				
	ReadExceldata data=new ReadExceldata(testdata_path);
	data.loadExcelfile();
    data.rowCount("Testdata");
	data.colCount("Testdata");
	data.getTestcaseposition("Testdata", "TC_01Siginpage");
	data.getcolpositin("Testdata", "GenderTitle");
	String test= data.getData("Testdata", "TC_01Siginpage", "Gender");	
		System.out.println(test);
		
	}

}
