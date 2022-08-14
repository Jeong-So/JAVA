package ch13.web.userinfo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import ch13.domain.userinfo.UserInfo;
import ch13.domain.userinfo.dao.UserInfoDao;
import ch13.domain.userinfo.dao.mysql.UserinfoMysqlDao;
import ch13.domain.userinfo.dao.oracle.UserinfoOracleDao;

public class UserInfoClient {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("db.properties");

		Properties prop = new Properties();
		prop.load(fis);
		
		String dbType = prop.getProperty("DBTYPE");
		
		UserInfo userInfo = new UserInfo();
		userInfo.setUserid("12345");
		userInfo.setPasssword("!@3$5");
		userInfo.setUserName("Lee");
		
		UserInfoDao userinfoDao;
				
				
		if(dbType.equals("ORACLE")) {
			userinfoDao = new UserinfoOracleDao();
		}
		else if(dbType.equals("MYSQL")) {
			userinfoDao = new UserinfoMysqlDao();
		}
		else {
			System.out.println("db error");
			return;
		}
		
		userinfoDao.insertUserInfo(userInfo);
		userinfoDao.updateUserInfo(userInfo);
		userinfoDao.deleteUserInfo(userInfo);
		
	}

}
