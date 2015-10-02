package com.pixisolutions.pixiframework.domains.acl;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by sanjoy on 10/2/15.
 */
@Entity
public class Permission {
    @Id
    private String id;
    private String name;
    private String description;

    public String getId() {
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
