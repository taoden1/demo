/*
 * Created on 2018-10-02 ( Date ISO 2018-10-02 - Time 12:09:08 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 3.0.0
*/
package org.demo.service;



import java.util.List;

import javax.transaction.Transactional;

import org.demo.entity.Addresses;
import org.demo.repository.AddressesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class AddressesServiceImpl implements AddressesService {

	@Autowired
	private AddressesRepository addressesRepository;

	@Override
	public Addresses getOne(Integer addressId) {
		return addressesRepository.findById(addressId).get();
	}

	@Override
	public Boolean delete(Integer addressId) {
		if (addressesRepository.getOne(addressId) != null) {
			addressesRepository.deleteById(addressId);
			return true;
		}
		return false;
	}

	@Override
	public Addresses create(Addresses addresses) {
		return addressesRepository.save(addresses);
	}

	@Override
	public Addresses update(Addresses addressesToUpdate) {
						Addresses addresses = addressesRepository.getOne(addressesToUpdate.getAddressId());
																																														
		
				if(addressesToUpdate.getUniversityAccomodationYn() !=null) {
			
		}
				if(addressesToUpdate.getLine1NumberBuilding() !=null) {
			
		}
				if(addressesToUpdate.getLine2NumberStreet() !=null) {
			
		}
				if(addressesToUpdate.getLine3AreaLocality() !=null) {
			
		}
				if(addressesToUpdate.getCity() !=null) {
			
		}
				if(addressesToUpdate.getZipPostcode() !=null) {
			
		}
				if(addressesToUpdate.getStateProvinceCounty() !=null) {
			
		}
				if(addressesToUpdate.getCountry() !=null) {
			
		}
				if(addressesToUpdate.getOtherAddressDetails() !=null) {
			
		}
				return addressesRepository.save(addresses);
	}

	@Override
	public Boolean exist(Addresses addresses) {
						return addressesRepository.existsById(addresses.getAddressId());
																																													}

	@Override
	public List<Addresses> findAll() {
		return addressesRepository.findAll();
	}

}

