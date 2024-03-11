package com.handwerk.repo.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "CUSTOMER")
public class Customer {

	@Column(name = "id")
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cust_gen")
	@SequenceGenerator(name = "cust_gen", sequenceName = "cust_id_seq")
	private Long id;

	@Column(name = "name")
	private String name;

	@Column(name = "second_name")
	private String secondName;

	@Column(name = "photo_src")
	private String photoSrc;

	@Column(name = "type")
	private String type;

	@Column(name = "creation_date")
	private LocalDateTime creationDate;

	@Column(name = "modification_date")
	private LocalDateTime modificationDate;

	@Column(name = "active")
	private Boolean active = true;

	@OneToMany(mappedBy = "employer", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
	@JsonIgnoreProperties("employer")
	@JsonBackReference
	private Set<Employee> employees = new HashSet<>();

}
