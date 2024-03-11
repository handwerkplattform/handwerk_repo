package com.handwerk.repo.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "ADDRESS")
public class Address {

	@Column(name = "id")
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "add_gen")
	@SequenceGenerator(name = "add_gen", sequenceName = "add_id_seq")
	private Long id;

	@Column(name = "country")
	private String country;

	@Column(name = "city")
	private String city;

	@Column(name = "street_name")
	private String streetName;

	@Column(name = "street_nr")
	private String streetNr;

	@Column(name = "postcode")
	private String postcode;

	@Column(name = "creation_date")
	private LocalDateTime creationDate;

	@Column(name = "modification_date")
	private LocalDateTime modificationDate;

}
