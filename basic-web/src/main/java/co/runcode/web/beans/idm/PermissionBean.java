package co.runcode.web.beans.idm;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;

import co.runcode.bo.idm.PermissionLBO;
import co.runcode.dm.idm.Permission;

@ManagedBean
@SessionScoped
public class PermissionBean {
	
	private List<Permission> permissionList;
	private Permission selected;
	
	@Inject 
	PermissionLBO permissionLBO;
	
	public PermissionBean(){
		
	}
	
	@PostConstruct
	public void init(){
		permissionList = permissionLBO.findAll();
		selected = new Permission();
		// @TODO Call BO and look for default permission 
		selected.setAction("read");
		selected.setResource("Home");
		selected.setUrlResource("/app/content/home.xhtml");
	}
	
	public String select(Permission permission){
		System.out.println("PermissionBean.select()");
		this.selected = permission;
		return null;
	}
	

	public List<Permission> getPermissionList() {
		return permissionList;
	}

	public void setPermissionList(List<Permission> permissionList) {
		this.permissionList = permissionList;
	}

	public Permission getSelected() {
		return selected;
	}

	public void setSelected(Permission selected) {
		this.selected = selected;
	}

}
