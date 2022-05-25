import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class Workbook {

	public static void main(String[] args) throws IOException, RowsExceededException, WriteException {
		// TODO Auto-generated method stub
      FileOutputStream fo=new FileOutputStream(System.getProperty("user dir")+"/projectfiles/output.xls");
      WritableWorkbook wwb=Workbook.createWorkbook(fo);
		WritableSheet ws=wwb.createSheet("Result", 1);
		int a=20;
		int b=30;
		int c=a*b;
		Label l=new Label(0,0,"C value is"+c);
		ws.addCell(l);
		wwb.write();
		wwb.close();
      
	}

	private static WritableWorkbook createWorkbook(FileOutputStream fo) {
		// TODO Auto-generated method stub
		return null;
	}

	}

