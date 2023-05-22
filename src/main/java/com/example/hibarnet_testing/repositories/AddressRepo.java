package com.example.hibarnet_testing.repositories;

import com.example.hibarnet_testing.domain.Address;
import org.springframework.data.repository.CrudRepository;

public interface AddressRepo extends CrudRepository<Address,Long> {
}
