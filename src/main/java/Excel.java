//import java.io.File;
//import java.io.FileInputStream;
//
//import java.io.IOException;
//import java.text.SimpleDateFormat;
//import java.util.Date;
//
//import org.apache.poi.ss.usermodel.Cell;
//import org.apache.poi.ss.usermodel.DateUtil;
//import org.apache.poi.ss.usermodel.Row;
//import org.apache.poi.ss.usermodel.Sheet;
//import org.apache.poi.ss.usermodel.Workbook;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//
//
//public class Excel {
//	public void data() throws IOException
//	{
//	File loc = new File("C:\\Users\\vignesh\\eclipse-workspace\\Webtesting\\src\\testdata\\excel.xlsx");
//	FileInputStream stream = new FileInputStream(loc);
//	Workbook w = new XSSFWorkbook(stream);
//	Sheet s = w.getSheet("Sheet1");
//	Row r = s.getRow(0);
//	Cell c = r.getCell(0);
//	System.out.println(s.getPhysicalNumberOfRows());
//	for(int i=0;i<s.getPhysicalNumberOfRows();i++) 
//	{
//		System.out.println(i);
//		Row R = s.getRow(i);
//		for(int j=0;j<r.getPhysicalNumberOfCells();j++)
//		{
//			Cell v = R.getCell(j);
////			System.out.println(v);
//			int type = v.getCellType();
//			if(type==1)
//			{
//				String name = v.getStringCellValue();
//				System.out.println(name);
//			}
//			else if(type==0)
//			{
//				if(DateUtil.isCellDateFormatted(v))
//				{
//					Date datecellvalue = v.getDateCellValue();
//					SimpleDateFormat dd = new SimpleDateFormat("dd-MMM-yy");
//					String val = dd.format(datecellvalue);
//					System.out.println(val);
//				}
//				else
//				{
//					double numeric = v.getNumericCellValue();
//					long l = (long)numeric;
//					String nmb = String.valueOf(l);
//					System.out.println(nmb);
//				}
//			}
//		}
//	}
//	}	
//	public static void main(String[] args) throws Exception {	
//		Excel obj = new Excel();
//		obj.data();
//		
//	}
//}
