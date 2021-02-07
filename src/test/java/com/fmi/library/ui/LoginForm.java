package com.fmi.library.ui;

import org.apache.commons.lang.StringUtils;

import com.fmi.library.db.DB;

public class LoginForm {

	private String username;
	private String password;
	private String message;

	public void login() {
		boolean areCredentialsValid = StringUtils.isNotBlank(username) && StringUtils.isNotBlank(password);
		if (areCredentialsValid) {
			message = new DB().login(username, password);

		} else {
			message = "Попълнете всички задължителни полета";
		}

	}

	public String getMessage() {
		return message;
	}

	public void addUsername(String username) {
		this.username = username;
	}

	public void addPassword(String password) {
		this.password = password;
	}

}
