package com.pixisolutions.pixiframework.services;

import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

/**
 * Created by sanjoy on 10/2/15.
 */
@Service
public class DefaultService {

//    @Secured({"ROLE_ADMIN"})
//    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public String getName(){
        return "Sanjoy k Mitra";
    }
}
