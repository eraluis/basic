package co.runcode.boimpl.idm;

import java.util.Date;

import javax.ejb.Stateless;
import javax.inject.Inject;

import org.picketlink.idm.IdentityManager;
import org.picketlink.idm.RelationshipManager;
import org.picketlink.idm.credential.Password;
import org.picketlink.idm.model.basic.BasicModel;
import org.picketlink.idm.model.basic.User;

import co.runcode.bo.idm.UserLBO;
import co.runcode.bo.person.PersonLBO;
import co.runcode.commons.util.DateUtil;
import co.runcode.dm.person.Person;

@Stateless
public class UserBOImpl implements UserLBO {
	
	@Inject
	private IdentityManager identityManager;
	
	@Inject 
	private RelationshipManager rm;
	
	@Inject
	private PersonLBO personLBO;
		
	public UserBOImpl(){
		
	}
	
	//This is a test method.
	@Override
	public Date getLastLogin(){		
		return DateUtil.getCurrentDate();		
	}

	@Override
	public boolean regiterUser(Person person, String userStrg, String pwdStrg) {
		
		User user = BasicModel.getUser(this.identityManager, userStrg);
		
		if(user == null){
			user = new User(userStrg);
			user.setFirstName( person.getFirstName() );
			user.setLastName( person.getLastName() );
			Password password = new Password(pwdStrg);
			this.identityManager.add(user);
			this.identityManager.updateCredential(user, password);
			return true;
		
		}else {
			return false;
		}
	}

	@Override
	public boolean regiterUser(String firstName, String lastName, String userStrg, String pwdStrg) {
		
		User user = BasicModel.getUser(this.identityManager, userStrg);
		
		if(user == null){
			Person person = new Person();
			person.setFirstName(firstName);
			person.setLastName(lastName);
			personLBO.add(person);		
			
			user = new User(userStrg);
			user.setFirstName(firstName);
			user.setLastName(lastName);
			Password password = new Password(pwdStrg);
			
			this.identityManager.add(user);
			this.identityManager.updateCredential(user, password);
			
			return true;

		}else {
			return false;
		}				
	}

}
