package co.runcode.web.beans.idm;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import javax.faces.FacesException;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.faces.event.ComponentSystemEvent;
import javax.inject.Inject;

import org.picketlink.Identity;
import org.picketlink.Identity.AuthenticationResult;

@ManagedBean
@ViewScoped
public class LoginBean {
	
	private FacesContext facesContext;
	
	@Inject
	private Identity identity;
	
	public LoginBean(){
		
	}
	
	public String login() throws IOException {
		System.out.println("loginBean.login()");
		AuthenticationResult result = identity.login();
		if (result == AuthenticationResult.SUCCESS){			
			return "/app/index.jsf";
		}
		return null;
	}
	
	public void redirectLoggedInUsers(ComponentSystemEvent event) throws IOException {
		facesContext = FacesContext.getCurrentInstance();
		if ( this.identity.isLoggedIn() ) {
			System.out.println("is isLogged in");
			String result = getApplicationUri() + "/app/index.jsf";
			facesContext.getExternalContext().redirect(result);
		}
	}
	
	public void redirectLoggedOutUsers(ComponentSystemEvent event) throws IOException {
		facesContext = FacesContext.getCurrentInstance();
		if ( !(this.identity.isLoggedIn()) ) {
			System.out.println("is isLogged out");
			String result = getApplicationUri() + "/signin.jsf";
			facesContext.getExternalContext().redirect(result);
		}
	}

	public String getApplicationUri() {
		try {
			facesContext = FacesContext.getCurrentInstance();
			ExternalContext ext = facesContext.getExternalContext();
			URI uri = new URI(ext.getRequestScheme(), null,
					ext.getRequestServerName(), ext.getRequestServerPort(),
					ext.getRequestContextPath(), null, null);
			return uri.toASCIIString();
		} catch (URISyntaxException e) {
			throw new FacesException(e);
		}
	}
	
}
