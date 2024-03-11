package com.handwerk.repo.repository;

import com.handwerk.repo.model.Master;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


public class MasterRepositoryTest extends PostgreSQLRepoTest {

	@Autowired
	MasterRepository masterRepository;

	@Test
	void findAllMasters() {
		List<Master> addressList = masterRepository.findAll();
		assertThat(addressList).isEmpty();
	}
}
