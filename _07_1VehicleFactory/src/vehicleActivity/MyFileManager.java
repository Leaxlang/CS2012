package vehicleActivity;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;


public class MyFileManager{

	public void clearFile(String fileName) {
		try {
			File check = new File(fileName);

			if (check.isFile()) {
				PrintWriter prt = new PrintWriter(check);

				prt.print("");
				prt.close();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	public void appendLine(String lineToPrint, String fileName) {
		try {
			File check = new File (fileName);
			if (check.isFile()) {
				FileWriter fw = new FileWriter(check, true);
				PrintWriter out = new PrintWriter(fw);

				out.println(lineToPrint);
				out.flush();
				out.close();
			}else {
				check.createNewFile();
				FileWriter fw = new FileWriter(check, true);
				PrintWriter out = new PrintWriter(fw);

				out.println(lineToPrint);
				out.flush();
				out.close();

			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}


	public void appendArray(Object[] arrayToPrint, String fileName) {
		try {
			File check = new File(fileName);

			if(check.isFile()) {
				FileWriter fw = new FileWriter(check,  true );
				PrintWriter prt = new PrintWriter(fw);

				for (Object v : arrayToPrint) {
//					prt.println(v.toString());
					prt.println();
				}
				prt.flush();
				prt.close();
			}else {
				check.createNewFile();
				FileWriter fw = new FileWriter(check,  true);
				PrintWriter prt = new PrintWriter(fw);

				for (Object v: arrayToPrint) {
					prt.println(v.toString());
					prt.println();
				}
				prt.flush();
				prt.close();


			}
		}catch (Exception e) {
					e.printStackTrace();
				}
	}
}

		