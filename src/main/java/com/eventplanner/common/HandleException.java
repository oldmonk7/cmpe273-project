package com.eventplanner.common;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class HandleException {
	
	
	private static void errorCode(MyException e) throws MyException, IOException
	{
		BufferedWriter writer = null;
		int a = 0;
		if(e.getErrorCode() == "FILE_NOT_FOUND_EXCEPTION")
			a = 1;
		else if(e.getErrorCode() == "PAGE_NOT_FOUND_EXCEPTION")
			a = 2;
		else if(e.getErrorCode() == "MONGO_DB_EXCEPTION")
			a = 3;
		else
			a = 4;

		switch(a)
		{
			 case 1:
				 String str1 = "File Not Found, notify user";
				 System.out.println(str1);
	            File logFile1 = new File("logger.log");
//	            System.out.println(logFile1.getCanonicalPath());
				writer = new BufferedWriter(new FileWriter(logFile1,true));
			
				writer.write(str1+"/n");
	            throw e;
			            
			 case 2:
				String str2 = "File Not Found, please notify user";
				System.out.println(str2);
	            File logFile2 = new File("logger.log");
	            System.out.println(logFile2.getCanonicalPath());
	            writer = new BufferedWriter(new FileWriter(logFile2,true));
	            writer.write(str2+"/n");
	            throw e;

			 case 3:
				String str3 = "page not found in database";
				System.out.println(str3);
	            File logFile3 = new File("logger.log");
	            System.out.println(logFile3.getCanonicalPath());
	            writer = new BufferedWriter(new FileWriter(logFile3,true));
	            writer.write(str3+"/n");
	            throw e;
			
		default:
			 System.out.println("Unknown exception occured, for further debugging check log."+e.getMessage());
			 e.printStackTrace();
		}
	}
}
