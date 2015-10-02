package com.pixisolutions.pixiframework.domains.acl;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Collection;
import java.util.HashSet;

/**
 * Created by sanjoy on 10/2/15.
 */
@Entity
public class Role {
    @Id
    private String id;
    private String name;
    @OneToMany(targetEntity = Permission.class)
    private Collection<Permission> permissions;

    public Role(){
        permissions = new HashSet<Permission>();
    }

    public String getId(){
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Collection<Permission> getPermissions() {
        return permissions;
    }

    public void addPermission(Permission permission) {
        this.permissions.add(permission);
    }

    public void removePermission(Permission permission) {
        this.permissions.remove(permission);
    }


}
