package co.runcode.bo.config;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.picketlink.annotations.PicketLink;
import org.picketlink.idm.IdentityManager;
import org.picketlink.idm.RelationshipManager;
import org.picketlink.idm.credential.Password;
import org.picketlink.idm.model.basic.BasicModel;
import org.picketlink.idm.model.basic.Group;
import org.picketlink.idm.model.basic.Role;
import org.picketlink.idm.model.basic.User;

@Singleton
@Startup
public class IdmConfig {
		
	@Inject
	private IdentityManager identityManager;
	
	@Inject 
	private RelationshipManager relationshipManager;

	public IdmConfig() {
		System.out.println("IdmConfig()...");
	}

	@PostConstruct
	public void create() {
		
		User admin = BasicModel.getUser(identityManager, "admin");
		
		if(admin == null) {
			//Create admin types
			Role adminRole = new Role("admin");
			Group adminGroup = new Group("admin");		
			User adminUser = new User("admin");
			Password password = new Password("Admin123");
			
			identityManager.add(adminRole);
			identityManager.add(adminGroup);
			identityManager.add(adminUser);
			identityManager.updateCredential(adminUser, password);
			
			BasicModel.grantRole(relationshipManager, adminUser, adminRole);
			BasicModel.grantRole(relationshipManager, adminGroup, adminRole);
			BasicModel.addToGroup(relationshipManager, adminUser, adminGroup);
						
		}				
	}

}