package co.runcode.dm.idm;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Permission {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String action;
	private String resource;
	private String urlResource;
	
	@ManyToOne
    @JoinColumn(name = "parent_permission")
	private Permission parent;
	
	public Permission() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public String getResource() {
		return resource;
	}

	public void setResource(String resource) {
		this.resource = resource;
	}

	public String getUrlResource() {
		return urlResource;
	}

	public void setUrlResource(String urlResource) {
		this.urlResource = urlResource;
	}

}
