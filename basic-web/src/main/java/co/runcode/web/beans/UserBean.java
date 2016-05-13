package co.runcode.web.beans;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

import co.runcode.bo.idm.UserLBO;

@ManagedBean
@ViewScoped
public class UserBean {

	private String loginName;
	private String firstName;
	private String lastName;
	private String password;

	@Inject
	UserLBO userLBO;
	
	public String register() {
		
		boolean registered = userLBO.regiterUser(firstName, lastName, loginName, password);
				
		if(registered){			
			FacesContext.getCurrentInstance().addMessage("signup", 
					new FacesMessage(FacesMessage.SEVERITY_INFO, "Information",  "User registerd successfully") );
			return "signin.jsf";
		}else{			
			FacesContext.getCurrentInstance().addMessage("signup", 
					new FacesMessage(FacesMessage.SEVERITY_WARN, "Warning",  "Username already exists") );
	        return "signup.jsf";
		}
					
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}