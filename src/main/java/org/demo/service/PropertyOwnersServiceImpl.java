/*
 * Created on 2018-10-02 ( Date ISO 2018-10-02 - Time 12:09:08 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 3.0.0
*/
package org.demo.service;



import java.util.List;

import javax.transaction.Transactional;

import org.demo.entity.PropertyOwners;
import org.demo.repository.PropertyOwnersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class PropertyOwnersServiceImpl implements PropertyOwnersService {

	@Autowired
	private PropertyOwnersRepository propertyOwnersRepository;

	@Override
	public PropertyOwners getOne(Integer landlordId) {
		return propertyOwnersRepository.findById(landlordId).get();
	}

	@Override
	public Boolean delete(Integer landlordId) {
		if (propertyOwnersRepository.getOne(landlordId) != null) {
			propertyOwnersRepository.deleteById(landlordId);
			return true;
		}
		return false;
	}

	@Override
	public PropertyOwners create(PropertyOwners propertyOwners) {
		return propertyOwnersRepository.save(propertyOwners);
	}

	@Override
	public PropertyOwners update(PropertyOwners propertyOwnersToUpdate) {
						PropertyOwners propertyOwners = propertyOwnersRepository.getOne(propertyOwnersToUpdate.getLandlordId());
																		
				if(propertyOwnersToUpdate.getLandlordName() !=null) {
			
		}
				if(propertyOwnersToUpdate.getDateFirstRental() !=null) {
			
		}
				if(propertyOwnersToUpdate.getOtherLandlordDetails() !=null) {
			
		}
				return propertyOwnersRepository.save(propertyOwners);
	}

	@Override
	public Boolean exist(PropertyOwners propertyOwners) {
						return propertyOwnersRepository.existsById(propertyOwners.getLandlordId());
																	}

	@Override
	public List<PropertyOwners> findAll() {
		return propertyOwnersRepository.findAll();
	}

}


