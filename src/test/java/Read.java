import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Read {

	public static void main(String[] args) throws IOException {
		File loc=new File("C:\\Users\\home\\eclipse-workspace"
				+ "\\eclipse workspace\\Readexel\\"
				+ "Readxl\\readdata.xlsx");
		FileInputStream f=new FileInputStream(loc);
		Workbook wb=new XSSFWorkbook(f);
		Sheet sh=wb.getSheet("da");
		Row row = sh.getRow(1);
		row.getCell(1);
		/*for(int i=0; i< sh.getPhysicalNumberOfRows(); i++) {
			Row row=sh.getRow(i);
			for (int j=0;j<row.getPhysicalNumberOfCells();j++) {
				Cell cell=row.getCell(j);
				System.out.println(cell.getStringCellValue());
			}
		}*/
	}

			
			
	}


