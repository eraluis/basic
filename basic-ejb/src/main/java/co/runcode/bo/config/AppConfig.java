package co.runcode.bo.config;

import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.picketlink.annotations.PicketLink;

public class AppConfig {
	
	@PersistenceContext(unitName = "idmPU")
	private EntityManager em;
	
	@Produces
	@PicketLink
	public EntityManager getPicketLinkEntityManager() {
		return em;
	}
	
}

