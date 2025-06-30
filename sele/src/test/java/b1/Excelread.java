package b1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelread {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\Testdatafiles\\testdata.xlsx");
		
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		XSSFSheet sh1 = wb.getSheetAt(0);
		
		
		int totalR = sh1.getLastRowNum();
		int totalc = sh1.getRow(1).getLastCellNum();
		
		System.out.println("total "+totalR + " "+ totalc);
		
		for(int r=0; r<=totalR; r++)
		{
			XSSFRow row = sh1.getRow(r);
			
			for(int c=0; c<totalc;c++) 
			{
				XSSFCell cell = row.getCell(c);
				System.out.print(cell.toString()+"\t");

				
				
			}
			System.out.println();
		}
		wb.close();
		fis.close();
		//writedata();
		forloopwritedata();
		
	}
	
	public static void writedata() throws IOException
	{
	
		FileOutputStream fo = new FileOutputStream(System.getProperty("user.dir")+"\\Testdatafiles\\testdata22.xlsx");
		
		XSSFWorkbook wb= new XSSFWorkbook();
		XSSFSheet sh = wb.createSheet("shee22");
		
		XSSFRow row1 = sh.createRow(0);
			
			row1.createCell(0).setCellValue("rajaj");
			row1.createCell(1).setCellValue("babba");
			
			
			XSSFRow row2 = sh.createRow(1);
		
			row2.createCell(0).setCellValue("2n");
			row2.createCell(1).setCellValue("2nnn");
			
		

			XSSFRow row3 = sh.createRow(2);
		
			row3.createCell(0).setCellValue("3n");
			row3.createCell(1).setCellValue("3nnn");
			
			wb.write(fo);
		
		
		
			wb.close();
			fo.close();
		
		
		
		
	}

	public static void forloopwritedata() throws IOException
	{
	
		FileOutputStream fo = new FileOutputStream(System.getProperty("user.dir")+"\\Testdatafiles\\testdataforloop.xlsx");
		
		XSSFWorkbook wb= new XSSFWorkbook();
		XSSFSheet sh = wb.createSheet("shee22");
		
		Scanner sc = new Scanner(System.in);
		int nor = sc.nextInt();
		int noc= sc.nextInt();
		
		
		for(int r=0; r<=nor; r++)
		{
			XSSFRow row = sh.createRow(r);
			{
				for(int c=0; c<noc; c++)
				{
				
					XSSFCell cell= row.createCell(c);
					cell.setCellValue(sc.next());
				}
			}
			
		}
		
		
			
			wb.write(fo);
		
		
		
			wb.close();
			fo.close();
		System.out.println("file create");
		
		
		
	}
}
