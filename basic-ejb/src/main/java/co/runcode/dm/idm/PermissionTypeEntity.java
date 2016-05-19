package co.runcode.dm.idm;

import org.picketlink.idm.jpa.annotations.OwnerReference;
import org.picketlink.idm.jpa.annotations.PermissionOperation;
import org.picketlink.idm.jpa.annotations.PermissionResourceClass;
import org.picketlink.idm.jpa.annotations.PermissionResourceIdentifier;
import org.picketlink.idm.jpa.annotations.entity.PermissionManaged;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * <p>A simple entity mapping for permissions.</p>
 *
 * @author Pedro Igor
 */
@Entity
@PermissionManaged
public class PermissionTypeEntity {

    @Id
    @GeneratedValue
    private Long id;

    @OwnerReference
    private String assignee;

    @PermissionResourceClass
    private String resourceClass;

    @PermissionResourceIdentifier
    private String resourceIdentifier;

    @PermissionOperation
    private String operation;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAssignee() {
        return assignee;
    }

    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }

    public String getResourceClass() {
        return resourceClass;
    }

    public void setResourceClass(String resourceClass) {
        this.resourceClass = resourceClass;
    }

    public String getResourceIdentifier() {
        return resourceIdentifier;
    }

    public void setResourceIdentifier(String resourceIdentifier) {
        this.resourceIdentifier = resourceIdentifier;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }
}

