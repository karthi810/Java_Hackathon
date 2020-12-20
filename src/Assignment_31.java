//Q31. Read a file content and write it to a new file in reverse order.(reverse line 1-10 to line 10-1)

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.*;

public class Assignment_31 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		String sPath = System.getProperty("user.dir") + "/ReadFile.txt";
		String sPathW = System.getProperty("user.dir") + "/WriteFile.txt";
		readWriteFile(sPath, sPathW);

	}

	public static void readWriteFile(String sPath, String sPathW) throws Exception {
		String sLine;
		int iLinesCount = 0;
		List<String> temp = new ArrayList<String>();
		FileReader oFR = new FileReader(sPath);
		BufferedReader oBR = new BufferedReader(oFR);

		int k = 0;
		while ((sLine = oBR.readLine()) != null) {
			//sContent = sLine;
			temp.add(sLine);
			System.out.println(sLine);
			 
			iLinesCount++;
		}
		// Write file
		System.out.println("*******************");
		BufferedWriter oBW = null;
		
		try {
			
			FileWriter oFW = new FileWriter(sPathW, true);
			oBW = new BufferedWriter(oFW);
			for (int i = iLinesCount - 1; i >=0 ; i--) {
				System.out.println(temp.get(i));
				oBW.write(temp.get(i));
				oBW.newLine();

			}
		} catch (Exception a) {
			System.out.println("Exception  : " + a);

		} finally {
			oBW.close();
		}

	}

}
