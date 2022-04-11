package pages;

import base.BasePage;

public class LoginPage extends BasePage {

	String userName = "xpath=//*[@id=\"user-name\"]";
	String passwordString = "xpath=//*[@id=\"password\"]";
	String loginButtonString = "xpath=//*[@id=\"login-button\"]";

	public void doLogin(String UserName,String password) {
		type(userName, UserName);
		type(passwordString, password);
		click(loginButtonString);
		
	}
}
