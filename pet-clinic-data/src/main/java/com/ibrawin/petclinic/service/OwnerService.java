package com.ibrawin.petclinic.service;

import com.ibrawin.petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
