package Trial;

import java.util.ArrayList;

import com.pega.uiframework.utils.Xls_Reader;

public class Testutil {
	static Xls_Reader Reader;
	public static ArrayList<Object[]> getDatafromExcel() throws Exception{
		
		
		ArrayList<Object[]> myData = new ArrayList<Object[]>();
		try {
					Reader = new Xls_Reader("D:\\IMP Data\\faremwork\\src\\test data\\registration.xlsx");
		}catch (Exception e) {
			e.printStackTrace();
		}
		 for(int rowNum = 2; rowNum<= Reader.getRowCount("RegTestData"); rowNum++){
			 
			 
			 Thread.sleep(6000);
			String fullname = Reader.getCellData("RegTestData", "fullname", rowNum);
			String email = Reader.getCellData("RegTestData", "email", rowNum);
			String pass = Reader.getCellData("RegTestData", "pass", rowNum);
			String repass = Reader.getCellData("RegTestData", "repass", rowNum);
			String loc = Reader.getCellData("RegTestData", "loc", rowNum);
			String school = Reader.getCellData("RegTestData", "school", rowNum);
			String college = Reader.getCellData("RegTestData", "college", rowNum);
			
			
			Object ob[] = {fullname,email,pass,repass,loc,school,college};
			myData.add(ob);			
		 }
		 return myData;
	}
}
