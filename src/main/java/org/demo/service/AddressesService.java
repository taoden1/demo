/*
 * Created on 2018-10-02 ( Date ISO 2018-10-02 - Time 12:02:34 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 3.0.0
*/
package org.demo.service;

import org.demo.entity.Addresses;
import java.util.List;

public interface AddressesService {

	public Addresses getOne(Integer addressId);

	public List<Addresses> findAll();

	public Boolean delete(Integer addressId);

	public Addresses create(Addresses addresses);

	public Addresses update(Addresses addresses);

	public Boolean exist(Addresses addresses);
}