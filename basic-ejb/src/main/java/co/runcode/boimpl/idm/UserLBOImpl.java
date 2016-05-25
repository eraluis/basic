package co.runcode.boimpl.idm;

import java.util.Date;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;

import org.picketlink.idm.IdentityManager;
import org.picketlink.idm.credential.Password;
import org.picketlink.idm.model.basic.BasicModel;
import org.picketlink.idm.model.basic.User;

import co.runcode.bo.idm.UserLBO;
import co.runcode.bo.person.PersonLBO;
import co.runcode.commons.util.DateUtil;
import co.runcode.dm.person.Person;

@Stateless
public class UserLBOImpl implements UserLBO {
	
	@Inject
	private IdentityManager identityManager;
	
	@Inject
	private PersonLBO personLBO;
		
	public UserLBOImpl(){
		
	}
	
	//This is a test method.
	@Override
	public Date getLastLogin(){		
		return DateUtil.getCurrentDate();		
	}

	@Override
	@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
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
										
			return regiterUser(person, userStrg, pwdStrg);

		}else {
			return false;
		}				
	}

}
