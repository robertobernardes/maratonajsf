package br.com.devdojo.maratonajsf.bean.flow;

import java.io.Serializable;

import javax.faces.flow.FlowScoped;
import javax.inject.Named;

@Named
@FlowScoped(value = "pendencies")
public class TesteFlowNestedBean implements Serializable {
	private String userName;
	private String userSurname;
	
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserSurname() {
		return userSurname;
	}
	public void setUserSurname(String userSurname) {
		this.userSurname = userSurname;
	}
	
	
}