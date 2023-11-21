package com.ibrawin.petclinic.service;

import com.ibrawin.petclinic.model.Owner;

public interface OwnerService {

    Owner findByLastName(String lastName);
}
