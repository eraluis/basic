package co.runcode.bo.idm;

import java.util.Date;
import co.runcode.dm.person.Person;

import javax.ejb.Local;

import org.picketlink.idm.IdentityManagementException;

@Local
public interface UserLBO {

	public Date getLastLogin();
	
	public boolean regiterUser(Person person, String user, String password) throws IdentityManagementException;		
	public boolean regiterUser(String firstName, String lastName, String user, String password) throws IdentityManagementException;

}
