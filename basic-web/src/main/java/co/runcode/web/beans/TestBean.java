package co.runcode.web.beans;

import java.util.Date;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;

import co.runcode.bo.idm.UserLBO;

@ManagedBean
@ViewScoped
public class TestBean {
	
	private String name;
	private Date lastLogin;
	private String selectedMenu;
	
	@Inject 
    UserLBO userLBO;
	
	public TestBean(){		
		System.out.println("UserBean()");
		this.name = "";
		this.selectedMenu = "";		
	}
	
	@PostConstruct
	public void postContruct(){
		System.out.println("postContruct()...");
		this.name = "Luis";
		this.lastLogin = userLBO.getLastLogin();
		this.selectedMenu = "home";
	}
	
	public String setHome(){
		this.selectedMenu = "home";
		return null;
	}
	public String setPerson(){
		this.selectedMenu = "person";
		return null;
	}
	
	public String setMenu3(){
		this.selectedMenu = "menu2";
		return null;
	}
	
	public String setMenu4(){
		this.selectedMenu = "menu3";
		return null;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getLastLogin() {
		return lastLogin;
	}

	public void setLastLogin(Date lastLogin) {
		this.lastLogin = lastLogin;
	}

	public String getSelectedMenu() {
		return selectedMenu;
	}

	public void setSelectedMenu(String selectedMenu) {
		this.selectedMenu = selectedMenu;
	}

}
