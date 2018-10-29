/**
 * 
 */
package com.tutorial.sample.number;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Gourav_Sharma1
 *
 */
public class MockitoStubUsedTCs {

	DaoImpl daoImpl;
	UserInfo userInfo;
	UserInfo storedUserInfo;
	AuthenticateUser authenticateUser;
	UserInfo userInfo1;
	
	@Before
	public void setUp() {
		userInfo = new UserInfo();
		userInfo.setName("Gourav");
		userInfo.setCity("Hyderabad");
		
		userInfo1 = new UserInfo();
		userInfo1.setName("Kapil");
		userInfo1.setCity("Hyderabad");
		
		
		daoImpl = mock(DaoImpl.class);
		storedUserInfo();
		when(daoImpl.getStoredInfo(userInfo)).thenReturn(storedUserInfo);
		
		authenticateUser = new AuthenticateUser(daoImpl);
	}
	
	private void storedUserInfo() {
		storedUserInfo = new UserInfo();
		storedUserInfo.setName("Gourav");
		storedUserInfo.setCity("Hyderabad");
	}
 	@Test
	public void authenticateUserDaoTest() {
		boolean expected = true;
		boolean actual;
		
		actual = authenticateUser.IsAuthenticated(userInfo);
		Assert.assertEquals(expected, actual);
	}
 	
 	@Test
	public void authenticateUserFailureTest() {
		boolean expected = false;
		boolean actual;
		
		when(daoImpl.getStoredInfo(userInfo1)).thenReturn(storedUserInfo);
		
		actual = authenticateUser.IsAuthenticated(userInfo1);
		Assert.assertEquals(expected, actual);
	}

}
