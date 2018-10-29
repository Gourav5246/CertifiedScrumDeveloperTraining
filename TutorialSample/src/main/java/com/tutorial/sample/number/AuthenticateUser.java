/**
 * 
 */
package com.tutorial.sample.number;

/**
 * @author Gourav_Sharma1
 *
 */
public class AuthenticateUser {
	
	DaoImpl daoImpl;

	public AuthenticateUser(DaoImpl dao) {
		// TODO Auto-generated constructor stub
		daoImpl  = dao;
	}

	public boolean IsAuthenticated(UserInfo userInfo) {
		// TODO Auto-generated method stub
		
		UserInfo storedUserInfo = daoImpl.getStoredInfo(userInfo);
		
		if(storedUserInfo.getName().equalsIgnoreCase(userInfo.getName()) &&
				storedUserInfo.getCity().equalsIgnoreCase(userInfo.getCity())) {
			return true;
		}
		return false;
	}

}
