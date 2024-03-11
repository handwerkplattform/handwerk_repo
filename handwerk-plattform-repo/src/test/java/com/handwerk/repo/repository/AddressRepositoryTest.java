package com.handwerk.repo.repository;

import com.handwerk.repo.model.Address;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


public class AddressRepositoryTest extends PostgreSQLRepoTest {

	@Autowired
	AddressRepository addressRepository;

	@Test
	void findAllAddresses() {
		List<Address> addressList = addressRepository.findAll();
		assertThat(addressList).isEmpty();
	}
}
