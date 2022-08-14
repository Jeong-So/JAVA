package ch11;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class MyLogger {  // sigleton 패턴
	
	Logger logger = Logger.getLogger("mylogger");  
	private static MyLogger instance = new MyLogger();
	
	public static final String errorLog = "log.txt";
	public static final String warningLog = "warning.txt";
	public static final String fineLog = "fine.txt";
	
	private FileHandler logFile = null;
	private FileHandler warningFile = null;
	private FileHandler fineFile = null;

	// log 레벨 : severe, warning, info, config, fine, finer, finest
	
	private MyLogger(){
	
			try {
				logFile = new FileHandler(errorLog, true);  // errorLog : 파일 이름 / true : append해서 PRINT
				warningFile = new FileHandler(warningLog, true);
				fineFile = new FileHandler(fineLog, true);
				
			} catch (SecurityException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
			logFile.setFormatter(new SimpleFormatter());
			warningFile.setFormatter(new SimpleFormatter());
			fineFile.setFormatter(new SimpleFormatter());
			
			// LOG 레벨 세팅
//			logger.setLevel(Level.ALL);  // 1. severe ~ finest 까지 다 찍겠다
			logger.setLevel(Level.INFO);  // 2.  INFO 다 찍겠다
			fineFile.setLevel(Level.FINE);  // 1일시 fine 레벨부터 찍어라  2일시 INFO 레벨부터 찍힘 (앞줄을 우선 시)
			warningFile.setLevel(Level.WARNING);  // warning 레벨부터 찍어라
			
			logger.addHandler(logFile);
			logger.addHandler(warningFile);
			logger.addHandler(fineFile);
	}	
	
	
	public static MyLogger getLogger(){
//		logger.finest("getLogger start");
		return instance;
	}

	
	public void log(String msg){
		
		logger.finest(msg);
		logger.finer(msg);
		logger.fine(msg);
		logger.config(msg);
		logger.info(msg);
		logger.warning(msg);
		logger.severe(msg);
		
	}
	
	public void fine(String msg){
		logger.fine(msg);
	}
	
	public void warning(String msg){
		logger.warning(msg);
	}
}