package com.handwerk.repo;

import com.handwerk.repo.model.Address;
import com.handwerk.repo.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/address")
public class AddressController {

	@Autowired
	AddressRepository addressRepository;

	@GetMapping()
	@ResponseBody
	public ResponseEntity<List<Address>> getAllMarketplaces() {
		List<Address> addressList = addressRepository.findAll();
		return ResponseEntity.ok().body(addressList);
	}
}
